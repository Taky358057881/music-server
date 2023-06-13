package com.example.demo.controller;

import com.example.demo.common.ErrorMessage;
import com.example.demo.common.SuccessMessage;
import com.example.demo.service.impl.AdminServiceImpl;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class AdminController {
    @Autowired
    private AdminServiceImpl adminService;

    // 判断是否登陆成功
    @ResponseBody
    @RequestMapping(value = "/admin/login/status", method = RequestMethod.POST)
    public Object loginStatus(HttpServletRequest req, HttpSession session){
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        boolean res = adminService.veritypasswd(name, password);
        if(res){
            session.setAttribute("name", name);
            return new SuccessMessage<Null>("登陆成功").getMessage();
        }else{
            return new ErrorMessage("用户名或密码错误").getMessage();
        }
    }
}
