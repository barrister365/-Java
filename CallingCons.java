class A2 {
    // Конструкторы классов А, В и С как бы расширяют друг
    // друга, добавляя свои свойства
    A2() {
        System.out.println ("Внутри конструктора А");
    }
}
class B2 extends A2 {
    B2() {
        System.out.println ("Внутри конструктора B");
    }
}
class C extends B2 {
    C () {
        System.out.println ("Внутри конструктора С");
    }
}
public class CallingCons {
    public static void main (String [] args) {
        C c = new C();
    }
}
