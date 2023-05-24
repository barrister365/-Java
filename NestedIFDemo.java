class A4532 {
    // Класс A4532 содержит вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative (int x);
    }
}
// Класс B реализует вложенный интерфейс
class B546 implements A4532.NestedIF {
    public boolean isNotNegative (int x) {
        return x < 0 ? false : true;
    }
}

class NestedIFDemo {
    public static void main (String [] args) {
        // Использовать ссылку на вложенный интерфейс.
        A4532.NestedIF nif = new B546();
        if (nif.isNotNegative(10))
            System.out.println ("10 не является отрицательным");
        if (nif.isNotNegative(-12))
            System.out.println ("Это выводится не будет");
        }
    }

