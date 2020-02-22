package FundamentalsExersisesAdvanced;

public class TicTacToe {

    String[] arrayBoard = new String[9];
    int[] arrayInt = new int[9];
    public TicTacToe() {
        for (int i=0; i<9;i++){
            arrayInt[i]=i+1;
        }
        for(int i=0; i<9;i++){
            arrayBoard[i] = Integer.toString(arrayInt[i]);
        }
    }

    public String[] getArrayBoard() {
        return arrayBoard;
    }

    public void setArrayBoard(String[] arrayBoard) {
        this.arrayBoard = arrayBoard;
    }

    public void printBoard(){
        for(int i =0; i<3;i++){
            if(i==0){
                System.out.print("|" + arrayBoard[i] + "|");
            } else {
                System.out.print(arrayBoard[i] + "|");
            }
        }
        System.out.println();
        for(int i=3; i<6;i++){
            if(i==3){
                System.out.print("|" + arrayBoard[i] +"|");
            } else {
                System.out.print(arrayBoard[i] + "|");
            }
        }
        System.out.println();
        for(int i=6; i<9;i++){
            if(i==6){
                System.out.print("|" + arrayBoard[i] +"|");
            } else {
                System.out.print(arrayBoard[i] + "|");
            }
        }
        System.out.println();
    }

    public boolean isUserOneWinner(String userToken, String userName){

                if((arrayBoard[0].equals(arrayBoard[1]) && arrayBoard[1].equals(arrayBoard[2]))&&
                        arrayBoard[0].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                } else
                if((arrayBoard[0].equals(arrayBoard[3]) && arrayBoard[3].equals(arrayBoard[6]))
                &&  arrayBoard[0].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                } else
                if((arrayBoard[0].equals(arrayBoard[4]) && arrayBoard[4].equals(arrayBoard[8]))
                &&  arrayBoard[0].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                } else
                if((arrayBoard[1].equals(arrayBoard[4]) && arrayBoard[4].equals(arrayBoard[7]))
                && arrayBoard[1].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                } else
                if((arrayBoard[2].equals(arrayBoard[5]) && arrayBoard[5].equals(arrayBoard[8]))
                && arrayBoard[2].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                } else
                if((arrayBoard[2].equals(arrayBoard[4]) && arrayBoard[4].equals(arrayBoard[6]))
                && arrayBoard[2].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                } else
                if((arrayBoard[3].equals(arrayBoard[4]) && arrayBoard[4].equals(arrayBoard[5]))
                && arrayBoard[3].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                } else
                if((arrayBoard[6].equals(arrayBoard[7]) && arrayBoard[7].equals(arrayBoard[8]))
                && arrayBoard[6].equals(userToken)){
                    System.out.println(userName + " has won!");
                    return true;

                }
           return false;

        }
 }





