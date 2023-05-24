class Box9 {
    // Наследование  для расширения классса Box
    double width;
    double height;
    double depth;
    // Конструктор в случае указания всех размеров

    Box9 (Box9 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;


    }
    // Конструктор, используемый в случае указания всех размеров

    Box9 (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // Конструктор, если размеры вообще не указаны
    Box9 () {
        width = -1; // использовать -1 для неинициализированного объекта коробки
        height = -1;
        depth = -1;
    }
    // Конструктор, используемый в случае создания объекта кубической коробки
    Box9(double len) {
        width = height = depth = len;
    }
    // вычислить и возвратить объём
    double volume () {
        return width*height*depth;
    }
}
// Расширяем класс чтобы включить weight
class BoxWeight extends Box9 {
    double weight;
    // Конструктор для BoxWeight
    BoxWeight (double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
class DemoBoxWeight {
    public static void main (String [] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Объём mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Объём mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

    }
}