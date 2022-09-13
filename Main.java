import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    // Jpanels and JFrames
    static JFrame window;
    static JPanel rules, board, title, winToLoss, botInfo;
    
    // Window Settings
    static final String frameTitle = "HEXAPAWN";
    static final Dimension windowSize = new Dimension(1200, 1000);
    static final ImageIcon windowIcon = new ImageIcon("Imgs/windowIcon.png");

    public static void main(String[] args) {
        createWindow();// Creating the window
    }

    private static void createWindow() {
        window = new JFrame(frameTitle);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(windowSize);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setIconImage(windowIcon.getImage());
        window.setUndecorated(true);
        addTitle();
        window.setVisible(true);
    }

    private static void addTitle() {
        title = new Title();
        window.add(title, BorderLayout.PAGE_START);
    }
}