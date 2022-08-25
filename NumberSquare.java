import java.util.Scanner;

/*
 * NumberSquare
 * Program to calculate the sum of the values of
 * the rows, columns and if it creates a 
 * "Magic square"
 * 
 * Alberto Ferreira, albertomelo.business@gmail.com
 * 2022-03-30
*/

public class NumberSquare {
    public static void main (String[] args) {

        int size = args.length;
        double columnSize = Math.sqrt(size);

        if (columnSize % 1 != 0){
            System.out.println("Not a number square!");
        } 
        
        else{
            int[] intArray;
            intArray = new int[size];

            int[] arraySumOfRow;
            arraySumOfRow = new int[(int)columnSize];
            int placementOfRow = 0;

            int[] arraySumOfColumn;
            arraySumOfColumn = new int[(int)columnSize];
            int placementOfColumn = (int) columnSize-1;

            int sumOfDiagonal1 = 0;
            int sumOfDiagonal2 = 0;

            for (int i = 0; i < size; i++){
                Scanner aReader = new Scanner(args[i]);
                intArray[i] = aReader.nextInt();
                arraySumOfRow[placementOfRow] += intArray[i];

                // Calculate Diagonals
                if (i%columnSize == placementOfRow){
                    sumOfDiagonal1 += intArray[i];
                }
                if (placementOfColumn == (i)%columnSize){
                    sumOfDiagonal2 += intArray[i];
                    placementOfColumn -= 1;
                }

                // Calculate rows and print out the row
                if ((i+1)%columnSize == 0){
                    System.out.printf("%3d | %4d\n",intArray[i],arraySumOfRow[placementOfRow]);
                    placementOfRow += 1;
                } else{
                    System.out.printf("%3d",intArray[i]);
                }
                // Calculate columns
                arraySumOfColumn[i%(int)columnSize] += intArray[i];
            }

            System.out.println("-".repeat(3*(int)columnSize));

            for (int i = 0; i < arraySumOfColumn.length; i++){
                System.out.printf("%3d", arraySumOfColumn[i]);
            }
            System.out.println();
            System.out.println("Diagonal 1: "+sumOfDiagonal1);
            System.out.println("Diagonal 2: "+sumOfDiagonal2);

            // Check if it is a Magic square
            if (sumOfDiagonal1 == sumOfDiagonal2){
                boolean magicSquareCheck = true;
                for (int i = 0; i < arraySumOfColumn.length; i++){
                    if (arraySumOfColumn[i] != sumOfDiagonal1){
                        magicSquareCheck = false;
                    }
                }

                for (int j = 0; j < arraySumOfRow.length; j++){
                    if (arraySumOfRow[j] != sumOfDiagonal1){
                        magicSquareCheck = false;
                    }
                }
                if (magicSquareCheck == true){
                    System.out.println("Magic square!");
                }
            }
        }        
    }
}
