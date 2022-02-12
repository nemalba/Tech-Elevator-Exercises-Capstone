package com.techelevator.draw.tool;

import java.awt.*;

public class PencilDemo {
    public static void main(String[] args) {

        WoodenPencil pencil = new WoodenPencil();
        System.out.println("Pencil length: " + pencil.getLength() + " inches");
        System.out.println("Pencil sharpness: " + pencil.getSharpness());
        System.out.println();

        pencil.sharpen();
        System.out.println("Sharpening...");
        System.out.println("Pencil length: " + pencil.getLength() + " inches");
        System.out.println("Pencil sharpness: " + pencil.getSharpness());
        System.out.println();

        pencil.write();
        System.out.println("Writing...");
        System.out.println("Pencil sharpness: " + pencil.getSharpness());
        System.out.println();

        pencil.sharpen();
        System.out.println("Sharpening...");
        System.out.println("Pencil length: " + pencil.getLength()+ " inches");
        System.out.println("Pencil sharpness: " + pencil.getSharpness());

        System.out.println("\n\nThe percentage of class in a 'B' pencil is " +
                WoodenPencil.clayPercentage("B"));

        //Constructor values --     double length, int shape, String hardness, Color color, double sharpness
        WoodenPencil newPencil = new WoodenPencil(20, 2, "G", Color.BLUE, 2.5);

        System.out.println(newPencil);
    }
}
