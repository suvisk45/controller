package summa.consellorcontrollerminiproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import summa.consellorcontrollerminiproject.Dto.LoginDto;
import summa.consellorcontrollerminiproject.Dto.RegsiterDto;
import summa.consellorcontrollerminiproject.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController
{
    @Autowired
    UserService userService;

    @PostMapping("/doLogin")
    public ResponseEntity<String> doLogin(@RequestBody LoginDto loginDto)
    {
       String message= userService.checkUser(loginDto.getUsername(),loginDto.getPassword());
       if(message.equals("User exists"))
       {
           return ResponseEntity.ok("User exists");
       }
       return new ResponseEntity<>("User name not exsisted",HttpStatus.UNAUTHORIZED);
    }
    @PostMapping("/doRegister")
    public ResponseEntity<String> doRegsiter(@RequestBody RegsiterDto regsiterDto)
    {
       String msg= userService.registerUser(regsiterDto.getUserName(), regsiterDto.getPassword());

       return  ResponseEntity.ok(msg);
    }
}
