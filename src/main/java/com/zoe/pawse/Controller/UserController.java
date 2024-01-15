package com.zoe.pawse.Controller;

import com.zoe.pawse.Entity.UserEntity;
import com.zoe.pawse.Repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.PipedOutputStream;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    // 로그인
    @GetMapping("/user/login")
    public String user_user(Model model){
        model.addAttribute("main_content", "user/login");
        return "main";
    }

    // 회원가입
    @GetMapping("/user/join")
    public String user_join(Model model){
        model.addAttribute("main_content", "user/join");
        return "main";
    }

    // 회원가입 기능
    @PostMapping("/user/save")
    public String user_save(HttpServletRequest request, UserEntity user){
        System.out.println(user.toString());
        UserEntity userEntity = UserEntity.builder()
                .USER_ID(user.getUSER_ID())
                .USER_PWD(user.getUSER_PWD())
                .NAME(user.getNAME())
                .PHONE(user.getPHONE())
                .EMAIL(user.getEMAIL())
                .ADDRESS(user.getADDRESS())
                .POST_CODE(user.getPOST_CODE())
                .build();

        userRepository.save(user);
        return "redirect:/user/login";
    }
}
