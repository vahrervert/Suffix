package dev.moondog.suffix;
/*
 * @author moondog
 */
import dev.moondog.suffix.beta.MousePosition;
import dev.moondog.suffix.calculation.CalculateCommand;
import dev.moondog.suffix.counting.CountType;
import dev.moondog.suffix.encryption.ASCIIEncryption;
import dev.moondog.suffix.saving.WriteSave;

import java.io.IOException;
import java.util.*;

public class Suffix {
    public static void main(String[] args) throws IOException {
        ArrayList<String> commands = new ArrayList<>();
        commands.add("calculate");
        commands.add("exit");
        commands.add("help");
        commands.add("save");
        commands.add("version");
        commands.add("mousepos");
        commands.add("encryptor");
        commands.add("count");

        Scanner input = new Scanner(System.in);
        String username = System.getProperty("user.name");
        System.out.println("Hello " + username + "! Type 'help' for a list of commands.");

        switch (input.nextLine()) {
            case "help":
                System.out.println(commands);
                break;
            case "calculate":
                CalculateCommand.calculate();
                break;
            case "exit":
                System.exit(0);
                break;
            case "save":
                WriteSave.save();
                break;
            case "version":
                System.out.println(Stats.SUFFIX_VERSION);
                break;
            case "mousepos":
                if(Stats.DEV.booleanValue() || Stats.BETA.booleanValue()) {
                    MousePosition.trackMousePos();
                    if(!Stats.DEV.booleanValue() || !Stats.BETA.booleanValue()) {
                        System.out.println("Sorry this command is not available to you.");
                    }
                    break;
                }
            case "encryptor":
                ASCIIEncryption.encrypt();
                break;
            case "count":
                try {
                    CountType.countType();
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
        }
    }
}
