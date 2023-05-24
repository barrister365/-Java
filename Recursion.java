class Factorial {
    int fact (int n) { // внутри класса методы повторяюстся,
        // если рекурсия типа факториала (n-1)*n
        int result;
        System.out.println("Итерация после первого result");
        if (n==1) return 1; // без if с "начальной точкой отсчёта" не будет рекурсии
        result = fact(n-1)*n;
        System.out.println("2-я Итерация result");
        return result;

    }
}
class Recursion {
    public static void main (String [] args) {
        Factorial f = new Factorial();
        System.out.println ("Факториал 3 равен: " + f.fact(3));
        System.out.println ("Факториал 4 равен: " + f.fact(4));
        System.out.println ("Факториал 5 равен: " + f.fact(5));


    }
}