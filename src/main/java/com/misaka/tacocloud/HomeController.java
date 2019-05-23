package com.misaka.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: 汤滨
 * @Version: 1.0
 * @Date: 2019/5/23
 * @Description: chp1 HomeController
 **/
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
