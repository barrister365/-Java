/* Демонстравция работы иф

 */
public class ifsample {
    public static void main (String[] args) {
    int x, y;
    x = 10;
    y = 20;
    // выводим на экран
    if (x < y) System.out.println("Значение меньше y");
    x = x * 2;
    if (x == y) System.out.println("Теперь значение равно х и н");
    x = x * 2;
    if (x > y) System.out.println ("Теперь значение х больше Y");
    x = x * 2;
    if (x == y) System.out.println ("неверно"); // этот не видно будет

    }
}
