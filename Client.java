class Client implements Callback {
    public void callback (int p) {
        System.out.println("callback() вызывается с " + p);
    }
    void nonIfacemeth () {
        System.out.println("Классы, которые реализуют интерфейсы, " +
                "могут также определять другие члены");
    }
}
    // Реализовать метод интерфейса Callback

