public class Tenth {
    private static final Tenth instance = new Tenth();

    public static Tenth getInstance() {
        return instance;
    }

    public int division(int a, int b){
        if(b==0)
            throw new ArithmeticException("Division by Zero");
        return a/b;
    }

    public int multiply(int a, int b){
        return a*b;
    }
}


