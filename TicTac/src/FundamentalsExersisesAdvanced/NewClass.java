package FundamentalsExersisesAdvanced;

public class NewClass {

    public static void main(String[] args) {
        String[][] arrayBoard= new String[3][3];
        //int k=1;
        for(int i=0;i<arrayBoard.length;i++){
            for(int j=0;j<arrayBoard.length;j++){
                arrayBoard[i][j]= " ";
            }
        }
        System.out.println(arrayBoard.length);

        for(int i=0;i<arrayBoard.length;i++){
            for(int j=0;j<arrayBoard.length;j++){
                System.out.print("|" + arrayBoard[i][j]);
            }
            System.out.println("|");
        }

    }


}
