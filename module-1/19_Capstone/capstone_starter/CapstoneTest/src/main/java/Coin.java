public enum Coin {

        FIVE_CENTS(5), TEN_CENTS(10),  TWENTY_CENTS(20), FIFTY_CENTS(50), HUNDRED_CENTS(100);

        private int value

        Coin(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }
        /*
        The Coin class will represent all coins accepted by the machine: 5 cents, 10 cents,
        20 cents, 50 cents, and 100 cents. An enum is a special "class" that represents a group of constants
         (unchangeable variables, like final variables).
        To create an enum , use the enum keyword (instead of class or interface),
        and separate the constants with a comma.
        What is enum and why it is used?
            Enums are lists of constants. When you need a predefined list of values which do represent
            some kind of numeric or textual data, you should use an enum.
            You should always use enums when a variable (especially a method parameter)
            can only take one out of a small set of possible values.
         */
}
