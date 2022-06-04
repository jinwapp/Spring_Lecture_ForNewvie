package com.example.firstproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/hi")
    public String method(Model model){
        model.addAttribute("username","sohee and jinwoo");
        return "greetings"; //templates/greetings.mustache를 브라우저로 반환
    }
    @GetMapping("/bye")
    public String goodbye(Model model){
        model.addAttribute("nickname","jinwoo, sohee");
        return "goodbye";
    }
}
