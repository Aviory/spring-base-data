package com.example.springboot.controllers;

import com.example.springboot.models.MessageModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserSettingController {
    @GetMapping("/setting")
    public String setting() {
        System.out.println("фыпфы");
        return "setting";
    }

    @PostMapping("/setting")
    public String settings(@RequestBody String reqest,Model model) {
        String[] ar = reqest.split("&");

        int a = Integer.parseInt(ar[0].replace("txt=",""));
        int b = Integer.parseInt(ar[1].replace("age=",""));
        System.out.println(reqest);
        if (!reqest.isEmpty())
            model.addAttribute("message", "result = "+(a + b));
        return "setting";
    }

}
