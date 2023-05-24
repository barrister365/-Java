class Test3 { // управление доступом
    int a; // стандартный доступ
    public int b; // открытый доступ
    private int c; // закрытый доступ
    // методы для доступа к с
    void setc (int i) { // установить значение с
        c = i;
    }
    int getc () { // получить значение с
        return c;
    }
}
class AccesTest {
    public static void main (String [] args) {
        Test3 ob = new Test3 ();
        // Поступать так можно так как a и b доступ разрешён
        ob.a = 10;
        ob.b = 20;
        // Поступать так нельзя так как возникнет ошибка
//        ob.c = 100; // 'c' has private access in 'Test3'
        // Получать доступ к члену c можно только через его методы
        // в данном случае это sets () и gets()
        ob.setc(100);
        System.out.println ("a, b и с: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}