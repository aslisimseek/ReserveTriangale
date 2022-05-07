import java.io.File;
import java.util.Scanner;

public class ReserveTriangale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Number Step..:");
        int numberStep = scanner.nextInt();

        for (int i = numberStep; i >= 0; i--) {
            for (int k = 0; k <= (numberStep - i + 1); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
