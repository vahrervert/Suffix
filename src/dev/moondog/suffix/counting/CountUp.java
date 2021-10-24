package dev.moondog.suffix.counting;
/*
 * @author moondog
 */
import java.util.Scanner;

public class CountUp {
    public static void count() throws InterruptedException {
       System.out.println("From what number? max:100");
        Scanner scanner = new Scanner(System.in);

        for (int i = scanner.nextInt(); i <= 100; ++i) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Countup finished.");
    }
}
