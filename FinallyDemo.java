public class FinallyDemo {
    // Демонстрация применения finally.
    // Сгенерировать исключние внутри метода
    static void procA() {
        try {
            System.out.println ("Внутри метода procA().");
            throw new RuntimeException("Демонстрация");
        }
        finally {
            System.out.println ("Блок finally метода procA()");

        }
    }
    // возвратить управление изнутри блока try
    static void procB() {
        try {
            System.out.println ("Внутри метода procB().");
            return;
                    }
        finally {
            System.out.println ("Блок finally метода procB()");
        }
    }
    // выполнить блок try обычным образом
    static void procC() {
        try {
            System.out.println("Внутри метода procС().");
        }
        finally {
            System.out.println ("Блок finally метода procС()");
        }
    }
    public static void main (String [] args) {
        try {
            procA();
        }
        catch (Exception e) {
            System.out.println ("Исключение перехвачено");
        }
        procB();
        procC();
    }
}
