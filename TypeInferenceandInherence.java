 // Выведение типов локальных переменных и наследование
class MyClass1 {

}
class FirstDerivatedclass extends MyClass1 {
    int x;

}
 class SecondDerivatedclass extends FirstDerivatedclass {
     int y;

 }
public class TypeInferenceandInherence {
    // Возвратить некоторый тип объекта MyClass1
    static MyClass1 getObj (int which) {
        switch (which) {
            case 0:
                return new MyClass1();
            case 1:
                return new FirstDerivatedclass();
            default: return new SecondDerivatedclass();
        }
    }


    public static void main (String [] args) {
        /* Несмотря на то что что getObj() возвращает различные типы объектов
        в иерархии наследования MyClass1, объявленным типом возвращаемого значения является
        MyClass1. В результате во всех трёх, показанных здесь случаях предполагается, что типом
        переменных является MyClass1 хотя получаются разные производные типы объектов.

         */
        // В этом случае getObj() возвращает объект MyClass1
        var mc = getObj(0);
        // В этом случае getObj() возвращает объект FirstDerivatedclass
        var mc2 = getObj(1);
        // В этом случае getObj() возвращает объект SecondDerivatedclass
        var mc3 = getObj(2);
        /* Поскольку типы mc2, mc3 выводятся как MyClass1 (т. к. возвращаемым типом является
        getObj() является MyClass1), то ни mc2, mc3 не могут получить доступ к полям,
        объявленным в FirstDerivatedclass или SecondDerivatedclass
        mc2.x = 10; Ошибка! MyClass1 не имеет поля х.
        mc2.y = 10; Ошибка! MyClass1 не имеет поля у.

         */


    }


}
