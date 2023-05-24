public interface MyIF {
    // Это объявление нормального метода интерфейса
    int getNumber();
    // Это стандартный метод
    default String getString() {
        return "Стандартная строка";
    }
}
