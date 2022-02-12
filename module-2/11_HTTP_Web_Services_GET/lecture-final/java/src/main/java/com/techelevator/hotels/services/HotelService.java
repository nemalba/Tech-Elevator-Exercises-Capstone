package com.techelevator.hotels.services;

import com.techelevator.hotels.model.City;
import com.techelevator.hotels.model.Hotel;
import com.techelevator.hotels.model.Review;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private static final String API_BASE_URL = "http://localhost:3000/";
    private final RestTemplate restTemplate = new RestTemplate();

    public Hotel[] listHotels() {
        //restTemplate is the class that lets me query an API
        // BASE_URL is set above, call the getForObject method
        // restTemplate.getForObject will deserialize the JSON coming back from the API
        // we have say what class to use (Hotel[].class)
        return restTemplate.getForObject(API_BASE_URL + "hotels", Hotel[].class);
    }

    public Review[] listReviews() {
        return restTemplate.getForObject(API_BASE_URL + "reviews", Review[].class);
    }

    public Hotel getHotelById(int id) {

        return restTemplate.getForObject(API_BASE_URL + "hotels/" + id, Hotel.class);
    }

    public Review[] getReviewsByHotelId(int hotelID) {
        return restTemplate.getForObject(API_BASE_URL + "hotels/" + hotelID + "/reviews", Review[].class);
        // both these will return the same info based on the documentation
        // return restTemplate.getForObject(API_BASE_URL + "reviews?hotelId=" + hotelID, Review[].class);
    }

    public Hotel[] getHotelsByStarRating(int stars) {
        return restTemplate.getForObject(API_BASE_URL + "hotels?stars=" + stars, Hotel[].class);
    }

    public City getWithCustomQuery(){
        return restTemplate.getForObject("https://api.teleport.org/api/cities/geonameid:3530597/", City.class);
    }

}
