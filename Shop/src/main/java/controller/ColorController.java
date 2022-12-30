package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.ColorService;

@RestController
public class ColorController {
    @Autowired
    private ColorService colorService;

    @RequestMapping(value = "/color",method = RequestMethod.GET)
    public Object getAll() {
        return colorService.getAll();
    }



}
