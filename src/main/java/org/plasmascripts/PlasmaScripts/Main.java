package org.plasmascripts.PlasmaScripts;

public class Main {
    public static void main(String[] args) {
        // add args to handler
        ArgumentHandler.argList = args;

        System.out.println(Math.round(Math.random() * 100));


    }
}