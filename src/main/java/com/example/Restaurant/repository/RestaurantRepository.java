package com.example.Restaurant.repository;

import com.example.Restaurant.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantRepository {

    private List<Restaurant> restaurantList;

    public RestaurantRepository() {
        restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant(1, "Test Restaurant", "123 Main St", "123-456-7890", "Italian", 10));
    }

    public List<Restaurant> getRestaurantsFromDataSource() {
        return restaurantList;
    }

    public boolean save(Restaurant restaurant) {
        restaurantList.add(restaurant); //mock Database call
        return true;
    }

    public boolean remove(Restaurant restaurant) {
        restaurantList.remove(restaurant); //mock a database
        return true;
    }

    public boolean update(Integer id, String specialty) {
        boolean updateStatus = false;
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getId()==id) {
                restaurant.setSpecialty(specialty);
                return true; //not mocking the database here to keep things simple.
            }
        }
        return false;
    }


    public Restaurant getById(int id) {
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getId()==id) {
                return restaurant;
            }
        }
        return null;
    }
}
