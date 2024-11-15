/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileio_uppercaseconverter;

/**
 *
 * @author tevy0
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\tevy0\\import_file\\Uppercase.txt";

        try {
            File inputFile = new File(inputFileName);
            Scanner inFile = new Scanner(inputFile);

            while (inFile.hasNextLine()) {
                String line = inFile.nextLine();
                System.out.println(line);
            }

            inFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

}
