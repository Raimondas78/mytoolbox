package day2;

import java.util.Scanner;

public class IfStatementExamples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter hour");
        int hour = scanner.nextInt();

        if(hour == 11) {
            System.out.println("Lunch");
        } else if(hour <= 12) {
            System.out.println("Morning");
        } else {
            System.out.println("Evening");
        }

        System.out.println("Please enter text 'star' or 'dollar' to continue");
        String word = scanner.nextLine();

        if(word.equals("star")) {
            System.out.println("*");
        } else if(word.equals("dollar")) {
            System.out.println("$");
        } else if(word.equals("p")) {
            System.out.println("%");
        } else if(word.equals("xor")) {
            System.out.println("^");
        } else if(word.equals("a")) {
            System.out.println("&");
        } else if(word.equals("eta")) {
            System.out.println("@");
        } else {
            System.out.println("Wrong word");
        }


        System.out.println("Please enter some number");
        int age = scanner.nextInt();

        if(age > 0 & age < 18) {
            System.out.println("You are teen");
        } else if(age > 100) {
            System.out.println("Yoe are old");
        } else {
            System.out.println("You are adult");
        }
    }
}