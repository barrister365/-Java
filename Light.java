public class Light {
    public static void main (String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        // приблизительная скорость света в секундах
        lightspeed = 186000;
        // количество дней, преобразовать
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        // вывести примерное расстояние
        System.out.print("За " + days);
        System.out.print(" дней свет пройдёт около ");
        System.out.print(distance + " миль");

    }
}
