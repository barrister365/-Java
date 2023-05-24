/* Создать переменную ссылки на интерфейс
и организовать через неё доступ к стекам
 */
public class IFtest3 {
    public static void main (String [] args) {
        IntStack mystack; // создать переменную ссылки на интерфейс
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);
        mystack = ds; // загрузить стек с динамическим размером
        // Поместить нескоколько чисел в стеки
        for (int i = 0; i<12; i++) mystack.push(i);
        mystack = fs; // загрузить стек с фиксированным размером
        for (int i = 0; i<8; i++) mystack.push(i);
        mystack = ds;
        System.out.println("Значения в стеке с динамическим размером: ");
        for (int i = 0; i<12;i++)
            System.out.println (mystack.pop());
        mystack = fs;
        System.out.println("Значения в стеке с фиксированным размером: ");
        for (int i = 0; i<8;i++)
            System.out.println (mystack.pop());

    }



}
