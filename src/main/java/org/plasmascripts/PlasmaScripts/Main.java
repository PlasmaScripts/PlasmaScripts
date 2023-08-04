package org.plasmascripts.PlasmaScripts;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // add args to handler
        ArgumentHandler.argList = args;


        Scanner scanner = new Scanner(System.in);
        byte number = scanner.nextByte();
        if(number >= 10) {
            myFunction();
        }
        else {
            System.out.println("Plasma Client Loaded...");
        }

    }

    private static void myFunction() {
        System.out.println("[CONSOLE}: Error 404");
    }
}

