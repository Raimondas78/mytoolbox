package FundamentalsExersisesAdvanced;


import java.util.Random;
import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userOneToken;
        String userTwoToken;
        System.out.println("Please enter name of user 1");
        String userOneName = scanner.nextLine();
        System.out.println("Please enter name of user 2");
        String userTwoName = scanner.nextLine();

        System.out.println("Please choose symbol for " + userOneName +": o or x");
        userOneToken = scanner.nextLine();
        if(userOneToken.toLowerCase().equals("o")){
             //userOneToken = userOne;
             userTwoToken = "x";
        } else{
            userOneToken="x";
            userTwoToken="o";
        }
        /*for(int i =1; i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print(" |");
            }
            System.out.println();
        }

         */

        TicTacToe newGame = new TicTacToe();
        newGame.printBoard();
        boolean gameFinished = false;
        int count = 0;

        int gameCount = 1;
        Random randomNumber = new Random();
        int randIntOne = randomNumber.nextInt(3);
        TicTacComputer computer = new TicTacComputer();
        System.out.println(computer.firstMove(newGame.arrayBoard,gameCount,userOneToken,userTwoToken));



        while(!gameFinished) {
            System.out.println("Please make your move " + userOneName);
            System.out.println("Enter number from 1 to 9");
            int move = scanner.nextInt();
            //validation of board value
            while(newGame.arrayBoard[move-1].equals("o") || newGame.arrayBoard[move-1].equals("x")){
                System.out.println("Choose another field value. This field is already in use");
                move = scanner.nextInt();
            }

            newGame.arrayBoard[move - 1] = userOneToken;
            newGame.printBoard();

            if(newGame.isUserOneWinner(userOneToken, userOneName)){
                break;
            }
            count++;
            if(count>=9 && gameFinished==false){
                System.out.println("Draw. Game over");
                break;
            }
            System.out.println();
            System.out.println("Please make your move " + userTwoName);
            System.out.println("Enter number from 1 to 9");
            move = scanner.nextInt();
            //validation of board value
            while(newGame.arrayBoard[move-1].equals("o") || newGame.arrayBoard[move-1].equals("x")){
                System.out.println("Chose another field value. This field is already in use");
                move = scanner.nextInt();
            }

            newGame.arrayBoard[move - 1] = userTwoToken;
            newGame.printBoard();
            if(newGame.isUserOneWinner(userTwoToken, userTwoName)){
                break;
            }
            count++;

        }





    }


}
