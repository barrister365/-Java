public class LifeTime {
    public static void main (String [] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1; // переменная инициализиуруется при каждом входе в блок
            System.out.println ("Значение равно " + y); // всегда выводится - 1
            y = 100;
            System.out.println ("Теперь значение равно " + y);
        }
    }
}
