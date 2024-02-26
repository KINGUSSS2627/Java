public class P10 {
    static int Sum(int a, int b) {
        return a + b;
    }

    static int Sum(int a, int b, int c) {
        return a + b + c;
    }

    static void ChangeArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] *= 4;
        }
    }

    public static void main(String[] args) {
        int a = 2, b = 5;
        int a1 = 12, b1 = 15;

        System.out.printf("Sum Of %d and %d is " + Sum(a1, b1) + "\n", a1, b1);
        System.out.printf("Sum Of %d, %d ans %d is " + Sum(a, b, a1) + "\n", a, b, a1);

        int aa[] = { 1, 2, 3 };
        ChangeArr(aa);

        for (int i : aa) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
