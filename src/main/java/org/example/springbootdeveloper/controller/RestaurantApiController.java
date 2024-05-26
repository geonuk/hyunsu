package org.example.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.example.springbootdeveloper.domain.Restaurant;
import org.example.springbootdeveloper.dto.AddrestaurantRequest;
import org.example.springbootdeveloper.dto.RestaurantResponse;
import org.example.springbootdeveloper.dto.UpdateRestaurantRequest;
import org.example.springbootdeveloper.service.RestaurantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
public class RestaurantApiController {

    private final RestaurantService restaurantService;

    @PostMapping("/api/restaurant")

    public ResponseEntity<Restaurant> addRestaurant(@RequestBody AddrestaurantRequest request){
        Restaurant savedRestaurant = restaurantService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedRestaurant);
    }

    @GetMapping("/api/restaurant")
    public ResponseEntity<List<RestaurantResponse>> findAllArticles(){
        List<RestaurantResponse> articles = restaurantService.findAll()
                .stream()
                .map(RestaurantResponse::new)
                .toList();

        return ResponseEntity.ok()
                .body(articles);
    }

    @GetMapping("/api/restaurant/{RID}")
    public ResponseEntity<RestaurantResponse> findArticle(@PathVariable int RID) {
        Restaurant restaurant = restaurantService.findById(RID);

        return ResponseEntity.ok()
                .body(new RestaurantResponse(restaurant));
    }

    @DeleteMapping("/api/restaurant/{RID}")
    public ResponseEntity<Void> deleteArticle(@PathVariable int RID) {
        restaurantService.delete(RID);

        return ResponseEntity.ok()
                .build();
    }

    @PutMapping("/api/restaurant/{RID}")
    public ResponseEntity<Restaurant> updateArticle(@PathVariable int RID,
                                                 @RequestBody UpdateRestaurantRequest request) {
        Restaurant updatedRestaurant = restaurantService.update2(RID, request);

        return ResponseEntity.ok()
                .body(updatedRestaurant);
    }

}