package controller;

import entity.Searching;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.AmountService;
import service.ProductService;
import service.SizeService;

@Controller
public class SearchController {
    @Autowired
    private ProductService productService;
    @Autowired
    private SizeService sizeService;
    @Autowired
    private AmountService amountService;

    @RequestMapping(value = "searchProduct")
    public String search(@ModelAttribute Searching searching, Model model){
        model.addAttribute("products", productService.findProductByName(searching.getKeyword()));
//        model.addAttribute("products", productService.all());
        return "SearchPage";
    }
}
