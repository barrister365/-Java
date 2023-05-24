public class ThrowsDemo {
    static void throwsOne () throws IllegalAccessException {
        System.out.println ("Внутри throwsOne().");
        throw new IllegalAccessException("Демонстрация");
    }
    public static void main (String [] args) {
        try {
            throwsOne();
        }
        catch (IllegalAccessException e) {
            System.out.println ("Перехвачено " + e);
        }
    }
}
