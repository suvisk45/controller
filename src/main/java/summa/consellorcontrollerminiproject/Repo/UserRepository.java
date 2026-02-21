package summa.consellorcontrollerminiproject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import summa.consellorcontrollerminiproject.Entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // username is unique → return single object
    UserEntity findByUsername(String username);

    UserEntity findByUsernameAndPassword(String username, String password);

    boolean findUserByUsername(String username);
}
