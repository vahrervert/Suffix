package dev.moondog.suffix.counting;
/*
 * @author moondog
 */
import java.util.Scanner;

public class CountType {
    public static void countType() throws InterruptedException {
        System.out.println("Countdown | Countup");
        Scanner userinput = new Scanner(System.in);

        switch (userinput.nextLine()) {
            case "Countdown":
                CountDown.count();
                break;
            case "Countup":
                CountUp.count();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
