package com.basic.JavaExamples;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String args[]) throws IOException {

        // File Creation
        String generatingFilePath = "/Users/sriram_rajagopalan/Sriram/Personal_Code_Repos/LearnJavaProgramming/testfilename.txt";
        // However in Windows - File Path goes as C:\\Users\\Sriram\\Test\\testfilename.txt
        File createFileObj = new File(generatingFilePath);
        try {
            if(createFileObj.createNewFile()){
                System.out.println("File Created under this directory:" + createFileObj.getAbsolutePath());
            }else{
                System.out.println("File exists");
            }
        }catch(IOException ex){
            System.out.println("Error Creating File: " + ex.getMessage());
            ex.printStackTrace();
        }

        // Write To File
        FileWriter fileWriterObj;
        try {
            fileWriterObj = new FileWriter(generatingFilePath);
            fileWriterObj.append("Writing some junk text to the created file - Line 1" + "\n");
            fileWriterObj.append("Writing some junk text to the created file - Line 2");
            fileWriterObj.close();
            System.out.println("Written Crap");
        }catch (IOException ex){
            System.out.println("Error Writing to File " + ex.getMessage());
            ex.printStackTrace();
        }

        // Read File & Print the Contents
        try {
            System.out.println("*******Reading Crap*********");
            Scanner scanObj = new Scanner(createFileObj);
            while (scanObj.hasNextLine()){
                String data = scanObj.nextLine();
                System.out.println(data);
            }
            scanObj.close();
        }catch (IOException ex){
            System.out.println("Error Reading from File " + ex.getMessage());
            ex.printStackTrace();
        }

        // Get File Information
        try{
            if (createFileObj.exists()) {
                System.out.println("File name: " + createFileObj.getName());
                System.out.println("Absolute path: " + createFileObj.getAbsolutePath());
                System.out.println("Writeable: " + createFileObj.canWrite());
                System.out.println("Readable " + createFileObj.canRead());
                System.out.println("File size in bytes " + createFileObj.length());
            } else {
                System.out.println("The file does not exist.");
            }
        }catch (Exception ex){
            System.out.println("Error Reading File Information" + ex.getMessage());
            ex.printStackTrace();
        }



        // Delete File
        try{
            if (createFileObj.delete()) {
                System.out.println("Deleted the file: " + createFileObj.getAbsolutePath());
            } else {
                System.out.println("The file does not exist.");
            }
        }catch (Exception ex){
            System.out.println("Error Deleting File" + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
