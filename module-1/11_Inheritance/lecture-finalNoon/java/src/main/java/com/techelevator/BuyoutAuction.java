package com.techelevator;
/*
Buyout Auction class is a child of the Auction class
means that an object of type BuyoutAuction
will have the properties of an Auction class
as well as any properties declared in this class

BuyoutAuction means we can set a buyout price
that if someone bids this amount, the auction ends
 */
public class BuyoutAuction extends Auction {

    // property for my buyoutPrice
    private int buyoutPrice;

    // I had IntelliJ generate the constructor to pass the param to the parent class
    public BuyoutAuction(String itemForSale, int buyoutPrice) {
        super(itemForSale);  // this is calling the parent constructor!
        this.buyoutPrice = buyoutPrice;
    }

    // provide my own version of the placeBid method
    // this is known as overriding
    @Override // annotation tells Java you are providing
    // a different version of the method
    public boolean placeBid(Bid offeredBid){
        boolean isCurrentWinningBid = false;
        if(offeredBid.getBidAmount() >= buyoutPrice){
            // if bid is higher than buyoutPrice
            // pass this on to the parent version of the
            // placeBid method and this person wins the item
            //     super.placeBid calls the parent version
            isCurrentWinningBid = super.placeBid(offeredBid);
        } else {
            // otherwise just place a regular bid
            super.placeBid(offeredBid);
        }
        return isCurrentWinningBid;
    }
}
