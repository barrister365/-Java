class Stack2 {
    /* Усоверешенствованый класс Stack2, в котором
    используется член length в типе массива
     */
    private int [] stck;
    private int tos;
    // Разместить и инициализировать стек

    Stack2 (int size) {
        stck = new int [size];
        tos = - 1;

    }
    // Поместить элемент в стек
    void push (int item) {
        if (tos == stck.length-1)
            System.out.println ("Стек полон");
        else
            stck[++tos] = item;
        }
        // извлечь элемент из стека
    int pop () {
        if (tos<0) {
            System.out.println ("Стек опутошён");
            return 0;
        }
        else
            return stck[tos--];
    }

}
class TestStack2 {
    public static void main (String [] args) {
        Stack2 mystack1 = new Stack2(5);
        Stack2 mystack2 = new Stack2(8);
        // поместить несколько чисел в стеки
        for (int i = 0; i<5; i++) mystack1.push(i);
        for (int i = 0; i<8; i++) mystack2.push(i);
        // извлечь эти цифры из стеков
        System.out.println ("Стек в mystack1:");
        for (int i = 0; i<5; i++)
        System.out.println (mystack1.pop());
        System.out.println ("Стек в mystack2:");
        for (int i = 0; i<8; i++)
            System.out.println (mystack2.pop());
    }
}