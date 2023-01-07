package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.OrderDetailService;
import service.ProductService;
import service.ProductTypeService;
import service.StatusService;

@Controller
public class HomeController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductTypeService productTypeService;
    @Autowired
    private StatusService statusService;
    @Autowired
    private OrderDetailService orderDetailService;

    @RequestMapping(value = {"/","home"}, method = RequestMethod.GET)
    public String home(Model model){
//        List<Product> products = productService.getAll();
//        model.addAttribute("products",products);

        return "home";
    }

}
