package dev.moondog.suffix.beta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MousePosition extends JFrame
{

    public static void trackMousePos()
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                displayJFrame();
            }
        });
    }

    static void displayJFrame()
    {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Suffix 1.0.0 | MousePositionTracker");

        jFrame.setPreferredSize(new Dimension(400, 300));
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);

        // create an instance of my custom mouse cursor component
        final AlsXYMouseLabelComponent alsXYMouseLabel = new AlsXYMouseLabelComponent();

        // add my component to the DRAG_LAYER of the layered pane (JLayeredPane)
        JLayeredPane layeredPane = jFrame.getRootPane().getLayeredPane();
        layeredPane.add(alsXYMouseLabel, JLayeredPane.DRAG_LAYER);
        alsXYMouseLabel.setBounds(0, 0, jFrame.getWidth(), jFrame.getHeight());

        // add a mouse motion listener, and update my custom mouse cursor with the x/y
        // coordinates as the user moves the mouse
        jFrame.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent me)
            {
                alsXYMouseLabel.x = me.getX();
                alsXYMouseLabel.y = me.getY();
                alsXYMouseLabel.repaint();
            }
        });


        jFrame.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

        jFrame.setVisible(true);
    }

}

class AlsXYMouseLabelComponent extends JComponent
{
    public int x;
    public int y;

    public AlsXYMouseLabelComponent() {
        this.setBackground(Color.blue);
    }

    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        String s = x + ", " + y;
        g.setColor(Color.red);
        g.drawString(s, x, y);
    }
}