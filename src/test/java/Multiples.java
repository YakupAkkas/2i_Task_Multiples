import java.util.Scanner;

public class Multiples {

    /** It is not clear if you want to have the iterated numbers or the number of times of iterations until the limit.
     * My assumption is that you are asking the code to provide the number of the multiples in the iteration.
     */

    public static void multiples(int a, int x){
        int x3 = 0;
        int x2 = 0;
        int x1 = 0;
        for(int counter = 1; counter <= (3*x); counter++) {
            if (counter % (a + 2) == 0) {
                x3++;
            } if ((counter % (a + 1) == 0) && (counter <= (2*x))) {
                x2++;
            } if ((counter % a == 0) && (counter <= x)) {
                x1++;
            }else continue;
        }

        System.out.println("Number of iteration of " + a + " until " + x + " is " + x1);
        System.out.println("Number of iteration of " + (a+1) + " until " + (2*x) + " is " + x2);
        System.out.println("Number of iteration of " + (a+2) + " until " + (3*x) + " is " + x3);
    }


    public static void main(String[] args) {

        System.out.println("Please Enter Iterating Number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Please Enter Number to");
        int x = scanner.nextInt();

        multiples(a, x);
    }
}