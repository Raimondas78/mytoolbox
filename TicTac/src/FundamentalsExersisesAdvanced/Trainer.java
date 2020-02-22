package FundamentalsExersisesAdvanced;

import java.util.Scanner;

public class Trainer {

    public static void main(String[] args) {
        Trainee trainee = new Trainee("Jonas", 50,20);
        Exercises exercises = new Exercises();
        Scanner scanner = new Scanner(System.in);
        Supplement banana = new Supplement(200,100, "banana");
        Supplement choccoBar = new Supplement(150,50, "choccoBar");
        Supplement meatBalls = new Supplement(1000, 200, "meatBalls");
        Supplement[] arrayOfSupplements = {banana,choccoBar,meatBalls};
        String suppl;
        String lastExercise;

        System.out.println("Welcome to our training");
        System.out.println("To start training press c");
        String check = scanner.nextLine();

        while(check.equals("c")){
            System.out.println("Your stamina = " + trainee.stamina + " your strength = " + trainee.strength);
            System.out.println("Let's do some exercises");

            if(trainee.stamina==0 || trainee.stamina<10){
                System.out.println("Please take some supplement before continuing");
                System.out.println("Choose from existing ones");
                for(int i=0;i<arrayOfSupplements.length;i++){
                    System.out.println(arrayOfSupplements[i].name);
                }
                suppl=scanner.nextLine();
                if(suppl.equals("banana")){
                    trainee.stamina=trainee.stamina + ((banana.calories*banana.gramms)/1000);
                    System.out.println("Your stamina = " + trainee.stamina + " your strength = " + trainee.strength);
                } else if(suppl.equals("choccoBar")){
                    trainee.stamina=trainee.stamina + ((choccoBar.calories*choccoBar.gramms)/1000);
                    System.out.println("Your stamina = " + trainee.stamina + " your strength = " + trainee.strength);
                } else if(suppl.equals("meatBalls")){
                    trainee.stamina=trainee.stamina + ((meatBalls.calories*meatBalls.gramms)/1000);
                    System.out.println("Your stamina = " + trainee.stamina + " your strength = " + trainee.strength);
                } else{
                    System.out.println("Incorrect input");
                }
            }
            exercises.squats(trainee);
            lastExercise = "squats";

            System.out.println("Your parameters are: stamina " + trainee.stamina + " strength " + trainee.strength);
            System.out.println("If you want to quit, press x or c to continue");
            check=scanner.nextLine();
            if (check.equals("x")) {
                break;
            }
            if(trainee.stamina>50){
                System.out.println("Let's do some pull ups");
                exercises.pullUps(trainee);
                lastExercise="pullUps";
                System.out.println("Your parameters are: stamina " + trainee.stamina + " strength " + trainee.strength);
            } else{
                System.out.println("Let's do some push ups");
                exercises.pushUps(trainee);
                lastExercise="pushUps";
                System.out.println("Your parameters are: stamina " + trainee.stamina + " strength " + trainee.strength);
            }

        }

    }
// Exercise methods




}
