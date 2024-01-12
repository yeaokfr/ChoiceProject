import java.util.Scanner;
import java.lang.Math;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int square;
        System.out.println("Input a number (integers only)");
        square = scan.nextInt();
        System.out.println(" ");

        int rootNum = (int)Math.sqrt(square);

        if (square == rootNum*rootNum) {
            System.out.println("Your number is a perfect square");
        } else {
            System.out.println("Your number is not a perfect square");
        }
    }
}
