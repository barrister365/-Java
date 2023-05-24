// Реализовать расширяемый стек
class DynStack implements IntStack {
    private int [] stck;
    private int tos;
    // Разместить в памяти и иницаилизировать стек
    DynStack (int size) {
        stck = new int [size];
        tos = -1;
    }
    // Поместить элемент в стэк
    public void push (int item) {
        // Если стек полон, тогда создать новый стек
        if (tos == stck.length-1) {
            int [] temp = new int [stck.length*2]; // удвоить размер
            for (int i = 0; i <stck.length-1; i++);
            stck = temp;
            stck [++tos] = item;
            }
        else
            stck [++tos] = item;

        }
        // Извлечь элемент из стека
    public int pop() {
        if (tos < 0) {
            System.out.println ("Стек опустошён.");
            return 0;
                    }
        else
            return stck[tos--];
    }
}
class IFTest2 {
    public static void main (String [] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);
        // Эти циклы засталяют увеличиваться каждый стек
        for (int i=0; i<12;i++) mystack1.push(i);
        for (int i=0; i<20;i++) mystack2.push(i);
        System.out.println ("Стек в mystack1:");
        for (int i =0; i<12;i++)
            System.out.println (mystack1.pop());
        System.out.println ("Стек в mystack2:");
        for (int i =0; i<20;i++)
            System.out.println (mystack2.pop());

    }
}
