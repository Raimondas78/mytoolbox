package FundamentalsExersisesAdvanced;

public class Supplement {
double calories;
double gramms;
String name;

    public Supplement(double calories, double gramms, String name) {
        this.calories = calories;
        this.gramms = gramms;
        this.name=name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getGramms() {
        return gramms;
    }

    public void setGramms(double gramms) {
        this.gramms = gramms;
    }
}
