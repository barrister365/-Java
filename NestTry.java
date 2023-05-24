public class NestTry {
    public static void main (String[] args) {
        try {
            int a = args.length;
            /* Если аргументы командной строки отсутствуют,
            то следующий оператор сгенрерирует исключение деления на нуль

             */
            int b = 42 / a;
            try {// вложенный блок try
                /* Если используется один агрумент командной строки, тогда
                исключение деления на нуль сгенерирует следующий код
                 */
                if (a == 1) a = a / (a - a); // деление на нуль
                 /* Если используется один агрумент командной строки, тогда
                генерируется исключение выхода за допустимые пределы индекса в массиве
                 */
                if (a == 2) {
                    int[] c = {1};
                    c[42] = 99; // генерирует исключение ArrayIndexOutOfBoundsException
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за допустимые пределы индекса в массиве:" + e);


            }
        }
        catch (ArithmeticException e) {
            System.out.println("Деление на нуль:" + e);

        }
    }
}
