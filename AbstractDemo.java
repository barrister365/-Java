abstract class A32 {
    abstract void callme ();
    void callmetoo () {
        System.out.println ("Это конкретный метод");
    }
}
class B21 extends A32 {
    void callme () {
        System.out.println ("Реализация callme () в классе B21");
    }
}

public class AbstractDemo {
    public static void main (String [] args) {
        B21 b = new B21();
        b.callme();
        b.callmetoo();
    }
}
