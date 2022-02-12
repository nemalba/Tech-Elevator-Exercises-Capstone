package com.techelevator.auctions.services;

import org.springframework.web.client.RestTemplate;

import com.techelevator.auctions.model.Auction;

public class AuctionService {

    public static final String API_BASE_URL = "http://localhost:3000/auctions/";
    private RestTemplate restTemplate = new RestTemplate();



    public Auction[] getAllAuctions() {

        return restTemplate.getForObject(API_BASE_URL ,Auction[].class);

         // call api here
       // return null;
    }

    public Auction getAuction(int id) {

        return restTemplate.getForObject(API_BASE_URL + id, Auction.class);


        // call api here
        //return null;
    }

    public Auction[] getAuctionsMatchingTitle(String title) {

        return restTemplate.getForObject(API_BASE_URL + "?title_like="+ title, Auction[].class);
        // call api here
       // return null;
    }

    public Auction[] getAuctionsAtOrBelowPrice(double price) {
        // call api here
        return restTemplate.getForObject(API_BASE_URL + "?currentBid_lte=" + price, Auction[].class);
        //return null;
    }

}
