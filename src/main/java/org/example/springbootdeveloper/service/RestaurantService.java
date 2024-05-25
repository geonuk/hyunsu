package org.example.springbootdeveloper.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springbootdeveloper.domain.Restaurant;
import org.example.springbootdeveloper.dto.AddrestaurantRequest;
import org.example.springbootdeveloper.dto.UpdateRestaurantRequest;
import org.example.springbootdeveloper.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public Restaurant save(AddrestaurantRequest request){
        return restaurantRepository.save(request.toEntity());
    }

    public List<Restaurant> findAll(){
        return restaurantRepository.findAll();
    }

    public Restaurant findById(long id){
        return restaurantRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    public void delete(long id) {
        restaurantRepository.deleteById(id);
    }

    @Transactional
    public Restaurant update2(long id, UpdateRestaurantRequest request) {
        Restaurant restaurant = restaurantRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));

        restaurant.update2(request.getRID(), request.getAddress(), request.getRname(),request.getOpentime(),request.getClosetime(),request.getPnumber());

        return restaurant;
    }
}
