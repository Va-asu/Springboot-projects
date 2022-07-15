package com.example.Blog.Service;

import com.example.Blog.Model.Blog;
import com.example.Blog.Repository.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImp implements  BlogService{

    @Autowired
    private BlogRepo blogRepo;

    @Override
    public Blog create(Blog blog) {
        return blogRepo.save(blog);
    }

    @Override
    public String delete(String id) {
        Optional<Blog> blog= blogRepo.findById(id);
        blogRepo.delete(blog.get());
        return "Deleted";
    }

    @Override
    public String update(Blog blog) {
        blogRepo.save(blog);
        return "Updated";
    }

    @Override
    public List<Blog> findall() {
        return blogRepo.findAll();
    }

    @Override
    public Optional<Blog> findById(String id) {
        return blogRepo.findById(id);
    }
}
