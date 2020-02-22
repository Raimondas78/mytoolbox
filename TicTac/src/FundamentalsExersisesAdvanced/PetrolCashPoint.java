package FundamentalsExersisesAdvanced;

import java.util.Scanner;

public class PetrolCashPoint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payableAmount =0;
        double volumeIncrement = 1.0;
        double volumeLimit = 7.0;
        double price = 2.0;
        double volume=0;

        PetrolStation petrolStation = new PetrolStation(volumeIncrement, price);

        while(volume<volumeLimit){
            System.out.println("If you want to continue refueling, press c");
            System.out.println("If you want to quit press x");
            String toContinue = scanner.nextLine();
            if (toContinue.equals("c")){
                volume=petrolStation.getVolume(volumeIncrement);
                petrolStation.printVolume();
                payableAmount=petrolStation.getAmountPayable(price);
                petrolStation.printAmountPayable();

            } else {
                break;
            }
        }

        System.out.println("-----------------------------------");

        if(payableAmount<=0){
            System.out.println("Thank you, goodbye!");
        } else{
            System.out.printf("Your payable amount = %.2f", payableAmount);
            System.out.println();
          }
        System.out.println("Please insert money");
        double insertedAmount;
        double balance;
        insertedAmount=scanner.nextDouble();

        if((insertedAmount - payableAmount)<0){
            System.out.printf("Amount is not sufficient. Please add a missing amount %.2f %n", (insertedAmount-payableAmount));
            balance=scanner.nextDouble();
            while((insertedAmount+balance-payableAmount)<0){
                System.out.printf(" Please add missing amount %.2f %n", (insertedAmount+balance-payableAmount));
                balance=scanner.nextDouble();
                if((insertedAmount+balance-payableAmount)>0){
                    break;
                }
            }
        } else if (insertedAmount==payableAmount){
            System.out.println("Thank you for refuelling");
        } else{
            System.out.printf("Please take your change %.2f %n", (insertedAmount - payableAmount));
        }




    }
}
