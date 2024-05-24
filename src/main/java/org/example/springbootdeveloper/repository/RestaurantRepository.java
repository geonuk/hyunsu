package org.example.springbootdeveloper.repository;

import org.example.springbootdeveloper.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
