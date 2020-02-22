package main;

public class Exercise2And3FromSlide19 {
    public static void main(String[] args) {

        double input = 3.23523;
        System.out.printf("Rounded to the second decimal place %.2f", input);

        int number = 192;
        int number1 = 168;
        int number2 = 1;
        int number3 = 10;

        // Simple convert int to HEX. No special cases as per exercise, two digits and UPPER CASE
        String hexNumber = Integer.toHexString(number);
        String hexNumber1 = Integer.toHexString(number1);
        String hexNumber2 = Integer.toHexString(number2);
        String hexNumber3 = Integer.toHexString(number3);

        System.out.println(number + " " + number1 + " " + number2 + " " + number3 + " in HEX format XX:XX:XX:XX");
        System.out.println(hexNumber + ":" + hexNumber1 + ":" + hexNumber2 + ":" + hexNumber3);

        // Format HEX string to show two digits, and UPPER CASE
        hexNumber = String.format("%02x", number); // will format String to lower case c0. This why in print we need to use .toUpperCase()
        hexNumber1 = String.format("%02x", number1); // will format String to lower case a8. This why in print we need to use .toUpperCase()
        hexNumber2 = String.format("%02X", number2);
        hexNumber3 = String.format("%02X", number3);

        System.out.println(number + " " + number1 + " " + number2 + " " + number3 + " in HEX format XX:XX:XX:XX");
        System.out.println(hexNumber.toUpperCase() + ":" + hexNumber1.toUpperCase() + ":" + hexNumber2 + ":" + hexNumber3);
    }
}
