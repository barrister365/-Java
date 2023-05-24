public class Return {
    // Демонтрация работы return
    public static void main (String [] args) {
        boolean t = true;
        System.out.println ("Перед оператором return");
        if (t) return; // возвратить управление вызываеющей стороне
        System.out.println ("Это выполнятся не будет");
    }
}
