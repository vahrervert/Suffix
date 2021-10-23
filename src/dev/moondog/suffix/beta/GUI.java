package dev.moondog.suffix.beta;

import dev.moondog.suffix.Stats;

import javax.swing.*;
import java.util.ArrayList;

public class GUI {

    public static void enableGui() {
        JFrame frame = new JFrame(Stats.SUFFIX_NAME + " " + Stats.SUFFIX_VERSION);


        frame.setSize(600,500);
        frame.setVisible(true);
    }
}
