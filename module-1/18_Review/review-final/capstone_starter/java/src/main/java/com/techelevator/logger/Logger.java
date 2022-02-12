package com.techelevator.logger;

import java.io.*;

public class Logger implements Closeable{

    // properties or attributes
    private File logFile;   // create the variable   = new File(pathName); will be handled in the constructor
    private PrintWriter writer;  // = new PrintWriter(logFile); business logic we need to use for this

    public Logger(String pathName){
        // need to initialize the File object
        this.logFile = new File(pathName);

        // business logic -- if logFile doesn't exist, we can just initialize our writer object as normally done
        // but if logFile exists, we need to make sure we are appending
        if(!logFile.exists()){
            try {
                this.writer = new PrintWriter(this.logFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {  // if the logFile already exists, we want to append to it.
                                        // anonymous FileWriter object
                                         // collaborator class so we can send in a boolean of if we want append
                            // book uses FileOutputStream which allows us to write binary data if we want
            try {
                this.writer = new PrintWriter(new FileWriter(this.logFile, true));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // need a method to write to the file
    public void write(String logMessage){
        this.writer.println(logMessage);
        this.writer.flush();
    }


    @Override
    public void close() throws IOException {
//        this.writer.flush();  do we need this???
        this.writer.close();
    }
}
