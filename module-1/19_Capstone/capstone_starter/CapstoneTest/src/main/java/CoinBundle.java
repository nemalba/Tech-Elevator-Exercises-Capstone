public class CoinBundle {

//    Next, since we will receive a bunch of coins and return a bunch of coins, we could represent
//        a class instead of passing around an array of numbers representing the number of coins.
//    This change will make communication between classes simpler. We will call this class CoinBundle.

    public int number5CentsCoins;
    public int number10CentsCoins;
    public int number20CentsCoins;
    public int number50CentsCoins;
    public int number100CentsCoins;

    public CoinBundle(int [] enteredCoins) {
        this.number5CentsCoins = enteredCoins[0];
        this.number10CentsCoins = enteredCoins[1];
        this.number20CentsCoins = enteredCoins[2];
        this.number50CentsCoins = enteredCoins[3];
        this.number100CentsCoins = enteredCoins[4];

    }
}
