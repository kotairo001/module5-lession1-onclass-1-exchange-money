package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Exchange {
    @GetMapping("/result")
    public String exchangeMoney (@RequestParam float usd, Model model){
        float vnd = usd * 23000;
        model.addAttribute("result", vnd);
        return "result";
    }
    @GetMapping("/exchange-form")
    public String exchangeMoney (){
        return "exchange-form";
    }

}
