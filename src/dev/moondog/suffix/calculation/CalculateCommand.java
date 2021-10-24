package dev.moondog.suffix.calculation;
/*
 * @author moondog
 */
import java.util.Scanner;

public class CalculateCommand {
    public static void calculate() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Subtraction | Addition | Multiplication | Division");

        switch (userInput.nextLine()) {
            case "Subtraction":
                System.out.println("1st number? ");
                int x = userInput.nextInt();
                System.out.println("2nd number? ");
                int y = userInput.nextInt();
                System.out.println("Answer: " + Math.subtractExact(x,y));
                break;
            case "Addition":
                System.out.println("1st number? ");
                int x2 = userInput.nextInt();
                System.out.println("2nd number? ");
                int y2 = userInput.nextInt();
                System.out.println("Answer: " + Math.addExact(x2,y2));
                break;
            case "Multiplication":
                System.out.println("1st number?");
                int x3 = userInput.nextInt();
                System.out.println("2nd number?");
                int y3 = userInput.nextInt();
                System.out.println("Answer: " + Math.multiplyExact(x3,y3));
                break;
            case "Division":
                System.out.println("1st number?");
                int x4 = userInput.nextInt();
                System.out.println("2nd number?");
                int y4 = userInput.nextInt();
                System.out.println("Answer: " + Math.floorDiv(x4,y4));
                break;
        }
    }
}
