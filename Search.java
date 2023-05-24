public class Search {
    // поиск переменной в массиве с использвование стиля for-each
    public static void main (String [] args) {
        int [] nums = {45,553,233,64,23,5};
        int val = 5;
        boolean found = false;
        for (int x: nums) {
            if (x==val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Значение найдено!");
    }
}
