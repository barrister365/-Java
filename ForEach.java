public class ForEach {
    // использование цикла фор в стиле фор ич
    public static void main (String [] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        // Применить цикл стиле for each для отображения и суммирования значений
        for (int x: nums) {
            System.out.println("Значение: " + x);
            sum += x;
                    }
        System.out.println("Сумма: " + sum);

    }
}
