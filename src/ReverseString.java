import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print ("Tell me your name : ");
        char[] letters = reader.nextLine().toCharArray();


        String originalStr = String.valueOf(letters);
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);

    }
}

