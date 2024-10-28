package com.example.demo;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLogin() {
        return new ModelAndView("login", "loginBean", new Bean());
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    
    public ModelAndView validateUser(@ModelAttribute("loginBean") Bean loginBean) {
        ModelAndView mav = new ModelAndView();
        if ("Pisya Gayatri".equals(loginBean.getUsername()) && "12345".equals(loginBean.getPassword())) {
            mav.setViewName("welcome");
            mav.addObject("username", loginBean.getUsername());
        } else {
            mav.setViewName("login");
            mav.addObject("error", "Invalid username or password, Try Again...!");
        }
        return mav;
    }
}