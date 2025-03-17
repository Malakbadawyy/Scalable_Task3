package com.example.Task_3.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users") // Maps this class to the "users" collection in MongoDB
public class User {

    @Id // Marks `id` as the primary key
    private String id;

    private String username;
    private String email;

    public User() {}

    // Constructor that allows MongoDB to auto-generate the ID
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }


    public User(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
