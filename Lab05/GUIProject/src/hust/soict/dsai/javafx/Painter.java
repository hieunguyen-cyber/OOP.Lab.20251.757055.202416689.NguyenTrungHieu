package hust.soict.dsai.javafx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class Painter extends JFrame {
    private PainterPanel panel;

    public Painter() {
        this.setTitle("Painter");
        this.setSize(640, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        panel = new PainterPanel();
        this.add(panel);
        
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Painter());
    }
}

