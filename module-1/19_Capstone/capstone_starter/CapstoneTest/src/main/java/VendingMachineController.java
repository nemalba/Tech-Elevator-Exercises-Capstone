public interface VendingMachineController {
//    VendingController class that coordinates the communication between the interface and the calculator.
//    This class helps decouple the interface from the rest of the program.
//    The interface doesn’t need to know how to calculate the change; it only needs to know where to request it.

    CoinBundle calculateChange(VendingMachineRequest request);
}
