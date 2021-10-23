package dev.moondog.suffix.saving;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteSave {
    public static void save() throws IOException {
        File saveFile = new File("SuffixAutoSave.txt");
        saveFile.createNewFile();
        FileWriter writer = new FileWriter(saveFile);
        Scanner userText = new Scanner(System.in);
        System.out.println("Please type in what text you want to AutoSave.");
        writer.write(userText.next());
        String path = saveFile.getAbsolutePath();
        System.out.println("Saved in: " + path);
        writer.flush();
        writer.close();
    }
}
