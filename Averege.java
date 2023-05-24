public class Averege {
    public static void main (String [] args) {
        double [] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        // делаем переменную, чтобы инциализировать цикл i = 0,
        // затем условие что i "до 5 не включительно так как с нуля начинается счёт
        int i;
        for (i=0; i<5; i++)
            // тут в result как бы должны войти все переменные массива,
            // подсчитанные циклом for
            result = result + nums[i];
        System.out.println("Среднее значение: "+ result/5);
    }
}
