package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AmountRepository;
import repository.UserRepository;

@Service
public class UserServiceIpm implements UserService{
    @Autowired
    private UserRepository userRepository;
}