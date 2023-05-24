public class NoBody {
    public static void main (String [] args) {
        int i, j;
        i = 100;
        j = 200;
        // находим среднюю
        while (++i<--j);
        // тело в цикле отсутвует
        System.out.println ("Средняя равна " + i);
    }
}
