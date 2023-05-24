class Box3 {
    double width;
    double height;
    double depth;

    // Отобразить объём коробки
    double volume() { // теперь вычислить и возвратить объём (если войд то не возвращается
        return width * height * depth;
    }
}
class BoxDemo4 {
    public static void main(String [] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();
        double vol;
        // присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        // присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        // получить объём первой коробки
        vol = mybox1.volume();
        System.out.println ("Объём первой коробки равен " + vol);
        // получить объём второй коробки
        vol = mybox2.volume();
        System.out.println ("Объём втрой коробки равен " + vol);



    }
}