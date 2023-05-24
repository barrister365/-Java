class A {
    // Создание супер класса А и подкласса В
    int i, j;
    void showij () {
        System.out.println("i и j: " + i + " " + j);
    }
}
class B extends A {
    int k;
    void showk () {
        System.out.println("k: " + i + " " + j);
    }
    void sum () {
        System.out.println ("i+j+k: " + (i+j+k));
    }
}
class SimpleInheritance {
    public static void main (String [] args) {
        A superOb = new A();
        B subOb = new B();
        // Использование супер класса самого по себе
        superOb.i=10;
        superOb.j=20;
        System.out.println ("Содержимое superOb: ");
        superOb.showij();
        System.out.println();
        // Подкласс  имеет доступ ко всем открытым членам своего суперкласса
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println ("Содержимое subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Сумма i, j и k в subOb: ");
        subOb.sum();
    }
}