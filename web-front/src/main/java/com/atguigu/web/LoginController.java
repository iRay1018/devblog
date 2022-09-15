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
 * @date 2022/9/15 23:29
 */


@Controller
@RequestMapping("/login")
public class LoginController {

    private static final String PAGE_INDEX = "frame/index";
    @Autowired
    LoginMapper loginMapper;
    @PostMapping("/index")
    public String index(User user, Model model){
        User checkUser = loginMapper.checkUser(user);
        if (checkUser == null ){
            model.addAttribute("message","请输入正确的用户名和密码");
            return "login";
        }
        return  PAGE_INDEX;
    }
}
