class Box8 {
    // Инициализируем один объект с помощью другого
    double width;
    double height;
    double depth;
    Box8 (Box8 ob) { // Принимает объект типа Box8 передает его конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box8 (double w, double h, double d) { // Принимает объект типа Box8 передает его конструктору
        width = w;
        height = h;
        depth = d;
    }
    // Конструтор на случай если размер не указаны

    Box8 () {
        width = -1;
        height = -1;
        depth = -1;
    }
    // Конструктор для кубика

    Box8 (double len) {
        width=height=depth=len;
    }
    // вычислить и возвратить объём
    double volume () {
        return width*height*depth;
    }
}

class OverLoadCons2 {
    public static void main (String [] args) {
        Box8 mybox1 = new Box8(10,20,15);
        Box8 mybox2 = new Box8();
        Box8 mycube = new Box8(7);
        Box8 myclone = new Box8(mybox1);
        double vol;
        // Вычислить объём первой коробки
        vol = mybox1.volume();
        System.out.println ("Объём mybox1 равен " + vol);
        vol = mybox2.volume();
        System.out.println ("Объём mybox2 равен " + vol);
        vol = mycube.volume();
        System.out.println ("Объём mycube равен " + vol);
        vol = myclone.volume();
        System.out.println ("Объём myclone равен " + vol);

    }
}
