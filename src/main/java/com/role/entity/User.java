package com.role.entity;

public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    private String job;

    public User() {
    }

    public User(String username, String password, String email, String job) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.job = job;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getJob() {
        return job;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
