import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.print("Num 1 : ");
        a = sc.nextInt();

        System.out.print("Num 1 : ");
        b = sc.nextInt();

        System.out.println("Sum : " + (a + b));
        System.out.println("Multiply : " + (a * b));
        System.out.println("Difference : " + (a - b));
        System.out.println("Modulo: " + (a % b));
        System.out.println("BitOr: " + (a | b));
        System.out.println("BitAnd: " + (a & b));
        System.out.println("BitXor: " + (a ^ b));

        int c = 1;
        c *= a;

        System.out.println(c == a);

        char ch = 'a';
        ch += 4;
        int result = 4;
        result += ch;

        System.out.println(ch);
        System.out.println(result);

        sc.close();
    }
}
