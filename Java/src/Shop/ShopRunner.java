package Shop;

import java.util.Scanner;

public class ShopRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cart = new String[5];
        Product[] arrayOfProducts = new Product[5];
        arrayOfProducts[0] = new Product("milk",0.89f);
        arrayOfProducts[1] = new Product("bread", 1.54f);
        arrayOfProducts[2] = new Product("noodles", 1.04f);
        arrayOfProducts[3] = new Product("butter", 1.85f);
        arrayOfProducts[4] = new Product("sausage", 5.87f);

        System.out.println("Hello! Welcome to our shop. Choose of available products:");
        for(Product n: arrayOfProducts){
            System.out.println(n.getName() +" "+n.getPrice());
        }

        int choiceCount=1;
        float payableAmount = 0;
        float balance = 0;
        float insertedAmount=0;
        String exit="yes";
        while(choiceCount<6){
            System.out.println("Please add product name: bread, milk, butter, sausage, noodles" + " choice No. " +
                    choiceCount);
            String buyerChoice = scanner.nextLine();
            for(int i=0;i<arrayOfProducts.length;i++){
                if(buyerChoice.toLowerCase().equals(arrayOfProducts[i].name)){
                    cart[choiceCount-1]=buyerChoice;
                    payableAmount+=arrayOfProducts[i].price;
                    choiceCount++;
                    break;

                }

            }

        }
        System.out.printf("Your payable amount = %.2f %n", payableAmount);
        System.out.println("Please insert money");
        insertedAmount=scanner.nextFloat();
        if((insertedAmount - payableAmount)<0){
            System.out.printf("Amount is not sufficient. Please add a missing amount %.2f %n", (insertedAmount-payableAmount));
            balance=scanner.nextFloat();
            while((insertedAmount+balance-payableAmount)<0){
                System.out.printf(" Please add missing amount %.2f %n", (insertedAmount+balance-payableAmount));
                balance=scanner.nextFloat();
                if((insertedAmount+balance-payableAmount)>0){
                    break;
                }
            }
        } else if (insertedAmount==payableAmount){
            System.out.println("Thank you for shopping");
        } else{
            System.out.printf("Please take your change %.2f %n", (insertedAmount - payableAmount));
        }








    }
}
