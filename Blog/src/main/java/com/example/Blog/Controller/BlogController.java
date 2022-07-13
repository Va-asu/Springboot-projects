package com.example.Blog.Controller;

import com.example.Blog.Model.Blog;
import com.example.Blog.Service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/All")
    public List<Blog> getAll()
    {
        return blogService.findall();
    }

    @GetMapping("/{title}")
    public Blog findByTitle(@PathVariable String title)
    {
        Blog blog=blogService.findByTitle(title);
        return blog;
    }

    @PutMapping("/")
    public String update(@RequestBody Blog blog)
    {
       return blogService.update(blog);
    }

    @PostMapping("/")
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
