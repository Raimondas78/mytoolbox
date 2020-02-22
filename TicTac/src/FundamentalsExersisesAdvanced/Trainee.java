package FundamentalsExersisesAdvanced;

public class Trainee {

    String name;
    double stamina;
    double strength;

    public Trainee(String name, double stamina, double strength) {
        this.name = name;
        this.stamina = stamina;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }
}
