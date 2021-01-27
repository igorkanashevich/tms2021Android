import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(operation(1));
        System.out.println(operation(0));
        foobar(6);
        foobar(10);
        foobar(15);
        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Method should perform some operation with int "number" based on some conditions:
     * - if number is positive - increase it by 1
     * - if number is negative - decrease it by 2
     * - if number is equal to zero - replace it with 10
     * return number value after operation
     */
    public static int operation(int number) {
        if (number > 0) {
            System.out.println(++number);
        }
        if (number < 0) {
            System.out.println(number -= 2);
        }
        if (number == 0) {
            number = 10;
        }
        return number;
    }


    /**
     * Method should print different strings in console based on some conditions:
     * - if remainder of the division number by 3 is zero - print "foo" (example of number - 6)
     * - if remainder of the division number by 5 is zero - print "bar" (example of number - 10)
     * - if remainder of the division number by both 3 and 5 is zero 0  and - print "foobar" (example of number - 15)
     *
     * @return
     */
    public static int foobar(int number) {

        if (number % 3 == 0) {
            System.out.println("foo");
        }

        if (number % 5 == 0) {
            System.out.println("bar");
        }
        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("foobar");
        return number;

    }


    /**
     * Steps to implement:
     * - Read two ints from console
     * - Create a two-dimensional int array (use ints that you read from console height and width)
     * - Fill array with random values (under 100)
     * - Print in console matrix with given size, but:
     * - If remainder of the division array element by 3 is zero - print "+" sign instead of array element value
     * - If remainder of the division array element by 7 is zero - print "-" sign instead of array element value
     * - Print "*" otherwise
     * <p>
     * Example:
     * - Values from console -  2 and 3
     * - Array will look like this (values be different because it's a random)
     * 6 11 123
     * 1 14 21
     * - For this values output in console should be:
     * <p>
     * + * *
     * * - +
     * <p>
     * Note that 21 % 3 == 0 and 21 % 7 = 0, but output is not +-, but +
     */
    public static void printMatrix() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = scanner.nextInt();
        int num_1 = scanner.nextInt();
        int[][] twoDArray = new int[num][num_1];
        String[][] twoDArray_1 = new String[num][num_1];
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = random.nextInt(100);
                if (twoDArray[i][j] % 3 == 0) {
                    twoDArray_1[i][j] = "+";
                } else if (twoDArray[i][j] % 7 == 0) {
                    twoDArray_1[i][j] = "-";
                } else {
                    twoDArray_1[i][j] = "*";
                }
            }
            System.out.println(Arrays.toString(twoDArray_1[i]));
        }
    }

    /**
     * (optional)
     * Method should print all prime numbers < 1000
     */
    public static void printPrimeNumbers() {


    }
}