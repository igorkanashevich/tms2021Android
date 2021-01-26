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
     *  - if number is positive - increase it by 1
     *  - if number is negative - decrease it by 2
     *  - if number is equal to zero - replace it with 10
     *  return number value after operation
     */
    public static int operation(int number) {
        int sum = number;
        if ( sum > 0 ) {
            System.out.println(sum++);
        }
        if ( sum < 0 ) {
            System.out.println(sum - 2);
        }
        if  ( sum == 0 ) {
            sum = 10;
        }
        System.out.println(sum);
        return number;
    }


    /**
     * Method should print different strings in console based on some conditions:
     *  - if remainder of the division number by 3 is zero - print "foo" (example of number - 6)
     *  - if remainder of the division number by 5 is zero - print "bar" (example of number - 10)
     *  - if remainder of the division number by both 3 and 5 is zero 0  and - print "foobar" (example of number - 15)
     * @return
     */
    public static int foobar(int number) {
        int i = number;
        int a = 3;
        int b = 5;
        if (i % a == 0) {
            System.out.println("foo");
        }
        if (i % b == 0) {
            System.out.println("bar");
        }
        if (i %a ==0&&b==5)
            System.out.println("foobar");
        return number;

    }


    /**
     * Steps to implement:
     *  - Read two ints from console
     *  - Create a two-dimensional int array (use ints that you read from console height and width)
     *  - Fill array with random values (under 100)
     *  - Print in console matrix with given size, but:
     *    - If remainder of the division array element by 3 is zero - print "+" sign instead of array element value
     *    - If remainder of the division array element by 7 is zero - print "-" sign instead of array element value
     *    - Print "*" otherwise
     *
     *  Example:
     *   - Values from console -  2 and 3
     *   - Array will look like this (values be different because it's a random)
     *     6 11 123
     *     1 14 21
     *   - For this values output in console should be:
     *
     *    + * *
     *    * - +
     *
     *   Note that 21 % 3 == 0 and 21 % 7 = 0, but output is not +-, but +
     */
    public static void printMatrix() {

    }

    /**
     * (optional)
     * Method should print all prime numbers < 1000
     */
    public static void printPrimeNumbers() {

    }


}