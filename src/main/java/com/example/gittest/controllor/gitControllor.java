package com.example.gittest.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class gitControllor {

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "new git project";
    }
}
