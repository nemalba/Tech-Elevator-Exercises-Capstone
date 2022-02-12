package com.techelevator;
//1
public class FlowerShopOrder {
    /* 2
    Add a *bouquet type*, *number of roses*, and *subtotal* attribute/property to the Flower Shop Order class:
    * `bouquet type`: indicates the type of bouquet.
    * `number of roses`: indicates the number of roses added to the bouquet.
    * `subtotal`: indicates the order subtotal before shipping by adding $19.99 for the standard bouquet, plus $2.99 for each rose.
     */
    private String bouquetType;
    private int numberOfRoses;
    private double subtotal;
    //private BigDecimal subtotal;

    /*
    3. Create a constructor that accepts `bouquet type` and `number of roses`.
     */

    public FlowerShopOrder(String bouquetType, int numberOfRoses) {
        this.bouquetType = bouquetType;
        this.numberOfRoses = numberOfRoses;
    }

    /*
    5. Create a method that calculates the delivery total using input parameters of
    a `bool`/`boolean` for `sameDayDelivery` and a string `zipCode`:
    * The delivery fee is $3.99 if the zip code falls between 20000 and 29999 (+$5.99 for same-day delivery).
    * The delivery fee is $6.99 if the zip code falls between 30000 and 39999 (+$5.99 for same-day delivery).
    * The delivery fee is waived ($0.00) if the zip code falls between 10000 and 19999.
    * All other zip codes cost $19.99 (same-day delivery is not an option).
     */


}
