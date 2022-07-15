package com.example.Blog.Repository;

import com.example.Blog.Model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlogRepo extends MongoRepository<Blog,String> {
    Optional<Blog> findById(String title);
}
