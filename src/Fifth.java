public class Fifth {
    public String name = "taha";
    private int age;

    {
        age = 20;
    }

    public Fifth(int a){
        age = a;
    }

    public static void main (String[] args){
        Fifth f;
        f = new Fifth(10);
        System.out.println(f.name);
        System.out.println(f.age);
    }

}