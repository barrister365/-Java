class FixedStack implements IntStack {
    private int[] stck;
    private int tos;

    // Разместить в памяти и иницаилизировать стек
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }
    // поместить элемент в стек
    public void push (int item) {
        if (tos == stck.length-1) // использовать член length
            System.out.println ("Стек полон");
        else
            stck [++tos] = item;
    }
    // извлечь элемент из стека
    public int pop () {
        if (tos < 0) {
            System.out.println ("Стек опустошён");
            return 0;
        }
        else
            return stck[tos--];
    }
}
class IFTest {
    public static void main (String [] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);
        // Поместить несколько чисел в стеки
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);
        // извлечь эти числа из стеков
        System.out.println ("Стек в mystack1: ");
        for (int i = 0; i < 5; i++)
            System.out.println (mystack1.pop());
        System.out.println ("Стек в mystack1: ");
        for (int i = 0; i < 8; i++)
            System.out.println (mystack2.pop());
    }
}