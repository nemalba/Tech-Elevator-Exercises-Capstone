package com.techelevator;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        Bid bid = new Bid("Josh", 1);
        generalAuction.placeBid(bid); // created a named bid object

        // I am bidding with anonymous Bid object
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        System.out.println("Current high bid for " + generalAuction.getItemForSale());
        Bid highBid = generalAuction.getHighBid();
        System.out.println("Bidder name: " + highBid.getBidder());
        System.out.println("Bid amount: " + highBid.getBidAmount());

        generalAuction.placeBid(new Bid("Margaret", 25));

        System.out.println("Current high bid for " + generalAuction.getItemForSale());
        highBid = generalAuction.getHighBid();
        System.out.println("Bidder name: " + highBid.getBidder());
        System.out.println("Bid amount: " + highBid.getBidAmount());

        // let's print out a list of all the bids
        System.out.println("List of all bids so far:  ");
        List<Bid> allBids = generalAuction.getAllBids();  // create a list data structure to hold all bids
        for (int i = 0; i < allBids.size(); i++){
            System.out.println("Bid number " + (i + 1));  // i + 1 will print out one more than value of i
            System.out.println("\tBidder name: " + allBids.get(i).getBidder());
            System.out.println("\tBid amount: " + allBids.get(i).getBidAmount());
        }


        System.out.println();
        //Lets create a BuyoutAuction object
        BuyoutAuction buyoutAuction = new BuyoutAuction("green tea mug", 120);

        System.out.println("Started a buyout auction (created an object)");
        boolean winningBid = buyoutAuction.placeBid(new Bid("Bob", 20));
        System.out.println("Is bid winning? " + winningBid);

        winningBid = buyoutAuction.placeBid(new Bid("Katy", 120));
        System.out.println("Is bid winning? " + winningBid);
        System.out.println("Bidder: " + buyoutAuction.getHighBid().getBidder());
        System.out.println("Bidder amount: " + buyoutAuction.getHighBid().getBidAmount());


        ReserveAuction reserveAuction = new ReserveAuction("UM Yeti Mug", 5);

        reserveAuction.placeBid(new Bid("Sue", 3));
        System.out.println("Is Sue's bid enough? ");
        System.out.println(reserveAuction.getHighBid().getBidder() + "  " +
                reserveAuction.getHighBid().getBidAmount());

        reserveAuction.placeBid(new Bid ("Tim", 10));
        System.out.println("Is Tim's bid enough?");
        System.out.println(reserveAuction.getHighBid().getBidder() + " " +
                reserveAuction.getHighBid().getBidAmount()) ;

        // we can call the printBids method with a reserveAuction object
        // because reserveAuction is a child of Auction and
        // polymorphism allows up to do this!!!!
        printBids(reserveAuction);
    }

    public static void printBids(Auction auction){
        // let's print out a list of all the bids
        System.out.println("List of all bids so far:  ");
        List<Bid> allBids = auction.getAllBids();  // create a list data structure to hold all bids
        for (int i = 0; i < allBids.size(); i++){
            System.out.println("Bid number " + (i + 1));  // i + 1 will print out one more than value of i
            System.out.println("\tBidder name: " + allBids.get(i).getBidder());
            System.out.println("\tBid amount: " + allBids.get(i).getBidAmount());
        }
    }
}
