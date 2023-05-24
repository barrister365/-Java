class Box {
    // Программа, в которой используется класс Box
    double width;
    double height;
    double depth;
}
class BoxDemo2 {
    public static void main (String [] args) {
        Box mybox1 = new Box (); // Объявляется тип переменной, тут тип - это класс,
        // затем new и снова название класса и обычные скобки
        Box mybox2 = new Box ();
        double vol;
        // Присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 30;
        // Присвоить значение переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        // Вычислить объём первой коробки
        vol = mybox1.width*mybox1.height*mybox1.depth;
        System.out.println("Объём равен " + vol);
        // Вычислить объём второй коробки коробки
        vol = mybox2.width*mybox2.height*mybox2.depth;
        System.out.println("Объём равен " + vol);
    }
}