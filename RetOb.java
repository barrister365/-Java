class Test2 {
    int a;

    Test2 (int i) {
        a = i;
    }
    Test2 IncrByTen () {
        Test2 temp = new Test2(a + 10);
        return temp;
        }
}
class RetOb {
    public static void main (String [] args) {
        Test2 ob1 = new Test2 (2);
        Test2 ob2;

        ob2 = ob1.IncrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2 = ob2.IncrByTen();
        System.out.println("ob2.a после второго увеличения: " + ob2.a);
    }
}

