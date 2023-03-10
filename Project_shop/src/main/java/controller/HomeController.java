package controller;

import entity.Searching;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ProductService;

import java.security.Principal;

@Controller

public class HomeController {
    @Autowired
    private ProductService productService;
    @RequestMapping(value = {"/","home"})
    public String home ( Model model){
        Searching searching = new Searching();
        model.addAttribute("searching",searching);
        model.addAttribute("products", productService.all());
        model.addAttribute("productShirt",productService.findShirtsAndCoats());
        model.addAttribute("productPants",productService.findPants());
        model.addAttribute("shop",productService.allDescId());
        return "Home";
    }

}
