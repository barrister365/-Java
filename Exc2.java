public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {// отслеживать блок кода
            d = 0;
            a = 42 / 0;
            System.out.println("Это выводится не будет");
        } catch (ArithmeticException e) {// перехватить ошибку деления на нуль
            System.out.println("Деление на нуль");
        }
        System.out.println("После оператора catch");
    }
}
