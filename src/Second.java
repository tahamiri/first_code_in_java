import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        // comment

        /* commmmm
        mmmmmmmment
         */
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();

        int length = scanner.nextInt();

        int area = width*length;

        System.out.println(area);

        double x = 25.2555;

        System.out.format("x is: %4.2f", x);

        scanner.close();
    }
}
