public class RaimondoKlaseDu {

    public static boolean compareMyStrings(String one, String two) {
        if (one.equals(two)) {
            return true;
        }
        return false;
    }
    public static boolean compareMyStrings(String expr, int number){
        if(expr.contains(Integer.toString(number))){
            System.out.println(expr + " " + number);
            return true;

        }
        return false;
    }

    public static boolean compareMyStrings(int one, int two){
        String oneNo = Integer.toString(one);
        String twoNo = Integer.toString(two);
        if (oneNo.contains(twoNo)){
            System.out.println(oneNo +" " + twoNo);
            return true;
        } return false;
    }

    }
