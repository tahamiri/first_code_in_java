public class Eleventh {
    public static void main(String[] args) {
        new Thread(new PrintThread()).start();


        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }
    }
}

class PrintThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println(i);
        }
    }
}
