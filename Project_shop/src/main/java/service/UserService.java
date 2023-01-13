package service;

import entity.User;

import java.util.List;

public interface UserService {
    public List<User> all();
    public void delete(int id);
    public void save(User user);
    public User findUser(String name);
}
