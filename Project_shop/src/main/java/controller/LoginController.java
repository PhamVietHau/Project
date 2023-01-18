package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ProductService;
import service.UserService;

import java.security.Principal;
@Controller
public class LoginController {
    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "login")
    public String login(){
        return "login";
    }




//    @RequestMapping(value = "check")
//    public String check( Principal principal) throws  Exception{
//        String name = principal.getName();
//        User u= userService.findUser(principal.getName());
//        if(u.getRole().getRole().equalsIgnoreCase("ROLE_ADMIN")) {
//            return "redirect:admin";
//        } else{
//            return "redirect:user";
//        }
//    }





    @RequestMapping(value = "user")
    public String user (Model model, Principal principal){
        String name = principal.getName();
        model.addAttribute("username",name);
        model.addAttribute("products", productService.all());
        model.addAttribute("productShirt",productService.findShirtsAndCoats());
        model.addAttribute("productPants",productService.findPants());
        model.addAttribute("shop",productService.allDescId());
        return "user";
    }

    @RequestMapping(value = "admin")
    public String admin(Model model, Principal principal){
        String name = principal.getName();
        return "admin";
    }


    @RequestMapping(value = "regist")
    public String requestRegist(Model model){
        model.addAttribute("user", new User());
        return "regist";
    }


    @RequestMapping(value = "addUser")
    public String add(@ModelAttribute User user ){
        userService.save(user);
        return "redirect:user";
    }
}
