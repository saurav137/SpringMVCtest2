package com.stackroute;

import com.stackroute.services.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Config {
    @RequestMapping ("/add")
    public ModelAndView add(HttpServletRequest request){
        String name=request.getParameter("t1");
        user User=new user(name);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("display");
        modelAndView.addObject("Value",User);
      return modelAndView;
    }

}
