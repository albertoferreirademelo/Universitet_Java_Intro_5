import java.util.Scanner;
import java.util.Arrays;

/*
 * NumberList 
 * Sort a list of numbers and print out the min, max and average
 * Alberto Ferreira, albertomelo.business@gmail.com
 * 2022-03-17
*/

public class NumberList {
    public static void main(String[] args) {
        int size = args.length;
        int[] intArray;
        intArray = new int[size];

        double sumOfValues = 0;

        System.out.println("Original:");

        for (int i = 0; i < size; i++){
            Scanner aReader = new Scanner(args[i]);
            intArray[i] = aReader.nextInt();
            sumOfValues += intArray[i];
            System.out.print (intArray[i] + " ");
        }
        System.out.println();
        System.out.println("Sorted:");
        
        int[] sorted_list;
        sorted_list = intArray;
        Arrays.sort(sorted_list);
        for (int i = 0; i < size; i++){
            System.out.print(sorted_list[i] + " ");
        }
        System.out.println();

        System.out.println("Min: " + sorted_list[0]);
        System.out.println("Min: " + sorted_list[size-1]);
        System.out.println("Avg: " + sumOfValues/size);
    }
}
