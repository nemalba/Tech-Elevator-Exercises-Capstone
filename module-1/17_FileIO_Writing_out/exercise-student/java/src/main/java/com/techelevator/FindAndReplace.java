package com.techelevator;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the search word: ");
        String wordToSearch = scanner.nextLine();

        System.out.println("What is the word to replace the search word with: ");
        String replaceWord = scanner.nextLine();

        System.out.println("What is the source file: ");
        File inputFile = new File(scanner.nextLine());

        if(!inputFile.exists()){
            System.out.println("The file does not exist!");
            System.exit(1);
        }

        System.out.println("What is the destination file: ");
        File outFile = new File(scanner.nextLine());

        if(!outFile.exists()){
            System.out.println("The file does not exist!");
            System.exit(1);
        }

       try(Scanner input = new Scanner(inputFile)){

           PrintWriter printWriter = new PrintWriter(outFile);
           while(input.hasNext()){
               String lineBeingRead = input.nextLine();
               printWriter.println(lineBeingRead.replace(wordToSearch, replaceWord ));
               printWriter.flush();

           }
            printWriter.close();
       }
       catch(Exception e){
           System.out.println("You failed me!");
        }
    }

}
