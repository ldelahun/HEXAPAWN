import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Dimension;

public class Game extends JPanel {

    Game() {
        // Panel Settings
        final Dimension boardSize = new Dimension(900, 900);

        // Applying Settings
        this.setPreferredSize(boardSize);
        // this.setBackground(Color.BLACK);
        repaint();
    }

    // Testing
    public void paint(Graphics g) {
        ImageIcon background = new ImageIcon("Imgs/WindowStuff/3x3-Board.png");
        g.drawImage(background.getImage(), 0, 0, null);
    }
}
