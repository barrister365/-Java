class Box10 {
    // Законченная реализация класса BoxWeight
    private double witdh;
    private double height;
    private double depth;
    // Конструктор для клонирования объекта
    Box10 (Box10 ob) {
        // Передать объект констркутору
        witdh = ob.witdh;
        height = ob.height;
        depth = ob.depth;
// Конструктор для расчёта кубической коробки
    } Box10 (double len) {
        witdh = height = depth = len;
    }
    //
    // Конструктор в случае указания всех размеров
    Box10 (double w, double h, double d) {
        witdh = w;
        height = h;
        depth = d;
    }
    // Конструктор в случае, если размеры не указаны
    Box10 () {
        witdh = -1; // используем - 1 для обозначаения неинициализированного объекта коробки
        height = -1;
        depth = -1;
    }
    // Вычислить и возвратить объём
    double volume () {
        return witdh*height*depth;

    }
}
// Теперь класс BoxWeight1 полностью реализует все констукторы.
class BoxWeight1 extends Box10 {
    double weight;
    // Конструктор, применяемый для клонирования объекта
    BoxWeight1 (BoxWeight1 ob) {
        super (ob);
        weight = ob.weight;
    }
    // Конструктор, используемый в случае указания всех параметров
    BoxWeight1 (double w, double h, double d, double m) {
        super (w, h, d); // вызываем конструктор супер класса
        weight = m;
          }
    // стандартный конструктор
    BoxWeight1() {
        super();
        weight = -1;
    }
    // Конструктор, используемый в случае создания объекта кубической коробки
    BoxWeight1 (double len, double m) {
        super (len);
        weight = m;

    }
}
class DemoSuper {
    public static void main (String [] args) {
        BoxWeight1 mybox1 = new BoxWeight1(10,20,15,34.3);
        BoxWeight1 mybox2 = new BoxWeight1(2,3,4,0.76);
        BoxWeight1 mybox3 = new BoxWeight1(); // стандартный
        BoxWeight1 mycube = new BoxWeight1(3,2);
        BoxWeight1 myclone = new BoxWeight1(mybox1); // клон берет все аргументы mybox1
        // как в конструкторе Box10 (Box10 ob)
        double vol;
        vol = mybox1.volume();
        System.out.println ("Объём mybox1 равен: " + vol);
        System.out.println ("Вес mybox1 равен: " + mybox1.weight);
        System.out.println ();
        vol = mybox2.volume();
        System.out.println ("Объём mybox2 равен: " + vol);
        System.out.println ("Вес mybox2 равен: " + mybox2.weight);
        System.out.println ();
        vol = mybox3.volume();
        System.out.println ("Объём mybox3 равен: " + vol);
        System.out.println ("Вес mybox3 равен: " + mybox3.weight);
        System.out.println ();
        vol = mycube.volume();
        System.out.println ("Объём mycube равен: " + vol);
        System.out.println ("Вес mycube равен: " + mycube.weight);
        System.out.println ();
        vol = myclone.volume();
        System.out.println ("Объём myclone равен: " + vol);
        System.out.println ("Вес myclone равен: " + myclone.weight);
        System.out.println ();




    }
}