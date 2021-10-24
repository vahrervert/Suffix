package dev.moondog.suffix.counting;
/*
 * @author moondog
 */
import java.util.Scanner;

public class CountDown {
    public static void count() throws InterruptedException {
        System.out.println("From what number?");
        Scanner scanner = new Scanner(System.in);

        for (int i = scanner.nextInt();i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Countdown finished.");
    }
}
