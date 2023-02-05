package controller;

import entity.Product;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HttpServletBean;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "cart")
public class CartController {

    @RequestMapping(value = "/")
    public String cart(HttpServletRequest request, Model model){

        List<Product> products = response.g;

        model.addAttribute()
        return "cart";
    }
    @RequestMapping(value = "add")
    public String add(){
        return "cart";
    }
}
