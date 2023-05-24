class Box5 {
    double width;
    double height;
    double depth;
    // Это конструктор для box5
    Box5() {
        System.out.println ("Конструирование Box5");
        width = 10;
        height = 10;
        depth = 10;

    }
    // Вычислить и возвратить объём
    double volume () {
        return width*height*height;
            }
}
class BoxDemo6 {
    public static void main (String [] args) {
        // Объявить, разместить в памяти и инициализировать объекты Box5
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;
        // Получить объём первой коробки
        vol = mybox1.volume();
        System.out.println ("Объём первой коробки равен" + vol);
        // Получить объём второй коробки коробки
        vol = mybox2.volume();
        System.out.println ("Объём первой коробки равен" + vol);
    }
}