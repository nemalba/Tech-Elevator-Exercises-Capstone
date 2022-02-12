import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadOutputFile {

    public static void main(String[] args){

        ArrayList<String> result = new ArrayList<>();


        try (
                File myObj = new File("vendingmachine.csv");
                Scanner myReader = new Scanner(myObj)
                Scanner s = new Scanner(new FileReader("vendingmachine.csv"))) {
            while (myReader.hasNext()) {
                result.add(myReader.nextLine());
            }
            return result;
        }


            }


}
