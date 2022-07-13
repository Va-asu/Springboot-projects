package com.example.Blog.Repository;

import com.example.Blog.Model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepo extends MongoRepository<Blog,String> {
    Blog findByTitle(String title);
}
