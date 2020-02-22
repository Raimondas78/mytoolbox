package FundamentalsExersisesAdvanced;

public class Exercises {

    public Trainee squats(Trainee trainee){
        if(trainee.stamina<0 || trainee.strength<0){
            System.out.println("Invalid value");
            return null;
        }
        if(trainee.stamina<10){
            System.out.println("In order to do this exercise You need to take supplements to increase your stamina");
        } else {
            for (int i = 1; i <= 10; i++) {
                trainee.stamina--;
                trainee.strength++;
            }
        }
        return trainee;
    }

    public Trainee pushUps(Trainee trainee){
        if(trainee.stamina<0 || trainee.strength<0){
            System.out.println("Invalid value");
            return null;
        }
        if(trainee.stamina<10){
            System.out.println("In order to do this exercise You need to take supplements to increase your stamina");
        } else {
            for (int i = 1; i <= 10; i++) {
                trainee.stamina--;
                trainee.strength+=2;
            }
        }
        return trainee;
    }

    public Trainee pullUps(Trainee trainee){
        if(trainee.stamina<0 || trainee.strength<0){
            System.out.println("Invalid value");
            return null;
        }
        if(trainee.stamina<25){
            System.out.println("In order to do this exercise You need to take supplements to increase your stamina");
        } else {
            for (int i = 1; i <= 5; i++) {
                trainee.stamina= trainee.stamina-5;
                trainee.strength+=2;
            }
        }
        return trainee;
    }

    public Trainee breathing(Trainee trainee){
        if(trainee.stamina<0 || trainee.strength<0){
            System.out.println("Invalid value");
            return null;
        }
                System.out.println("During this exercise You will restore your stamina");
                for (int i = 1; i <= 10; i++) {
                trainee.stamina--;
                trainee.strength++;
            }
           return trainee;
    }

}
