package com.example.gittest.controllor;

import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class gitControllor {

    @RequestMapping("/say")
    public String say(){
        return "new git project";
    }
}
