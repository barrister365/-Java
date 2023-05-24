public class SampleSwich {
    public static void main (String [] args) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println ("i равен нулю.");
                    break;
                case 1:
                    System.out.println ("i равен одному.");
                    break;
                case 2:
                    System.out.println ("i равен двум.");
                    break;
                case 3:
                    System.out.println ("i равен трём.");
                    break;
                default:
                    System.out.println ("i больше трёх.");
            }
    }
}
