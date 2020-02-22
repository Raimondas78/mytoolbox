package day2;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter some text or 'exit' to quit");
        String word = scanner.nextLine();

        while(!word.equals("exit")) {
            StringBuilder stringBuilder = new StringBuilder(word);
            System.out.println(stringBuilder.reverse());

            System.out.println("Please enter some text or 'exit' to quit");
            word = scanner.nextLine();
        }
    }
}
