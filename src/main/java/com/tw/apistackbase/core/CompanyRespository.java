package com.tw.apistackbase.core;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRespository extends JpaRepository<Company, Long>{

}
