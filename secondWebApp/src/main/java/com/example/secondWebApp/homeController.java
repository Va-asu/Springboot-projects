package com.example.secondWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class homeController {

    @RequestMapping("home")
    //taking object as the data from client
    public ModelAndView  home(Alien alien){
        System.out.println(alien.getName());
        ModelAndView mv=new ModelAndView();
        mv.addObject("obj",alien);
        mv.setViewName("home");
        return mv;
    }
    /***
    public ModelAndView  home(@RequestParam(name="name")String MyName){
        System.out.println(MyName);
        ModelAndView mv=new ModelAndView();
        mv.addObject("name",MyName);
        mv.setViewName("home");
        return mv;
    }
    ***/


/***
    public String home(@RequestParam("name") String MyName, HttpSession session){
        System.out.println(MyName);
        session.setAttribute("name",MyName);
        return "home";
    }
***/


    /***
     * one way to achieve the access to data
    public String home(HttpServletRequest req){
        HttpSession session=req.getSession();
        String name=req.getParameter("name");
        System.out.println("hi "+name);
        session.setAttribute("name",name);
        return "home";
    }
    ***/
}
