public class ForEach2 {
    public static void main (String [] args) {
        int sum = 0;
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        /*Использование break с циклом for в стиле for-each
        для отображения и суммирования значений
         */
        for (int x: nums) {
            System.out.println("Значение: " + x);
            sum+=x;
            if (x==5) break; // остановить выполнение цикла, когда получено 5
        }
        System.out.println("Сумма первых пяти элементов: " + sum);
    }
}
