public class ChainExcDemo {
    static void demoproc() {
        // создать исключение
        NullPointerException e = new NullPointerException("Верхний уровень");
        // добавить причину
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }
    public static void main (String [] args) {
        try {
            demoproc();

        } catch (NullPointerException e) {
            // отобразить исключения верхнего уровня
            System.out.println ("Перехвачено: " + e);
            // Отобразить исключение - причину
            System.out.println ("Первоначальная причина: " + e.getCause());
        }
    }
}

