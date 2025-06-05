package com.zero.spring.sce_java.models;

public class Users {
    private String username, names, surnames, email;
    private String created_at, updated_at, last_login;

    public Users(String username, String names, String surnames, String email, String created_at, String updated_at,
            String last_login) {
        this.username = username;
        this.names = names;
        this.surnames = surnames;
        this.email = email;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.last_login = last_login;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getLast_login() {
        return last_login;
    }

    public void setLast_login(String last_login) {
        this.last_login = last_login;
    }

}
