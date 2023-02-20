package com.tawhid.crudusingspringbootreactjs.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id

    @SequenceGenerator(name= "seq_id",
            sequenceName = "id",
            initialValue = 1,
            allocationSize = 1)

    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "seq_id"
    )
    private Long id;
    private String username;
    private String name;
    private String mail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
