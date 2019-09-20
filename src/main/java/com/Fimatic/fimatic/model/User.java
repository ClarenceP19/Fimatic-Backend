package com.Fimatic.fimatic.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "username",nullable = false,unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "age")
    private int age;

//    @Column(name = "spending")
//    private double spending;
//
//    @Column(name = "saving")
//    private double saving;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
