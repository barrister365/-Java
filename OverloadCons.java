class Box7 {
    /* Здесь в классе Box определены параметры конструктора, в том числе
    в таких случаях, когда в их вызове нет необходимости
     */
    double width;
    double height;
    double depth;

    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    // Конструктор, если размеры вообще не применяются
    Box7() {
        width = -1;
        height = -1;
        depth = -1;

    }
    // Конструктор для создания объекта кубика
    Box7 (double len) {
        width = height = depth = len;
    }
    // Вычислить и возвратить объём
    double volume () {
        return width*height*depth;
    }
}
class OverloadCons {
    public static void main (String [] args) {
        // Создать объекты коробок с применением различных конструкторов
        Box7 mybox1 = new Box7(10,20,15);
        Box7 mybox2 = new Box7();
        Box7 mycube = new Box7(7);
        double vol;
        // Вычислить объём первой коробки
        vol =  mybox1.volume();
        System.out.println ("Объём mybox1 равен: " + vol);
        // Вычислить объём второй коробки
        vol =  mybox2.volume();
        System.out.println ("Объём mybox2 равен: " + vol);
        // Вычислить объём второй коробки
        vol =  mycube.volume();
        System.out.println ("Объём mycube равен: " + vol);

    }
}
