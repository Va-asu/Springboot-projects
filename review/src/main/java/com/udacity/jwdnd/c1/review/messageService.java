package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class messageService {
    private String str;

    public messageService(String message){
        str=message;
    }

    public String uppercase(){
        return str.toUpperCase();
    }

    public String lowercase(){
        return str.toLowerCase();
    }

    @PostConstruct
    public void postConstructor(){
        System.out.println("Creating MessageService bean");
    }
}
