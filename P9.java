public class P9 {
    public static void main(String[] args) {

        String s[] = new String[5];

        s[2] = "Hi";

        for (String str : s) {
            System.out.print(str + " ");
        }
        System.out.println();

        int a[] = new int[5];

        a[1] = 152;

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        String S = "Harsh";
        char ss[] = S.toCharArray();

        for (char c : ss) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println(s.length);

        // 2D array

        String S2[][] = new String[2][2];
        for (var Vstr : S2) {
            for (var str : Vstr) {
                System.out.print(str + " ");
            }
            System.out.println();
        }

    }
}
