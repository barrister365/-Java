public class RefDemo {
    public static void main (String [] args) {
        // ссылочные переменные. Всё берем из класса DemoBoxWeight.java
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box9 plainbox = new Box9();
        double vol;
        vol = weightbox.volume();
        System.out.println ("Объём weightbox равен " + vol);
        System.out.println ("Вес weightbox равен " + weightbox.weight);
        System.out.println();
        // Присвоить ссылку на BoxWeight ссылке на Box9
        plainbox = weightbox;
        vol = plainbox.volume(); // метод volume() определён в Box9, строка 33 DemoBoxWeight.java
        System.out.println ("Объём plainbox равен " + vol);
        // Оператор plainbox.weight не определён поэтому
        // вывод System.out.println ("Вес plainbox равен " + plainbox.weight); работать не будет
    }
}
