package com.example.bootJPA.controller;

import com.example.bootJPA.Model.Alien;
import com.example.bootJPA.Repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;
import java.util.Optional;


@RestController
public class homeController {

    @Autowired
    AlienRepository alienInstance;

    @RequestMapping("/")
    public ModelAndView home()
    {
        ModelAndView mv=new ModelAndView("home.jsp");
        return mv;
    }

    //Get alien from ID according to user input
    @RequestMapping("/alien/{id}")
    //@ResponseBody
    public Optional<Alien> fetchAlien(@PathVariable("id") int id)
    {
        return alienInstance.findById(id);
    }

    //Add alien method
    //@PostMapping(path = "/addAlien",consumes ={"application/json"} )
    @PostMapping("/alien")
    //@RequestBody to get alien in any format
    public Alien addAlien( Alien alien)
    {
        alienInstance.save(alien);
        return alien;
    }

    //delete an entry
    @DeleteMapping("/alien/{id}")
    public String deleteAlien(@PathVariable  int id)
    {
        Alien a=alienInstance.getReferenceById(id);
        //System.out.println(a.toString());
        alienInstance.delete(a);
        return "Deleted";
    }

    @PutMapping("/alien")
    public Alien saveOrUpdate( Alien alien)
    {
        alienInstance.save(alien);
        return alien;
    }

    //Get all the aliens
    //@RequestMapping(path="/aliens",produces = {"application/xml"})
    //    by doing this we have restricted the List to be in XML format now it will not going to be in JSON format
    //    @ResponseBody
    @GetMapping(path = "/aliens")
    public List<Alien> getAlien()
    {
       return alienInstance.findAll();
    }
    //Get alien by ID
    @GetMapping("/alien/102")
    //@ResponseBody
    public Optional<Alien> getAlienById()
    {
        return alienInstance.findById(102);
    }


}
