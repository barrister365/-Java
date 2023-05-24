class Box2 {
    double width;
    double height;
    double depth;
    // Отобразить объём коробки
    void volume () { // общая форма метода ТИП ИМЯ (СПИСКО ПАРАМЕТРОВ) {тело метода}
        // если тело не возвращает значение его возвращаемым типом должен быть void
        System.out.print("Объём равен ");
        System.out.println(width*height*depth);


    }

}
class BoxDemo3 {
    public static void main (String [] args){
        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        // присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        // присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        // отобразить объём первой коробки
        mybox1.volume();
        // отобразить объём второй коробки
        mybox2.volume();

    }
}