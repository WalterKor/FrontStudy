package com.koreait.Crawring.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class mainController {

    @GetMapping("/hello")
    public void hello(){}


}
