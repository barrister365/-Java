public class CommandLine {
    public static void main(String[] args) {
        // маин передаёт командной строке
        for (int i = 0; i < args.length; i++)
            System.out.println("args [" + i + "]:" + args[i]);

    }
}
