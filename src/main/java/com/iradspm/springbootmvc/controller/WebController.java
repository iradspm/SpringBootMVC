package com.iradspm.springbootmvc.controller;

import com.iradspm.springbootmvc.UsersData.usersData;
import com.iradspm.springbootmvc.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WebController {
    @RequestMapping("/")
    public String getHomePage(Model model)
    {
        usersData us=new usersData();
        List<Users> listOfUsers=us.getUsersList();
        model.addAttribute("users_list",listOfUsers);
        return "index"; //static index page in templates directory
    }
}
