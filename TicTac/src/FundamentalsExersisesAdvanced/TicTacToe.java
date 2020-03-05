package FundamentalsExersisesAdvanced;

public class TicTacToe {

    String[][] arrayBoard = new String[3][3];
    //int[] arrayInt = new int[9];
    public TicTacToe() {
        for (int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                arrayBoard[i][j] = " ";
            }
        }
    }

    public String[][] getArrayBoard() {

        return arrayBoard;
    }

    public void setArrayBoard(String[][] arrayBoard) {

        this.arrayBoard = arrayBoard;
    }

    public void printBoard() {
        for(int i=0;i<arrayBoard.length;i++){
            for(int j=0;j<arrayBoard.length;j++){
                System.out.print("|" + arrayBoard[i][j]);
            }
            System.out.println("|");
        }

    }

    public boolean isUserOneWinner(String userToken, String userName){

                if((arrayBoard[0][0].equals(arrayBoard[0][1]) && arrayBoard[0][1].equals(arrayBoard[0][2]))&&
                        arrayBoard[0][0].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                } else
                if((arrayBoard[0][0].equals(arrayBoard[1][0]) && arrayBoard[1][0].equals(arrayBoard[2][0]))
                &&  arrayBoard[0][0].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                } else
                if((arrayBoard[0][0].equals(arrayBoard[1][1]) && arrayBoard[1][1].equals(arrayBoard[2][2]))
                &&  arrayBoard[0][0].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                } else
                if((arrayBoard[0][1].equals(arrayBoard[1][1]) && arrayBoard[1][1].equals(arrayBoard[2][1]))
                && arrayBoard[0][1].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                } else
                if((arrayBoard[0][2].equals(arrayBoard[1][2]) && arrayBoard[1][2].equals(arrayBoard[2][2]))
                && arrayBoard[0][2].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                } else
                if((arrayBoard[0][2].equals(arrayBoard[1][1]) && arrayBoard[1][1].equals(arrayBoard[2][0]))
                && arrayBoard[0][2].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                } else
                    if((arrayBoard[1][0].equals(arrayBoard[1][1]) && arrayBoard[1][1].equals(arrayBoard[1][2]))
                && arrayBoard[1][0].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                } else
                if((arrayBoard[2][0].equals(arrayBoard[2][1]) && arrayBoard[2][1].equals(arrayBoard[2][2]))
                && arrayBoard[2][0].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                }
           return false;

        }
        public int getRow(int move){

        switch(move){
            case 1: case 2: case 3:
                return 0;
            case 4: case 5: case 6:
                return 1;
            case 7: case 8: case 9:
                return 2;

            default:
                break;
        }

        return -1;
       }
    public int getCol(int move){

        switch(move){
            case 1: case 4: case 7:
                return 0;
            case 2: case 5: case 8:
                return 1;
            case 3: case 6: case 9:
                return 2;

            default:
                break;
        }

        return -1;
    }




 }





