class Test1 {
    int a, b;
    Test1 (int i, int j) { // конструктор
        a = i;
        b = j;
    }
    // Передать объект
    void meth (Test1 o) { // как бы копирются данные с основного класса в этот метод
        // с помощью операции точки и в сам метод прописывается конструктор без запятой
        // и параметр, в данном случае параметр o
        o.a *= 2;
        o.b /=2;
    }
}
class PassObjRef {
    public static void main (String [] args) {
        Test1 ob = new Test1(15,20);
        System.out.println("ob.a и ob.b перед вызовом: " + ob.a + " " + ob.b);
        ob.meth(ob); // функция ob взяла на себя 15 и 20, затем операция точки
        // метод meth и в нём уже будет функция ob с 15 и 20; то есть мы эти числа
        // прогоняем o.a *= 2;  и o.b /=2;
        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);

    }
}
