package javaFundDay1;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some string");

        String stringFromScanner = scanner.nextLine();
        System.out.println("String from console: " + stringFromScanner);

        System.out.println("Please enter some int");
        String intfromScanner = scanner.next();
        System.out.println("int from console: " + intfromScanner);
    }
}
