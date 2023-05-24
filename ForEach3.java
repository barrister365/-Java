public class ForEach3 {
    /* проход по многомерным массивам.
    Использование цикла for в стиле for-each для прохода по двумерному массиву
       */
    public static void main (String [] args) {
        int sum = 0;
        int [][] nums = new int [3][5];
        // Сохранить в nums ряд значений
        for (int i = 0; i<3; i++)
            for (int j = 0; j<5; j++)
                nums[i][j] = (i+1)*(j+1);
        // Применить цикл for в стиле for each для отображения и суммирования значий
        for (int [] x: nums) {
            for (int y: x) {
                System.out.println("Значение: " + y);
                sum+=y;
            }
                    }
        System.out.println("Сумма: " + sum);
    }
}
