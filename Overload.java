class OverloadDemo {
    void test () {
        System.out.println ("Параметры отсутвуют");

    }
    // Перегрузить тест для одного целочисленного параметра
    void test (int a) {
        System.out.println("a: " + a);
    }
    // Перегрузить тест для двух целочисленных параметров
    void test (int a, int b) {
        System.out.println("a и b: " + a + " " + b);

    }
    // Перегрузить тест для одного целочисленного параметра типа double
    double test (double a) {
        System.out.println ("double a: "+ a);
        return a*a;
    }
}
class Overload {
    public static void main (String [] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        // вызвать все версии тест
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println ("Результат вызова ob.test (123.25): " + result);
    }
}