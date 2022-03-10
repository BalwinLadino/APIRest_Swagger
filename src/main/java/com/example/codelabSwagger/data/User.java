package com.example.codelabSwagger.data;
import com.example.codelabSwagger.dto.UserDto;

import java.util.Date;

public class User
{

    private String id;
    private String name;
    private String email;
    private String lastName;
    private Date createdAt;

    public User() {
    }

    public User(String id, String name, String email, String lastName, Date createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt = createdAt;
    }

    public User(UserDto userDto) {
        this (userDto.getName(), userDto.getLastName(), userDto.getEmail() );
    }

    public User(String name, String lastName, String email) {
        this.name = name;
        this.email = email;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}



