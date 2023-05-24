class Stack1 {
    // Этот класс реализует стек целых чисел, который хранит  10 значений класса Stack
    /* Теперь stck и tos являются закрытыми, это значит они не могут быть
    случайно или злонамерено изменены таким образом, чтобы повредить стек
     */
    private int[] stck = new int[10];
    private int tos;

    // Инициализировать верхушку стека
    Stack1() {
        tos = -1;
    }

    // Поместить элемент в стек
    void push(int item) {
        if (tos == 9) {
            System.out.println("Стек полон");
        } else stck[++tos] = item;

    }

    // Извлечь элемент из списка
    int pop() {
        if (tos < 0) {
            System.out.println("Стек опустошён");
            return 0;
        }
        else
            return stck[tos--];
    }
}
class TestStack1 {
    public static void main (String [] args) {
        Stack1 mystack1 = new Stack1();
        Stack1 mystack2 = new Stack1();
        // Поместить несколько числе в стеки
        for (int i = 0; i<10;i++) mystack1.push(i);
        for (int i = 10; i<20;i++) mystack1.push(i);
        // Извлечь эти числа из стеков
        System.out.println("Стек в mystack1: ");
        for (int i = 0; i<10; i++)
            System.out.println(mystack1.pop());
        System.out.println("Стек в mystack2: ");
        for (int i = 10; i<20; i++)
            System.out.println(mystack2.pop());
        // Приведённые ниже операторы являются не допустимыми
//        mystack1.tos = -2;
//        mystack2.stck [3] = 100;




        }
    }




