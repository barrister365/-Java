class A1 {
    // Использование super для преодаления сокрытия имён
    int i;

}
// Создать подкласс путём расшрения класса А1
class B1 extends A1 {
    int i; // этот член i скрывает i в А1
    B1 (int a, int b) {
        super.i = a; // i в А
        i = b; // i в B
    }
    void show () {
        System.out.println ("i в суперклассе :" + super.i);
        System.out.println ("i в подклассе :" + i);
    }
}
class UseSuper {
    public static void main (String [] args) {
        B1 subOb = new B1 (1,2);
        subOb.show();
    }
}