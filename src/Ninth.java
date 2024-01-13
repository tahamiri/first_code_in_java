import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int div = division(first, second);
            System.out.println(div);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static int division(int first, int second) throws Exception {
        if (second == 0)
            throw new Exception("makhraj sefre!");
        return first/second;
    }
}
