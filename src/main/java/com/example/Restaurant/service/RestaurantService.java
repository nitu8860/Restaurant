package com.example.Restaurant.service;

import com.example.Restaurant.model.Restaurant;
import com.example.Restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.getRestaurantsFromDataSource();
    }

    public String addRestaurant(Restaurant restaurant) {
        boolean insertionStatus = restaurantRepository.save(restaurant);
        if(insertionStatus) {
            return "Restaurant added successfully!";
        } else {
            return "Failed to add restaurant due to database error";
        }
    }



    public Restaurant getRestaurantById(int id) {
        List<Restaurant> restaurantListRightNow = restaurantRepository.getRestaurantsFromDataSource();

        for(Restaurant restaurant : restaurantListRightNow) {
            if(restaurant.getId() == id) {
                return restaurant;
            }
        }

        return null;
    }

    public String deleteRestaurant(int id) {
        boolean deleteResponse = false;
        String status;

        if(id > 0) {
            List<Restaurant> restaurantListRightNow = restaurantRepository.getRestaurantsFromDataSource();

            for(Restaurant restaurant : restaurantListRightNow) {
                if(restaurant.getId() == id) {
                    deleteResponse = restaurantRepository.remove(restaurant);
                    if(deleteResponse) {
                        status = "Restaurant with id: " + id + " was deleted!";
                    } else {
                        status = "Failed to delete restaurant with id: " + id + " due to database error";
                    }
                    return status;
                }
            }

            return "No restaurant found with id: " + id;
        } else {
            return "Invalid id, cannot accept negative or zero id value";
        }
    }

    public String updateRestaurant(int id, String type) {
        boolean updateStatus = restaurantRepository.update(id, type);

        if(updateStatus) {
            return "Restaurant with id: " + id + " was updated!";
        } else {
            return "No restaurant found with id: " + id;
        }
    }

}
