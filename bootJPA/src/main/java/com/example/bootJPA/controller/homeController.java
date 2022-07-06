package com.example.bootJPA.controller;

import com.example.bootJPA.Model.Alien;
import com.example.bootJPA.Repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class homeController {

    @Autowired
    AlienRepository alienInstance;

    @RequestMapping("/")
    public String home()
    {


        return "home.jsp";
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien)
    {
        System.out.println(alien.toString());
        alienInstance.save(alien);
        return "home.jsp";
    }

    @RequestMapping("/fetchAlien")
    public ModelAndView addAlien(@RequestParam int id)
    {
        ModelAndView mv=new ModelAndView();
        Alien alien=alienInstance.findById(id).orElse(null);
        mv.addObject(alien);
        mv.setViewName("showData.jsp");
        return mv;
    }
}
