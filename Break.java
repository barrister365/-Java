public class Break {
    // использование break с метками
    public static void main (String [] args) {
        boolean t = true;
        first: {
            second: {
            third: {
                System.out.println ("Перед оператором break");
                    if (t) break second; // выходим из блока second;
                    System.out.println ("Этот оператор не выполнится");

            }
            System.out.println ("Этот опреатор не выполнится");
            }
            System.out.println ("После блока second");

        }
    }
}
