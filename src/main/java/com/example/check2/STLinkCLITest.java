package com.example.check2;

import javafx.application.Platform;
import javafx.stage.FileChooser;

import java.io.*;

public class STLinkCLITest {
    public static void main(String[] args) {

//        try{
//        Process process = Runtime.getRuntime().exec("cmd /c cd STM32 ST-LINK Utility/ST-LINK Utility && ST-LINK_CLI.exe -P C://Users//admin//Downloads//BLINK_JAVA.bin  0x08000000 -V");
//        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
//        String inputString;
//        while ((inputString = stdInput.readLine()) != null) {
//            System.out.println(inputString);
//
//        }
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
        try {
            String command = "cmd /c cd STM32 ST-LINK Utility/ST-LINK Utility && ST-LINK_CLI.exe -P C://Users//admin//Downloads//BLINK_JAVA.bin 0x08000000 -V";
            ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            int exitCode = process.waitFor();
            System.out.println("Command executed with exit code: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
//        try {
////            Stage stage = (Stage) ap.getScene().getWindow();
//            FileChooser fileChooser = new FileChooser();
//            fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Bin File", "*bin"));
//            fileChooser.setTitle("Open File");
//            File binFileTOBeFlashed = fileChooser.showOpenDialog(null);
//            // Command to execute
//            String filePath = binFileTOBeFlashed != null ? binFileTOBeFlashed.getAbsolutePath() : null;
//            System.out.println(filePath);
//            String command = "cmd /c cd STM32 ST-LINK Utility/ST-LINK Utility && ST-LINK_CLI.exe -P "+filePath+ " 0x08000000 -V";
//
//            // Create ProcessBuilder
//            ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
//            processBuilder.redirectErrorStream(true);
//
//            // Start the process
//            Process process = processBuilder.start();
//
//            // Get the output stream of the process
//            InputStream inputStream = process.getInputStream();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//
//            // Read the output
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            // Wait for the process to complete
//            int exitCode = process.waitFor();
//            System.out.println("Command executed with exit code: " + exitCode);
//
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
