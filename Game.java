import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Dimension;

public class Game extends JPanel {
    // Objects
    static Pawn pPawnA, pPawnB, pPawnC, bPawn1, bPawn2, bPawn3;

    Game() {
        // Panel Settings
        final Dimension boardSize = new Dimension(900, 900);

        // Setting up game
        pawnStart();

        // Applying Settings
        this.setPreferredSize(boardSize);
        // this.setBackground(Color.BLACK);
        repaint();
    }

    // pawn placement functions
    public static void reset() {
        System.out.println("Reseting Game");
        pawnStart();
    }

    public static void pawnStart() {// Sets pawns to start positions
        pPawnA = new Pawn(0, "seven");
        pPawnB = new Pawn(1, "eight");
        pPawnC = new Pawn(2, "nine");
        bPawn1 = new Pawn(3, "one");
        bPawn2 = new Pawn(3, "two");
        bPawn3 = new Pawn(3, "three");
    }

    // Drawing Board
    private static void drawBackground(Graphics g) {
        ImageIcon background = new ImageIcon("Imgs/WindowStuff/3x3-Board.png");
        g.drawImage(background.getImage(), 0, 0, null);
    }

    // Drawing Elements to the panel
    public void paint(Graphics g) {
        drawBackground(g);
        pPawnA.draw(g);
        pPawnB.draw(g);
        pPawnC.draw(g);
        bPawn1.draw(g);
        bPawn2.draw(g);
        bPawn3.draw(g);
    }
}
