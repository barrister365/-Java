class Box6 {
    double width;
    double height;
    double depth;
    // Это конструктор для box
     Box6 (double w, double h, double d) {
         width = w;
         height = h;
         depth = d;
     }
     double volume () { // вычислить и возвратить объём
         return width*height*depth;
     }
}
class BoxDemo7 {
    public static void main (String [] args) {
        Box6 mybox1 = new Box6 (10, 15,20);
        Box6 mybox2 = new Box6 (3, 6,9);
        double vol;
        // Получить объём первой коробки
        vol = mybox1.volume();
        System.out.println ("Объём первой коробки равен" + vol);
        // Получить объём второй коробки коробки
        vol = mybox2.volume();
        System.out.println ("Объём первой коробки равен" + vol);
    }
}
