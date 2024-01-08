package package1;

public class sixth {
    private int length;
    private final int number = 6;
    private int width;

    public void setLength(int length){
        this.length = length;
    }

    public static void main(String[] args){
        sixth s = new sixth();
        s.setLength(5);
        System.out.println(s.length);
    }
}
