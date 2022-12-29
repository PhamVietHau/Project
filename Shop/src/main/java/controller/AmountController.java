package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AmountService;

@RestController
@RequestMapping(value = "amount")
public class AmountController {
    @Autowired
    private AmountService amountService;

    @RequestMapping(value = "all")
    public Object getAll() {
        return amountService.getAll();
    }
}
