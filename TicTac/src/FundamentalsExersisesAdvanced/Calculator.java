package FundamentalsExersisesAdvanced;

public class Calculator {
    double x;
    double y;

    public Calculator() {
        this.x = x;
        this.y = y;
    }

    public double getSum(double x, double y){
        return x+y;
    }

    public double getMulti(double x, double y){
        return x*y;
    }

    public double getSub(double x, double y){
        return x - y;
    }

    public double getDiv(double x, double y){
        if(y==0){
            System.out.println("Invalid value. Cannot divide by 0 ");
            return -1;
        }
        return x/y;
    }

}
