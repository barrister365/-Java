interface A2344 {
    // Один интерфейс может расширять другой

    void meth1();
    void meth2();
}
interface B4234 extends A2344 {
    void meth3(); // Интерфейс В теперь включает meth1() и meth2() и добавляет meth3()
}
class MyClass2344 implements B4234 {
    public void meth1() {
        System.out.println ("Реализация meth1().");
    }
    public void meth2() {
        System.out.println ("Реализация meth2().");
    }
    public void meth3() {
        System.out.println ("Реализация meth3().");
    }
}
class IFExtend {
    public static void main (String [] args) {
        MyClass2344 ob = new MyClass2344();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
