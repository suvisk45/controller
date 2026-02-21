package summa.consellorcontrollerminiproject.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class UserEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<CallerEntity> callers;

}
