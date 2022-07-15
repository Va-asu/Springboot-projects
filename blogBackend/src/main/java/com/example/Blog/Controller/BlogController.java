package com.example.Blog.Controller;

import com.example.Blog.Model.Blog;
import com.example.Blog.Service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//springboot and react both app are running at different port to no data will be shown
// to connect react and show data we have to provide CrossOrigin annotation
@CrossOrigin(origins = "*")
@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/blog")
    public List<Blog> getAll()
    {
        return blogService.findall();
    }

    @GetMapping("/blog/{id}")
    public Optional<Blog> findById(@PathVariable String id)
    {
        Optional<Blog> blog=blogService.findById(id);
        return blog;
    }

    @PutMapping("/update")
    public String update(@RequestBody Blog blog)
    {
       return blogService.update(blog);
    }

    @PostMapping("/add")
    public Blog create(@RequestBody Blog blog)
    {
        blog.setId(UUID.randomUUID().toString());
        System.out.println(blog);
        return blogService.create(blog);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id)
    {
        return blogService.delete(id);
    }
}
