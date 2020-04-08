package stage4;

import java.util.Scanner;

public class Stage4 {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        boolean response = true;
        while (response) {
            int answer = scanner.nextInt();
            if (answer == 2) {
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }

    }

    public void end() {


    }


}
