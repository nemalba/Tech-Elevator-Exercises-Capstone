package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

//@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;

    public AuctionController() {

        this.dao = new MemoryAuctionDao();
    }

    /**
    * Return a list of auctions
    *
     * @return a list of all auctions in the system
    */



//    @RequestMapping(path = "/auctions", method = RequestMethod.GET)
//    public List<Auction> list(@RequestParam ( value = "title_like", required = false, defaultValue = "") String title,
//                              @RequestParam ( value = "pro_like", required = false, defaultValue = "0") double currentBid_lte) {
//        if(!title.equals("")){
//            return dao.searchByTitle(title);
//        } else{
//            return dao.list();
//        }

 @RequestMapping(path = "/auctions", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam ( value = "title_like", required = false, defaultValue = "") String title,
                              @RequestParam ( value = "currentBid_lte", required = false, defaultValue = "0") double maxPrice) {

     if (maxPrice != 0 && !title.equals("")) {
         return dao.searchByTitleAndPrice(title, maxPrice);
     } else if(!title.equals("")){
            return dao.searchByTitle(title);
        } else if(maxPrice !=0) {
            return dao.searchByPrice(maxPrice);
        }
        else{
                return dao.list();
            }
        }

// http://localhost:8080/auctions/filter?title_like=Bell


    /**
     * Return a specific auction based on the value passed to it.
     *
     * /auctions/{id}/
     * @param id
     * @return specific auction based on the value passed to it
     */
    @RequestMapping(path = "/auctions/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
         {
                return dao.get(id);
            }
        }

    /**
     * Create / Add a new auction that's passed to it
     *
     * @param auction object
     * @return auction object
     */
    @RequestMapping(path = "/auctions", method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction) {
       return dao.create(auction);
    }



//below curly brace for the class
    }


