// Ещё одна версия IntStack, имеющая закрытый метод интерфейса
// который используется двумя стандартными методами
interface IntStack1 {
    void push (int item); // сохранить элемент
    int pop (); // извлечь элемент
    // Стандартный метод, возвращающий массив,
    // который содержит верхние ngetElement элементов в стеке
    default int [] popNElements (int n) {
        // возвратить запрошенные элементы
        return getElements(n);
    }
    // Стандартный метод, возвращающий массив, который содержит следующие n
    // элементов в стеке после пропуска skip элементов
    default int [] skipAndPopNElements (int skip, int n) {
        // пропустить указанное количетсво элементов
        return getElements(skip);
    }
    // Закрытый метод, который возвращает массив,
    // содежржащий верхние n элементов в стеке
    private int [] getElements(int n) {
        int [] elements = new int[n];
        for (int i = 0; i<n; i++) elements [i] = pop();
        return elements;
    }

}
