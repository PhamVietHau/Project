package repository;

import entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = "select u.username, r.role from user as u join role as r on u.roleId = r.id where u.username =?1",nativeQuery = true)
    public User findUserByName(String name);
}
