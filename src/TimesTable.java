import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print ("what times table would you like to display? Enter a number : ");
        int number = reader.nextInt();

        for(int i = 1; i <= 12; i++)
        {
            System.out.print(number + "x"  + i + "=" + number*i );
            System.out.print("\n");
        }
    }
}
