package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class HomeTask {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input you file name:\t");
        String fileName = SCANNER.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            String strCurrentLine;
            while ((strCurrentLine = bufferedReader.readLine()) != null) {
                System.err.println(strCurrentLine);
            }

        } catch (Exception e) {
            System.err.println("Error !!!");
            e.printStackTrace();
        }
    }
}