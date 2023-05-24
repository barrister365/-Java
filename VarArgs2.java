public class VarArgs2 {
    // Использование аргумента переменной длины со стандартными переменными
    static void vaTest (String msg, int ... v) {
        System.out.print (msg + v.length + " Содержимое: ");
        for (int x: v)
            System.out.print (x + " ");
        System.out.println ();
    }
    public static void main (String [] args) {
        vaTest("Один аргумент переменной длины: ", 10);
        vaTest("Три аргумента переменной длины: ", 1, 2, 3);
        vaTest("Без аргументов переменной длины: ");
    }
}
