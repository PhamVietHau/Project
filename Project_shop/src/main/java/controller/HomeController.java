package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ProductService;

@Controller
public class HomeController {
    @Autowired
    private ProductService productService;



    @RequestMapping(value = "/")
    public String home (Model model){
        model.addAttribute("products", productService.all());
        model.addAttribute("productShirt",productService.findShirtsAndCoats());
        model.addAttribute("productPants",productService.findPants());
        model.addAttribute("shop",productService.allDescId());
        return "Home";
    }
}
