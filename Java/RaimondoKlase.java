import java.util.Random;

public class RaimondoKlase {

    public static void main(String[] args) {
        int[] arrayOfInts = {15, 17, 13, 10, 8};
        int minValue = 0;
        int maxValue = 0;
        int sumOdds =0;
        int sumEvens=0;
        int sum = 0;
        int average = 0;
        for (int n : arrayOfInts) {
            sum += n;
            if (n % 2 != 0) {
                System.out.print(n + ", ");
                sumOdds++;
            } else if(n%2==0){
                sumEvens++;
            }
            if (minValue > n) {
                minValue = n;
            } else if (maxValue < n) {
                maxValue = n;
            }
        }
        System.out.println("sum = " + sum + " average = " + sum / arrayOfInts.length + " Min Value = " + minValue +
                " Max Value = " + maxValue + " sum of Odds = " + sumOdds + " sum of Evens = " + sumEvens);


        int[] arrayReversed = new int[arrayOfInts.length];
        System.out.println("length " + arrayOfInts.length);
        int j=0;
        for (int i = arrayOfInts.length-1; i >=0; i--) {

            arrayReversed[j] = arrayOfInts[i];
            System.out.println(arrayReversed[j]);
            j++;
        }

        int number=7;
        int[] extendedArray = new int[arrayOfInts.length+1];
        for(int i =0; i <=arrayOfInts.length; i++){
            if(i<2) {
                extendedArray[i] = arrayOfInts[i];
            } else if(i==2){
                extendedArray[i] =number;
            } else if (i>2){
                extendedArray[i]=arrayOfInts[i-1];
            }

        }
        int duplicate;
        int[] arrayOfDuplicates= new int[extendedArray.length];
        for(int i=0;i<extendedArray.length;i++){

            for(int k=i+1; k<extendedArray.length;k++){ //svarbu: k=i+1 kad nebetikrintu saves
                if(extendedArray[k]==extendedArray[i] && k!=i){
                    System.out.println(extendedArray[i] + " duplicate number ");
                }
            }
        }
        int secondMaxValue = 0;
        maxValue=0;
        for(int n:extendedArray) {
            if (maxValue < n) {
                maxValue = n;
            }
        }
        System.out.println("max value " + maxValue);

        for(int i=0; i<extendedArray.length; i++){
            if (extendedArray[i]==maxValue){
                continue;
            } else if(extendedArray[i]<maxValue && extendedArray[i]>secondMaxValue){
                secondMaxValue=extendedArray[i];
            }

        }
        System.out.println("second max value " + secondMaxValue);

        int sumOfPair =4;

        int[] newArray = {1,2,7,3,10,2,9};
        for(int i=0; i<newArray.length; i++){
            for(int k=i+1;k<newArray.length; k++){
                if (newArray[i]+newArray[k] ==sumOfPair) {
                    System.out.println(newArray[i] + "-" + newArray[k]);
                }
            }
        }
        System.out.println();
        System.out.println(RaimondoKlaseDu.compareMyStrings("Witch","The Witch"));
        System.out.println(RaimondoKlaseDu.compareMyStrings("2obuoliai",2));
        System.out.println(RaimondoKlaseDu.compareMyStrings(123,12));

    }

}


