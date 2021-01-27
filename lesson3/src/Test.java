import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // System.out.println(operation(1));
        // System.out.println(operation(0));
        // foobar(6);
        // foobar(10);
        //foobar(15);
        // printMatrix();
        printPrimeNumbers();
    }

    /**
     * (optional)
     * Method should print all prime numbers < 1000
     */
    public static void printPrimeNumbers() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 2; i < a; i++) {
            if (num(i))
                System.out.println(i);
        }
    }

    public static boolean num(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }

}