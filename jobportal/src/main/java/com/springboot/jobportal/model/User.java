package com.springboot.jobportal.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = true)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AuthProvider authProvider;

    public enum AuthProvider{
        LOCAL, GOOGLE
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    public enum Role{
        APPLICANT, ADMIN
    }

    public User(){}

    public User(String name, String email, String password, AuthProvider authProvider, Role role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.authProvider = authProvider;
        this.role = role;
    }

    public User(String name, String email, AuthProvider authProvider, Role role) {
        this.name = name;
        this.email = email;
        this.password = null;
        this.authProvider = authProvider;
        this.role = role;
    }

    
}
