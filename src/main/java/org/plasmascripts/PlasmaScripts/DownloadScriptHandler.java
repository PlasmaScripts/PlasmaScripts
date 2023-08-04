package org.plasmascripts.PlasmaScripts;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadScriptHandler {

    public static void downloadFile(URL url, String fileName) throws IOException {
        FileUtils.copyURLToFile(url, new File(fileName));
    }

    public static void getRunScript(String url, String fileDisplayName) throws IOException {
        URL scriptLocation = new URL(url);

        downloadFile(scriptLocation, "C:\\PlasmaScripts\\" + fileDisplayName + ".ps1");
        powershellScript("C:\\PlasmaScripts\\" + fileDisplayName + ".ps1");
    }

    public static void powershellScript(String scriptLocation) throws IOException {
        String command = "powershell.exe " + scriptLocation;
        // Executing the command
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        // Getting the results
        powerShellProcess.getOutputStream().close();
        String line;
        System.out.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream()));
        while ((line = stdout.readLine()) != null) {
            System.out.println(line);
        }
        stdout.close();
        System.out.println("Standard Error:");
        BufferedReader stderr = new BufferedReader(new InputStreamReader(
                powerShellProcess.getErrorStream()));
        while ((line = stderr.readLine()) != null) {
            System.out.println(line);
        }
        stderr.close();
    }

}
