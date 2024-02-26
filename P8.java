public class P8 {
    public static void main(String[] args) {
        int n = 100;
        while (n >= 0) {
            System.out.print(n + " ");
            n--;
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        n = 0;
        do {
            System.out.print(n + " ");
            n++;
        } while (n < 100);
        System.out.println();
    }
}
