package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
@RequestMapping(value = "save")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "requestAdd", method = RequestMethod.POST)
    public Object regist(@RequestBody User user){
        return userService.saveU(user);
    }

}
