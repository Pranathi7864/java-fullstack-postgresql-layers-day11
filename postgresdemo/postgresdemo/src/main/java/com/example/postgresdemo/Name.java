package com.example.postgresdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.GetMapping;

@Entity

public class Name {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    public Name()
    {}
    public Name(String name)
    {
        this.name=name;
    }
    public Long getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }

}
