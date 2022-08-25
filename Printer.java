public class Printer {

    public static void main(String[] args) {
        int[] numbers = { 5, 0, -23 };
        System.out.println(numbers[1]);
        numbers[1] += 16;
        int[] values = numbers;
        System.out.println("--------------------");
        for (int i = 0; i < numbers.length; i++)
            System.out.println (numbers[i]);
        System.out.println("--------------------");
        values[0] = 10;
        values[2] *= -2;
        for (int i = 0; i < numbers.length; i++)
            System.out.println (numbers[i]);
    }    
}
