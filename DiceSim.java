import java.util.Scanner;
import java.util.Arrays;

/*
 * DiceSim
 * 
 * Alberto Ferreira, albertomelo.business@gmail.com
 * 2022-03-30
*/

public class DiceSim {

    public static void main (String[] args) {

        // Reading the input and transforming to int
        String aString = args[0];
        Scanner aReader = new Scanner(aString);
        int diceValue = aReader.nextInt();

        //Creating an Array with the value 1-6
        int[] tableNumber;
        tableNumber = new int[] {1,2,3,4,5,6};

        //Creating the Array with the results
        int[] diceArray;
        diceArray = new int[diceValue];

        // Creating an array with the sum of the results of the dice
        int diceSides = 6;
        int [] sumArray;
        sumArray = new int[diceSides];

        int totalValue = 0; //variable with the sum of all casts

        // Rolling the dice, saving in an array and adding the value in another array
        for (int i = 0; i < diceValue; i++){
            int value = (int) (Math.random () * 6) + 1;
            diceArray[i] = value;
            sumArray[value-1] += 1;
            totalValue += value;
        }

        float averageValue = (float) totalValue/diceValue; // Calculate Average

        //Calculating Median
        float diceMedian = 0;
        Arrays.sort(diceArray);

        if (diceValue%2 == 0){
            int sumMidMedian;
            sumMidMedian = diceArray[diceValue/2] + (diceArray[(diceValue/2) - 1]);
            diceMedian = (float) sumMidMedian/2;
        } else{
            diceMedian = diceArray[diceValue/2];
        }

        // Printing out the values
        System.out.println("Average: " + String.format("%.3f", averageValue));
        System.out.println("Median: " + String.format("%.1f", diceMedian));
        System.out.println("Histogram:");
        System.out.printf("%6d%6d%6d%6d%6d%6d%n", 1,2,3,4,5,6);
        System.out.printf("%6d%6d%6d%6d%6d%6d%n", sumArray[0],sumArray[1],sumArray[2],sumArray[3],sumArray[4],sumArray[5]);
    }
}
