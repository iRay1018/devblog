package com.atguigu.web;

import com.atguigu.dao.LoginMapper;
import com.atguigu.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author sun
 * @date 2022/9/16 0:38
 */

@Controller
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    LoginMapper loginMapper;
    @PostMapping("/index")
    public String index(User user, Model model){
        model.addAttribute("user",user);
        loginMapper.insert(user);
        return "login";
    }
}
