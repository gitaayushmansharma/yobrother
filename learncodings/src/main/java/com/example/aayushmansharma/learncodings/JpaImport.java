package com.example.aayushmansharma.learncodings;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaImport extends JpaRepository<PropertyWaliClass, Integer>{

}
