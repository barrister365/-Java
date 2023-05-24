public class BreakLoop {
    // прерываение цикла
    public static void main (String [] args) {
        for (int i = 0; i<100;i++) {
            if (i==10) break; // прерывание цикла при 10
            System.out.println("i: " + i);
                    }
        System.out.println ("Цикл завершён");
    }
}
