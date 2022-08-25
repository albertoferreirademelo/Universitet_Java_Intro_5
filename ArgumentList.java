import java.util.Scanner;
/*
 * ArgumentList
 *
 * Alberto Ferreira, albertomelo.business@gmail.com
 * 2022-03-17
*/

public class ArgumentList {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            System.out.println((i+1)+": "+args[i]);
        }        
    }
}