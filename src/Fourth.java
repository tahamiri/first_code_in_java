import java.util.Scanner;
public class Fourth {
    private String name;
    private int age;

    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name = n;
    }

    public void shoot(){
        System.out.println("Shoot!");
    }

    public void run(){
        System.out.println("Run!");
    }

    public int getAge(){
        return (age);
    }

    public static void main(String[] args) {

        Fourth player = new Fourth();
        player.setAge(20);
        player.setName("taha");
        player.shoot();
        int age = player.getAge();
        System.out.println(age);
    }
}
