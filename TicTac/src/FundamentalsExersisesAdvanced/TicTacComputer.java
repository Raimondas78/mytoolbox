package FundamentalsExersisesAdvanced;

import java.util.Random;

public class TicTacComputer {
    String name;
    String level;

    public TicTacComputer(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public TicTacComputer(){
        this.name = "Computer";
        this.level = "hard";
    }
    Random randomNumber = new Random();
    int randIntOne = randomNumber.nextInt(3);
    //TicTacToe newGame = new TicTacToe();
    public String firstMove(String [] arrayBoard, int gameCount, String userOneToken, String userTwoToken) {
        if (gameCount % 2 != 0) {
            switch (randIntOne) {
                case 0:
                    return arrayBoard[0] = userOneToken;
                    //break;
                case 1:
                    return arrayBoard[2] = userOneToken;
                   // break;
                case 2:
                    return arrayBoard[6] = userOneToken;
                   // break;
                case 3:
                    return arrayBoard[8] = userOneToken;
                    //break;
            }

        } else if (arrayBoard[4].equals(userTwoToken)){
            switch(randIntOne){
                case 0:
                    arrayBoard[0] = userOneToken;
                    //break;
                case 1:
                    arrayBoard[2] = userOneToken;
                    //break;
                case 2:
                    arrayBoard[6] = userOneToken;
                    //break;
                case 3:
                    arrayBoard[8]=userOneToken;
                    //break;
            }
        }

            return arrayBoard[4]=userOneToken;

    }






}
