package stage3;

import java.util.Scanner;

public class Stage3 {
    public void countNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);


        }

    }
}
