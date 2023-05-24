public class ForTest {
    //public (значит видна всем - видимость класса)
    // static (кл. слово значит, что можно вызвать
    // ещё main () без конкрентного экземпляра класса
    // void (означает что маин не возвращает значение)
    public static void main (String [] args) {
        // демонстрация работы цикла фор
        int x;
        for (x = 0; x <= 10; x++)
            System.out.println ("ябадабаду" + x);
    }

}
