class A3 {
    int i, j;
    A3 (int a, int b) {
        i = a;
        j = b;
    }
    // отобразить значения i и j
    void show () {
        System.out.println ("i и j:" + i + " " + j);
    }
}
class B4 extends A3 {
    int k;
    B4 (int a, int b, int c) {
        super (a, b);
        k = c;
    }
// отобразить к - переопределяет show () в А3
    void show () {
        System.out.println ("k: " + k);
    }
}
public class OverRide {
    public static void main (String [] args) {
        B4 subOb = new B4(1,2,3);
        subOb.show(); // вызывается show из B4
    }
}
