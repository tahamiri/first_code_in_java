public class Seventh {
    private String name;
    protected int age;

    public void Seventh(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
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
    }

    public static void main(String[] args){
        System.out.println("this is an employee");
        Employee a = new Employee();
        a.setAge(20);
        System.out.println(a.age);
    }

}
