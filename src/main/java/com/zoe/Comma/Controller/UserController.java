package com.zoe.Comma.Controller;

import com.zoe.Comma.Entity.UserEntity;
import com.zoe.Comma.Repository.UserRepository;
import com.zoe.Comma.Service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;
    // 호출할 때 Autowired 써서 의존성 주입 필요 !!
    @Autowired
    private UserService userService;

    // 로그인 화면
    @GetMapping("/user/login")
    public String user_user(HttpSession session, Model model){
        model.addAttribute("main_content", "user/login");
        return "main";
    }

    // 로그인 기능
    @PostMapping("/user/login")
    public String user_login(HttpSession session, Model model,
                             @RequestParam String USER_ID, @RequestParam String USER_PWD)
    {
        // 로그인 시도
        if(userService.LoginCheck(USER_ID, USER_PWD))
        {
            session.setAttribute("USER_ID", USER_ID);
            model.addAttribute("main_content", "main/home");
        }
        else{
            model.addAttribute("main_content", "user/login");
            return "main";
        }
        return "redirect:/";
    }

    // 로그아웃
    @PostMapping("/user/logout")
    public String user_logout(HttpServletRequest request, Model model)
    {
        HttpSession session = request.getSession();
        session.invalidate();
        model.addAttribute("main_content", "main/home");
        return "redirect:/";
    }

    // 회원가입
    @GetMapping("/user/join")
    public String user_join(Model model){
        model.addAttribute("main_content", "user/join");
        return "main";
    }

    // 회원가입 기능
    @PostMapping("/user/save")
    public String user_save(HttpServletRequest request, UserEntity user
                            , @RequestParam String userId, @RequestParam String userPwd){
    // UserDTO에서 Entity에 넣어준 값을 바로 넣을 수 있음!

        HttpSession session = request.getSession();
//        session.setAttribute("USER_ID", userId);
//        session.setAttribute("USER_PWD", userPwd);
        userRepository.save(user);
        return "redirect:/user/login";
    }
}
