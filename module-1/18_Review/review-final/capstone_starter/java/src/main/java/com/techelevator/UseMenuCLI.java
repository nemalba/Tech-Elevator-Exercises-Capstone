package com.techelevator;

import com.techelevator.application.UseMenu;

import java.io.IOException;

public class UseMenuCLI

{
    public static void main(String[] args) 
    {
        UseMenu useMenu = new UseMenu();
        try {
            useMenu.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
