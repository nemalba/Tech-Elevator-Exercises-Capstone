import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingDotCsvFile {
    public static void main(String[] args){


//        private List<String> getRecordFromLine(String line) {
//            List<String> values = new ArrayList<String>();
//            try (Scanner rowScanner = new Scanner(line)) {
//                rowScanner.useDelimiter(COMMA_DELIMITER);
//                while (rowScanner.hasNext()) {
//                    values.add(rowScanner.next());
//                }
//            }
//            return values;
//        }

        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("vendingmachine.csv"));) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
