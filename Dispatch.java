class A4 {
    void callme () {
        System.out.println ("Внутри метода callme() класса А");
    }
}
class B3 extends A4 {
    void callme () {
        System.out.println ("Внутри метода callme() класса B");
    }
}
class C3 extends A4 {
    void callme () {
        System.out.println ("Внутри метода callme() класса C");
    }
}
public class Dispatch {
    public static void main (String [] args) {
        A4 a = new A4 (); // объект типа А4
        B3 b = new B3 (); // объект типа B3
        C3 c = new C3 (); // объект типа C3
        A4 r; // получить ссылку типа А4
        r = a; // r ссылается на объект А4
        r.callme(); // вызывается версия callme() из А4
        r = b; // r ссылается на объект B3
        r.callme(); // вызывается версия callme() из B3
        r = c; // r ссылается на объект C3
        r.callme(); // вызывается версия callme() из C3





    }
}
