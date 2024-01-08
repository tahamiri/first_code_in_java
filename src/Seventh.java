public class Seventh {
    protected String name = "taha";
    protected int age;

    public void Seventh(String name){
        this.name = name;
    }


    public void setAge(int age){
        this.age = age;
    }

    protected String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        System.out.println("this is a person");

    }
}

class Employee extends Seventh {
    private int id;

    public void setId(int id){
        this.id = id;
    }

    public void setAge(int age){
        this.age = age + 100;
        String x = super.getName();
        System.out.println(x);
    }

    public static void main(String[] args){
        System.out.println("this is an employee");
        Employee a = new Employee();
        a.setAge(20);
        System.out.println(a.age);

    }

}
