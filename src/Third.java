import java.util.Scanner;
public class Third {
    public static void main(String[] args) {

        char[] array2 = {'a','s','d'};

        String x = "hello world";

        Character[] array = new Character[x.length()];

        int z = x.length();

        for (int i=0; i < z; i++){

            array[i] = x.charAt(i);

        }

        for (int i = 0; i < z; i++){
            System.out.println(array[i]);

        }
    }
}
