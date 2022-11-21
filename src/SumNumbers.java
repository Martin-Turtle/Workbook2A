import java.util.Scanner;

public class SumNumbers {
       public static void main(String[] args) {
        // Activity title: SumNumbers

        int sumTotal =0;
        // ask user for number to sum
        Scanner reader = new Scanner(System.in);
        System.out.print ("Input a number to sum to: ");
        int number = reader.nextInt(); // remember the user input

        int i = 1;
        while (i <= number) {
            System.out.println(i); // print all numbers to add
            sumTotal = i+ sumTotal;
            i++;
        }
        System.out.println ("The sum of all numbers from 1 to " + number + " is " + sumTotal);
    }
}

