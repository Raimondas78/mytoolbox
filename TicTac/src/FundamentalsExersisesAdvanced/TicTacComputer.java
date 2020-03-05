package FundamentalsExersisesAdvanced;

import java.util.Random;

public class TicTacComputer {
    String name;
    String level;

    public TicTacComputer(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public TicTacComputer() {
        this.name = "Computer";
        this.level = "hard";
    }

    int oponnentMoveOne=0;
    int oponnentMoveTwo=0;
    int oponnentMoveThree=0;
    int oponnentMoveFour=0;
    int myMoveOne=0;
    int myMoveTwo=0;
    int myMoveThree=0;
    int myMoveFour=0;
    int myMoveFive=0;
    Random rand = new Random();
    int num= rand.nextInt(9 + 1);


    //TicTacToe newGame = new TicTacToe();
    public int firstMove(String[][] arrayBoard, int gameCount, String userOneToken, String userTwoToken, int move) {
        //first move 1 or 5
        if(myMoveOne==0 && move==0){
            //oponnentMoveOne=move;
            return myMoveOne=1;

        } else if(myMoveOne==0 && move!=5){
            oponnentMoveOne=move;
            return myMoveOne=5;

        } else if(myMoveOne==0){
            oponnentMoveOne=move;
            return myMoveOne=1;
        }
        // second move

        if(myMoveOne!=0 && myMoveTwo==0 && oponnentMoveOne==0){
            oponnentMoveOne=move;
            if(oponnentMoveOne==5){
                return myMoveTwo=9;
            } else {
                return myMoveTwo =5;
            }
        }  else if(myMoveOne!=0 && myMoveTwo==0 && oponnentMoveOne!=0){
            oponnentMoveTwo = move;
        }




        return canIWin(arrayBoard, userOneToken, userTwoToken);
    }



    public static int checkForDefense(String [][] arrayBoard, String userTwoToken) {


        if ((arrayBoard[0][0].equals(arrayBoard[0][1]) && arrayBoard[0][2].equals(" ")) &&
                arrayBoard[0][0].equals(userTwoToken)) {
            return 3;

        } else if ((arrayBoard[0][0].equals(arrayBoard[0][2]) && arrayBoard[0][1].equals(" "))
                && arrayBoard[0][0].equals(userTwoToken)) {
            return 2;

        } else if ((arrayBoard[0][1].equals(arrayBoard[0][2]) && arrayBoard[0][0].equals(" "))
                && arrayBoard[0][1].equals(userTwoToken)) {
            return 1;

        } else if ((arrayBoard[1][0].equals(arrayBoard[1][1]) && arrayBoard[1][2].equals(" "))
                && arrayBoard[1][1].equals(userTwoToken)) {
            return 6;

        } else if ((arrayBoard[1][1].equals(arrayBoard[1][2]) && arrayBoard[1][0].equals(" "))
                && arrayBoard[1][1].equals(userTwoToken)) {
            return 4;

        } else if ((arrayBoard[1][0].equals(arrayBoard[1][2]) && arrayBoard[1][1].equals(" "))
                && arrayBoard[1][0].equals(userTwoToken)) {
            return 5;

        } else if ((arrayBoard[2][0].equals(arrayBoard[2][1]) && arrayBoard[2][2].equals(" "))
                && arrayBoard[2][1].equals(userTwoToken)) {
            return 9;

        } else if ((arrayBoard[2][1].equals(arrayBoard[2][2]) && arrayBoard[2][0].equals(" "))
                && arrayBoard[2][1].equals(userTwoToken)) {
            return 7;
        } else if ((arrayBoard[2][0].equals(arrayBoard[2][2]) && arrayBoard[2][1].equals(" "))
                && arrayBoard[2][0].equals(userTwoToken)) {
            return 8;

        } else if ((arrayBoard[0][0].equals(arrayBoard[1][0]) && arrayBoard[2][0].equals(" "))
                && arrayBoard[0][0].equals(userTwoToken)) {
            return 8;
        } else if ((arrayBoard[0][0].equals(arrayBoard[2][0]) && arrayBoard[1][0].equals(" "))
                && arrayBoard[0][0].equals(userTwoToken)) {
            return 4;
        } else if ((arrayBoard[1][0].equals(arrayBoard[2][0]) && arrayBoard[0][0].equals(" "))
                && arrayBoard[1][0].equals(userTwoToken)) {
            return 1;
        } else if ((arrayBoard[0][1].equals(arrayBoard[1][1]) && arrayBoard[2][1].equals(" "))
                && arrayBoard[0][1].equals(userTwoToken)) {
            return 8;
        } else if ((arrayBoard[0][1].equals(arrayBoard[2][1]) && arrayBoard[1][1].equals(" "))
                && arrayBoard[0][1].equals(userTwoToken)) {
            return 5;
        } else if ((arrayBoard[1][1].equals(arrayBoard[2][1]) && arrayBoard[0][1].equals(" "))
                && arrayBoard[1][1].equals(userTwoToken)) {
            return 2;
        } else if ((arrayBoard[0][2].equals(arrayBoard[1][2]) && arrayBoard[2][2].equals(" "))
                && arrayBoard[0][2].equals(userTwoToken)) {
            return 9;
        } else if ((arrayBoard[0][2].equals(arrayBoard[2][2]) && arrayBoard[1][2].equals(" "))
                && arrayBoard[0][2].equals(userTwoToken)) {
            return 6;
        } else if ((arrayBoard[1][2].equals(arrayBoard[2][2]) && arrayBoard[0][2].equals(" "))
                && arrayBoard[1][2].equals(userTwoToken)) {
            return 3;
        } else if ((arrayBoard[0][2].equals(arrayBoard[1][1]) && arrayBoard[2][0].equals(" "))
                && arrayBoard[0][2].equals(userTwoToken)) {
            return 7;
        } else if((arrayBoard[1][1].equals(arrayBoard[2][0]) && arrayBoard[0][2].equals(" "))
                &&  arrayBoard[1][1].equals(userTwoToken)){
            return 3;
        } else
        if((arrayBoard[0][0].equals(arrayBoard[1][1]) && arrayBoard[2][2].equals(" "))
                &&  arrayBoard[0][0].equals(userTwoToken)) {
            return 9;
        } else if((arrayBoard[1][1].equals(arrayBoard[2][2]) && arrayBoard[0][0].equals(" "))
                &&  arrayBoard[2][2].equals(userTwoToken)){
            return 1;
        }
            for(int i=0;i<arrayBoard.length;i++){
                for(int j=0;j<arrayBoard.length;j++){
                if(arrayBoard[i][j].equals(" ")){
                    // reikia metodo, kad pagal koordinates nustatytu ejima
                }
            }
        }

            return -1;//review this part

        }
    public static int canIWin(String [][] arrayBoard, String userOneToken, String userTwoToken) {

        if ((arrayBoard[0][0].equals(arrayBoard[0][1]) && arrayBoard[0][2].equals(" ")) &&
                arrayBoard[0][0].equals(userOneToken)) {
            return 3;

        } else if ((arrayBoard[0][0].equals(arrayBoard[0][2]) && arrayBoard[0][1].equals(" "))
                && arrayBoard[0][0].equals(userOneToken)) {
            return 2;

        } else if ((arrayBoard[0][1].equals(arrayBoard[0][2]) && arrayBoard[0][0].equals(" "))
                && arrayBoard[0][1].equals(userOneToken)) {
            return 1;

        } else if ((arrayBoard[1][0].equals(arrayBoard[1][1]) && arrayBoard[1][2].equals(" "))
                && arrayBoard[1][1].equals(userOneToken)) {
            return 6;

        } else if ((arrayBoard[1][1].equals(arrayBoard[1][2]) && arrayBoard[1][0].equals(" "))
                && arrayBoard[1][1].equals(userOneToken)) {
            return 4;

        } else if ((arrayBoard[1][0].equals(arrayBoard[1][2]) && arrayBoard[1][1].equals(" "))
                && arrayBoard[1][0].equals(userOneToken)) {
            return 5;

        } else if ((arrayBoard[2][0].equals(arrayBoard[2][1]) && arrayBoard[2][2].equals(" "))
                && arrayBoard[2][1].equals(userOneToken)) {
            return 9;

        } else if ((arrayBoard[2][1].equals(arrayBoard[2][2]) && arrayBoard[2][0].equals(" "))
                && arrayBoard[2][1].equals(userOneToken)) {
            return 7;
        } else if ((arrayBoard[2][0].equals(arrayBoard[2][2]) && arrayBoard[2][1].equals(" "))
                && arrayBoard[2][0].equals(userOneToken)) {
            return 8;

        } else if ((arrayBoard[0][0].equals(arrayBoard[1][0]) && arrayBoard[2][0].equals(" "))
                && arrayBoard[0][0].equals(userOneToken)) {
            return 8;
        } else if ((arrayBoard[0][0].equals(arrayBoard[2][0]) && arrayBoard[1][0].equals(" "))
                && arrayBoard[0][0].equals(userOneToken)) {
            return 4;
        } else if ((arrayBoard[1][0].equals(arrayBoard[2][0]) && arrayBoard[0][0].equals(" "))
                && arrayBoard[1][0].equals(userOneToken)) {
            return 1;
        } else if ((arrayBoard[0][1].equals(arrayBoard[1][1]) && arrayBoard[2][1].equals(" "))
                && arrayBoard[0][1].equals(userOneToken)) {
            return 8;
        } else if ((arrayBoard[0][1].equals(arrayBoard[2][1]) && arrayBoard[1][1].equals(" "))
                && arrayBoard[0][1].equals(userOneToken)) {
            return 5;
        } else if ((arrayBoard[1][1].equals(arrayBoard[2][1]) && arrayBoard[0][1].equals(" "))
                && arrayBoard[1][1].equals(userOneToken)) {
            return 2;
        } else if ((arrayBoard[0][2].equals(arrayBoard[1][2]) && arrayBoard[2][2].equals(" "))
                && arrayBoard[0][2].equals(userOneToken)) {
            return 9;
        } else if ((arrayBoard[0][2].equals(arrayBoard[2][2]) && arrayBoard[1][2].equals(" "))
                && arrayBoard[0][2].equals(userOneToken)) {
            return 6;
        } else if ((arrayBoard[1][2].equals(arrayBoard[2][2]) && arrayBoard[0][2].equals(" "))
                && arrayBoard[1][2].equals(userOneToken)) {
            return 3;
        } else if ((arrayBoard[0][2].equals(arrayBoard[1][1]) && arrayBoard[2][0].equals(" "))
                && arrayBoard[0][2].equals(userOneToken)) {
            return 7;
        } else if((arrayBoard[1][1].equals(arrayBoard[2][0]) && arrayBoard[0][2].equals(" "))
                &&  arrayBoard[1][1].equals(userOneToken)){
            return 3;
        } else
        if((arrayBoard[0][0].equals(arrayBoard[1][1]) && arrayBoard[2][2].equals(" "))
                &&  arrayBoard[0][0].equals(userOneToken)) {
            return 9;
        } else if((arrayBoard[1][1].equals(arrayBoard[2][2]) && arrayBoard[0][0].equals(" "))
                &&  arrayBoard[2][2].equals(userOneToken)){
            return 1;
        }
        return checkForDefense(arrayBoard, userTwoToken);

    }







}