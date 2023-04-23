package com.example.Restaurant.controller;

import com.example.Restaurant.model.Restaurant;
import com.example.Restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping(value = "/getAllRestaurants")
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping(value = "/getRestaurantById/{id}")
    public Restaurant getRestaurantById(@PathVariable int id) {
        return restaurantService.getRestaurantById(id);
    }

    @PostMapping(value = "/addRestaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }

    @PutMapping(value = "/updateRestaurant/{id}/{specialty}")
    public String updateRestaurant(@PathVariable int id, @PathVariable String specialty) {
        return restaurantService.updateRestaurant(id, specialty);
    }

    @DeleteMapping(value = "/deleteRestaurant/{id}")
    public String deleteRestaurant(@PathVariable int id) {
        return restaurantService.deleteRestaurant(id);
    }
}
