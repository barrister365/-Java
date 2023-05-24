public class BoolTest {
    public static void main (String [] args) {
        // Демонстрация булин
        boolean b;
        b = false;
        System.out.println ("b равно " + b);
        b = true;
        System.out.println ("b равно " + b);
        // значение булин может управлять оператором иф
        if (b) System.out.println ("Это выполняется");
        b = false;
        if (b) System.out.println ("Это не выполняется");
        //результатом операции отношения является значение boolean
        System.out.println ("10 > 9 равно " + (10>9));

    }
}
