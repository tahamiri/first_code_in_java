public class Eighth {
    int a;
    int b;

    protected Eighth(int a, int b){
        this.a = a;
        this.b = b;
    }
}

class SubClass extends Eighth{
    int c;

    protected SubClass(int a, int b, int c){
        super(a, b);
        this.c = c;
    }
}
