package com.elimu.portal.identity.model;

public class User {
    private String id;
    private String email;
    private String role;

    public User(String id, String email, String role) {
        this.id = id;
        this.email = email;
        this.role = role;
    }

    public String getId() { return id; }
    public String getEmail() { return email; }
    public String getRole() { return role; }

    public void setId(String id) { this.id = id; }
    public void setEmail(String email) { this.email = email; }
    public void setRole(String role) { this.role = role; }
}
