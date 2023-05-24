public class Array {
    public static void main (String [] args) {
        // объявляем тип, затем значок массива [] и название массива
        int [] months_days;
        /* выделяем память массиву - тут ему нужно 12 как бы мест
        соответственно массив (название months_days) присваевает с помощью new
        "численные" int места в количестве 12 штук
         */
        months_days = new int[12];
        months_days [0] = 31;
        months_days [1] = 28;
        months_days [2] = 31;
        months_days [3] = 30;
        months_days [4] = 31;
        months_days [5] = 30;
        months_days [6] = 31;
        months_days [7] = 30;
        months_days [8] = 31;
        months_days [9] = 30;
        months_days [10] = 31;
        months_days [11] = 30;
        /* вызываем число из массива по его индексу months_days[3]
        это у нас 30, 14 - я строчка
         */
        System.out.println("В апреле " + months_days[3] + " дней.");
    }
}
