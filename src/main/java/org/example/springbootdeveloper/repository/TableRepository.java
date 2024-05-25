package org.example.springbootdeveloper.repository;

import org.example.springbootdeveloper.domain.Restaurant;
import org.example.springbootdeveloper.domain.Tables;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<Tables, Long> {
}
