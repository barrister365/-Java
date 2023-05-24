class OverLoadDemo2 {
    void test () {
        System.out.println("Параметры отсутвуют");
    }
    // Перегрузить метод тест для целочисленных значений
    void test (int a, int b) {
        System.out.println ("а и b: " + a + " " + b);

    }
    // Перегрузить тест для параметра типа double
    void test (double a) {
        System.out.println ("Внутри test (double): " + a);

    }
}
class Overload2 {
    public static void main (String[] args) {
        OverLoadDemo2 ob = new OverLoadDemo2();
        int i = 88;
        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.25);
    }
}