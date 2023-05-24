class Box4 {
    double width;
    double height;
    double depth;
    // вычислить и возвратить объём
    double volume (){
        return width*height*depth;
            }
    // установить параметры для коробки

    void setDim (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
class BoxDemo5 {
    public static void main (String [] args) {
        Box4 mybox1 = new Box4 ();
        Box4 mybox2 = new Box4 ();
        double vol;
        // инициализировать объекты коробок
        mybox1.setDim(10,15,20);
        mybox2.setDim(3,6,9);
        // получить объём первой коробки
        vol = mybox1.volume();
        System.out.println("Объём первой коробки равен: " + vol);
        // получить объём втрой коробки
        vol = mybox2.volume();
        System.out.println("Объём первой коробки равен: " + vol);
    }
}
