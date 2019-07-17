package com.tw.apistackbase.core;

import javax.persistence.*;
@Entity
public class Company {
@OneToOne(cascade=CascadeType.ALL)
   @Id
    private Long id;
   @Column(name="name",length=100)
    private String name;
   @OneToOne
   private Profile profile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company() {
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Company(String name) {
        this.name = name;
    }
}
