# Restaurant Management System

This is a restaurant management system that allows you to create, read, update, and delete restaurant information.

## Frameworks and Language Used
- Java
- Spring Boot
- Maven

## Data Flow
### Controller
The RestaurantController class is responsible for handling HTTP requests and returning responses. It has the following endpoints:
- **POST /addRestaurant:** adds a new restaurant to the system
- **GET /getRestaurantById/{restaurantId}:** retrieves a restaurant with the given restaurant ID
- **GET /getAllRestaurants:** retrieves all restaurants in the system
- **PUT /updateRestaurant/{id}/{specialty}:** updates a restaurant's information with the given restaurant ID and speciality
- **DELETE /deleteRestaurant/{restaurantId}:** deletes a restaurant with the given restaurant ID

### Service
The RestaurantService class contains the business logic for the restaurant management system. It has the following methods:
- **List<Restaurant> getAllRestaurants():** retrieves all restaurants in the system
- **Restaurant getRestaurantById(int restaurantId):** retrieves a restaurant with the given restaurant ID
- **Restaurant addRestaurant(Restaurant restaurant):** adds a new restaurant to the system
- **boolean updateRestaurant(int restaurantId, Restaurant restaurant):** updates a restaurant's information with the given restaurant ID
- **boolean deleteRestaurant(int restaurantId):** deletes a restaurant with the given restaurant ID

### Repository
The RestaurantRepository class is responsible for interacting with the system's data. It has the following methods:
- **List<Restaurant> getRestaurantsFromDataSource():** retrieves all restaurants in the system
- **boolean save(Restaurant restaurant):** saves a restaurant to the system
- **boolean remove(Restaurant restaurant):** deletes a restaurant from the system
- **boolean update(Integer id, String specialty):** updates a restaurant's specialty with the given restaurant ID
- **Restaurant getById(int id):** retrieves a restaurant with the given restaurant ID

## Data Structure Used
The Restaurant class is used to represent a restaurant in the system. It has the following attributes:

- **int id:** the restaurant's ID
- **String name:** the restaurant's name
- **String address:** the restaurant's address
- **String number:** the restaurant's phone number
- **String specialty:** the restaurant's specialty
- **int totalStaffs:** the total number of staffs in the restaurant

## Project Summary
The restaurant management system is a simple application that allows restaurants to be added, retrieved, updated, and deleted from a system. It is built using the Spring Boot framework and Java programming language. The application has a controller, service, and repository layer, and uses a Restaurant class to represent restaurants in the system.
