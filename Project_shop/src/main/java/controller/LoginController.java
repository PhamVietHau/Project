package controller;

import entity.Role;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import service.ProductService;
import service.RoleService;
import service.UserService;

import java.net.HttpCookie;
import java.security.Principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;
   @Autowired
   private RoleService roleService;

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
        Map<Integer, String> map = new HashMap<>();
        List<Role> roles =roleService.allRole();
        for (Role i: roles){
            map.put(i.getId(), i.getRole());
        }
        model.addAttribute("roles", map);
        model.addAttribute("user", new User());
        return "regist";
    }


    @RequestMapping(value = "addUser")
    public String add(@ModelAttribute User user) throws ParseException {
        LocalDateTime localDateTime = LocalDateTime.now();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String datetime = myFormatObj.format(localDateTime);
        Date date = format.parse(datetime);
        user.setTimeCreate(date);
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userService.save(user);
        return "redirect:user";
    }
}
