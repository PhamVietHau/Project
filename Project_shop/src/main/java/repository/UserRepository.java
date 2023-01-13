package repository;

import entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = "select userName, role from user,role where role.id = user.id and userName=?",nativeQuery = true)
    public User findUserByName(String name);
}
