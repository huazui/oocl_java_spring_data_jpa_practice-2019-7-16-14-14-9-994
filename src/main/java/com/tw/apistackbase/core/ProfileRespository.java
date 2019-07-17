package com.tw.apistackbase.core;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileRespository extends JpaRepository<Profile, Long> {
    public List<Profile> findByName(String name);
}
