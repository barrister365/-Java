public class ForVar {
    // части цикла могут быть пустыми
    public static void main (String [] args) {
        int i;
        boolean done = false;
        i = 0;
        for (; !done; ) {
            System.out.println(" i равно " + i);
            if (i==0) done=true;
            i++;
        }
    }
}
