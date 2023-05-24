public class VarDemo {
    public static void main (String[] args) {
        // использовать выведение типов для опредлеления типа переменной
        // по имени avg. В этом случае выводится тип double
        var avg = 10.0;
        System.out.println("Значение avg: " + avg);
        // в следующем контексте var - не предопределённый идентификатор,
        // а просто определяемое пользоваетлем имя переменной
        int var = 1;
        System.out.println("Значение var: " + var);
        // и как тип и как имя переменной в инициализаторе
        var k = -var;
        System.out.println("Значение k: " + k);
    }
}
