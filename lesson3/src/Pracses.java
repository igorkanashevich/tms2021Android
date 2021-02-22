import java.util.Scanner;

public class Pracses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        if ( sum > 0 ) {
            System.out.println(sum++);
        }
        if ( sum < 0 ) {
                System.out.println(sum + 2);
            }
           if  ( sum == 0 ) {
                sum = 10;
           }
                System.out.println(sum);
            }

        }




