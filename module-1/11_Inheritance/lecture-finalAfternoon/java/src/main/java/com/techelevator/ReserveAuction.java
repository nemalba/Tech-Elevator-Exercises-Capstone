package com.techelevator;

import java.net.Authenticator;

/*
Reserve Auction is one with a reserve price that you
must bid above for your bid to even be considered.
 */
public class ReserveAuction extends Auction {

    private int reservePrice;

    // constructor for the child class that passes a param to super
    public ReserveAuction(String itemForSale, int reservePrice) {
        super(itemForSale); // needs to go to the parent class
        this.reservePrice = reservePrice;
    }

    /*
    placeBid for a reserve Auction object, provide a different
    version than the parent's version
     */
    @Override  // tells any developer that this method
    // is providing a different version than what was in the
    // parent class
    public boolean placeBid(Bid offeredBid){
        boolean isCurrentWinningBid = false;

        // you either bid the reserve price or higher
        // or your bid is not accepted!
        if (offeredBid.getBidAmount() >= reservePrice){
            isCurrentWinningBid = super.placeBid(offeredBid);
        }
        return isCurrentWinningBid;
    }
}
