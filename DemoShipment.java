class Box11 {
    private double width;
    private double height;
    private double depth;
    // Конструктор, применяемый для клонирнования объекта
    Box11 (Box11 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }
    // Конструктор, используемый в случае указания всех размеров
    Box11 (double w, double h, double d) {
        width= w;
        height = h;
        depth = d;

    }
    // Конструктор, в случе если размеры вообще не указаны
    Box11 () {
        width= -1;
        height = -1;
        depth = -1;
    }
    // Конструктор, используемый для создания кубичесуой коробки
    Box11 (double len) {
        width = height = depth = len;
    }
    // вычислить и возрватить объём
    double volume () {
        return width*height*depth;

    }
}
// добавить вес
class BoxWeight2 extends Box11 {
    double weight; // вес коробки
    // конструктор, применяемый для клонирования объекта
    BoxWeight2 (BoxWeight2 ob) {
        super (ob);
        weight = ob.weight;

    }
    // Конструтор в случае указания всех параметров
    BoxWeight2 (double w, double h, double d, double m) {
        super(w,h,d); // вызвать конструтор супер класса
        weight = m;
    }
    // Стандартный конструктор
    BoxWeight2 () {
        super(); // вызывается конструктор супер класса который пустой Box11 ()
        weight = -1;
    }
    // Конструктор, используемый в случае создания объекта кубической коробки
    BoxWeight2 (double len, double m) {
        super(len);
        weight = m;
    }

}
// Добавляем стоимость доставки
class Shipment extends BoxWeight2 {
    double cost;
    // Конструктор, применяемый для клонирования объекта
    Shipment (Shipment ob) {
        super (ob);
        cost = ob.cost;

    }
    // Конструктор, используемый в случае указания всех параметров
    Shipment (double w, double h, double d, double m, double c) {
        super(w,h,d,m);
        cost = c;

    }
    // Стандартный конструктор
    Shipment() {
        super();
        cost = -1;
    }
    // Конструктор, используемый для создания кубической коробки
    Shipment (double len, double m, double c) {
        super (len, m);
        cost = c;
    }
}
class DemoShipment {
    public static void main ( String [] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println ("Объём shipment1 равен " + vol);
        System.out.println ("Вес shipment1 равен " + shipment1.weight);
        System.out.println ("Стоимость доставки shipment1 равна " + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println ("Объём shipment2 равен " + vol);
        System.out.println ("Вес shipment2 равен " + shipment2.weight);
        System.out.println ("Стоимость доставки shipment1 равна " + shipment2.cost);
        System.out.println();

    }
}