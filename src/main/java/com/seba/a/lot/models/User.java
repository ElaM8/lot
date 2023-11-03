package com.seba.a.lot.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_id;
    private String first_name;
    private String last_name;

    private String email;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return first_name + " " + last_name;
    }

    public String toString() {
        return "User{" +
                "id=" + user_id +
                ", first name='" + first_name + '\'' +
                ", last name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}