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

    public static String argValueOption(String argOption) {
        /*

            CODE NOT CHECKED YET

         */
        boolean hasArg = false;
        String valueOut = "";
        int currentArgIndex = 0;
        for(String arg : argList) {
            if(arg.equalsIgnoreCase(argOption)) {
                hasArg = true;
                break;
            }
            currentArgIndex += 1;
        }
        if(hasArg) {
            if(currentArgIndex == argList.length) {
                valueOut = "";
            } else {
                valueOut = argList[currentArgIndex + 1];
            }
        }

        return valueOut;
    }

}
