package summa.consellorcontrollerminiproject.Mapper;

import summa.consellorcontrollerminiproject.Dto.CallerDto;
import summa.consellorcontrollerminiproject.Entity.CallerEntity;

public class CallerMapper
{
    public CallerDto callerEntityToDto(CallerEntity callerEntity)
    {
        CallerDto callerDto = new CallerDto();
        callerDto.setUsername(callerEntity.getUsername());
        callerDto.setMode(callerEntity.getMode());
        callerDto.setCourse(callerEntity.getCourse());
        callerDto.setPhoneNumber(callerEntity.getPhoneNumber());
        return callerDto;
    }
    public CallerEntity callerDtoToEntity(CallerDto callerDto)
    {
        CallerEntity callerEntity = new CallerEntity();
        callerEntity.setUsername(callerDto.getUsername());
        callerEntity.setMode(callerDto.getMode());
        callerEntity.setCourse(callerDto.getCourse());
        callerEntity.setPhoneNumber(callerDto.getPhoneNumber());
        return callerEntity;
    }
}
