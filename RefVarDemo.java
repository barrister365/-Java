class MyClass {
    // выведение типов локальных переменных с пользовательским классом
    private int i;

    MyClass(int k) {
        i = k;
    }

    int geti() {
        return i;
    }

    void seti(int k) {
        if (k >= 0) i = k;
    }
}
    class RefVarDemo {
        public static void main (String [] args) {
            var mc = new MyClass(10); // Обратить внимание на использввание var
            // без var надо было писать MyClass mc = new MyClass(10)
            System.out.println ("Значение i в mc теперь равно " + mc.geti());
            mc.seti(19);
            System.out.println ("Значение i в mc теперь равно " + mc.geti());
        }
    }



