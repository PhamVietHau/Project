package service;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.List;

@Service
public class UserServiceIpm implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> all() {
        return (List<User>) userRepository.findAll();

    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);

    }

    @Override
    public void save(User user) {
        userRepository.save(user);

    }
    @Override
    public User findUser(String name){
        return userRepository.findUserByName(name);
    }


}
