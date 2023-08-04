package org.plasmascripts.PlasmaScripts;

public class ArgumentHandler {

    public static String[] argList;
    public static boolean argSingleOptionPresent(String argOption) {
        boolean hasArg = false;
        for(String arg : argList) {
            if(arg.equalsIgnoreCase(argOption)) {
                hasArg = true;
                break;
            }
        }
        return hasArg;
    }

}
