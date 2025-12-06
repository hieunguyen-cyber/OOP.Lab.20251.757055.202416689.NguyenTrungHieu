package hust.soict.dsai.javafx;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class PainterPanel extends JPanel {
    private List<Point> points = new ArrayList<>();
    private Color currentColor = Color.BLACK;
    private int brushSize = 5;
    private String currentTool = "PEN";

    public PainterPanel() {
        this.setLayout(new BorderLayout(10, 10));
        this.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        
        // Left panel for tools
        JPanel leftPanel = createLeftPanel();
        this.add(leftPanel, BorderLayout.WEST);
        
        // Center drawing area
        DrawingArea drawingArea = new DrawingArea();
        this.add(drawingArea, BorderLayout.CENTER);
    }

    private JPanel createLeftPanel() {
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setPreferredSize(new Dimension(120, 300));
        
        // Tools group
        JPanel toolsPanel = new JPanel();
        toolsPanel.setLayout(new BoxLayout(toolsPanel, BoxLayout.Y_AXIS));
        toolsPanel.setBorder(new TitledBorder("Tools"));
        
        ButtonGroup toolGroup = new ButtonGroup();
        
        JRadioButton penButton = new JRadioButton("Pen", true);
        penButton.addActionListener(e -> {
            currentTool = "PEN";
            currentColor = Color.BLACK;
            brushSize = 5;
        });
        toolGroup.add(penButton);
        toolsPanel.add(penButton);
        
        JRadioButton eraserButton = new JRadioButton("Eraser");
        eraserButton.addActionListener(e -> {
            currentTool = "ERASER";
            currentColor = Color.WHITE;
            brushSize = 10;
        });
        toolGroup.add(eraserButton);
        toolsPanel.add(eraserButton);
        
        leftPanel.add(toolsPanel);
        leftPanel.add(Box.createVerticalStrut(10));
        
        // Clear button
        JButton clearButton = new JButton("Clear");
        clearButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        clearButton.addActionListener(e -> {
            points.clear();
            repaint();
        });
        leftPanel.add(clearButton);
        leftPanel.add(Box.createVerticalGlue());
        
        return leftPanel;
    }

    private class DrawingArea extends JPanel {
        public DrawingArea() {
            this.setBackground(Color.WHITE);
            this.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    points.add(new Point(e.getX(), e.getY()));
                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            g2d.setColor(currentColor);
            g2d.setStroke(new BasicStroke(brushSize, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            
            if (points.size() > 1) {
                for (int i = 0; i < points.size() - 1; i++) {
                    Point p1 = points.get(i);
                    Point p2 = points.get(i + 1);
                    g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }
        }
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
