public class DefaultMethodDemo {
    // Использовать стандартный метод
    public static void main (String [] args) {
        MyIFImp obj = new MyIFImp();
        // Метод getNumber() можно вызвать,
        // потому что он явно реализован в MyIFIMP
        System.out.println (obj.getNumber());
        // Метод getString() тоже можно вызвать
        // из за наличия стандартной реализации
        System.out.println (obj.getString());

    }
}
