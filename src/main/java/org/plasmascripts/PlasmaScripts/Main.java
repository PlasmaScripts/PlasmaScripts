package org.plasmascripts.PlasmaScripts;

public class Main {
    public static void main(String[] args) {
        // add args to handler
        ArgumentHandler.argList = args;

        if(ArgumentHandler.argSingleOptionPresent("-debug")) {
            for(String i : args) {
                System.out.println(i);
            }
        }
    }
}