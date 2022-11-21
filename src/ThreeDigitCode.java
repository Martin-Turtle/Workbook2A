public class ThreeDigitCode {public static void main(String[] args) {

         int total = 0;

            for (int i = 1; i < 5; i++) {
                for (int j = 1; j < 5; j++) {
                    for (int k = 1; k < 5; k++)

                        {
                            if ((j != i) && (k != i) && (k != j)) {
                    System.out.println(i + " " + j + " " + k);
                    total += 1;
                 }
                }
             }
        }
            System.out.println("There are " + total + " unique combinations");
    }
}

