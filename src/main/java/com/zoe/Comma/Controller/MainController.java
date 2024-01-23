package com.zoe.Comma.Controller;

import com.zoe.Comma.Entity.UserEntity;
import com.zoe.Comma.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String main_main(Model model){
        model.addAttribute("main_content", "main/home");
        return "main";
    }
}
