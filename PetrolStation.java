package FundamentalsExersisesAdvanced;


public class PetrolStation {
    double volume=0;
    double price;
    double volumeIncrement;
    double amountPayable=0;

    public PetrolStation(double price, double volumeIncrement) {
        this.price = price;
        this.volumeIncrement = volumeIncrement;
    }

    public PetrolStation() {
        this.price=1;
        this.volumeIncrement=1;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolumeIncrement() {
        return volumeIncrement;
    }

    public void setVolumeIncrement(double volumeIncrement) {
        this.volumeIncrement = volumeIncrement;
    }

    public double getAmountPayable(double price){
        return amountPayable+=price;
    }
    public double getVolume(double volumeIncrement){
        return volume+=volumeIncrement;
    }

    public void printAmountPayable(){
        System.out.println("Your payable amount = " + amountPayable);
    }
    public void printVolume(){
        System.out.println("Your fuel input volume = " + volume);
    }

}
