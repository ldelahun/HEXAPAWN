package src;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.util.Arrays;

public class Game extends JPanel implements MouseListener {
    // Objects
    static Pawns pawnA, pawnB, pawnC, pawn1, pawn2, pawn3, playerSelectionPawn;
    static BoardLocations location = new BoardLocations();
    static SelectedBox box1, box2, box3;
    static CoolShit ult = new CoolShit();

    // Game data
    static int wins, loss, round;
    boolean playerChose;

    Game() {
        // Panel Settings
        final Dimension boardSize = new Dimension(900, 900);

        // Setting up game
        startUpVariables();
        createPawns();
        pawnStart();

        // Applying Settings
        this.setPreferredSize(boardSize);
        this.addMouseListener(this);

        // Painting board
        repaint();
    }

    public void reset() {// Resets everything
        System.out.println("Reseting Game");
        startUpVariables();
        pawnStart();
        repaint();
    }

    public static void pawnStart() {// Sets pawns to start positions
        pawnA.boardLocation = "seven";
        pawnB.l = "eight";
        pawnC.l = "nine";
        pawn1.l = "one";
        pawn2.l = "two";
        pawn3.l = "three";
    }

    private void createPawns() {// Creates all the pawns
        pawnA = new Pawn(0);
        pawnB = new Pawn(1);
        pawnC = new Pawn(2);
        pawn1 = new Pawn(3);
        pawn2 = new Pawn(3);
        pawn3 = new Pawn(3);

        box1 = new SelectedBox();
        box2 = new SelectedBox();
        box3 = new SelectedBox();
    }

    // Player Things
    private void characterSelection(String b) {
        if (pawnA.l.equals(b)) {
            pawnSelected(pawnA);
        } else if (pawnB.l.equals(b)) {
            pawnSelected(pawnB);
        } else if (pawnC.l.equals(b)) {
            pawnSelected(pawnC);
        }

    }

    private void pawnSelected(Pawn p) {
        p.t = 4;// Sets pawn select icon
        playerSelectionPawn = p;
        playerChose = true;

        // Shows boxes
        String[] moves = location.moveOptions(round, p.dt);
        System.out.println(Arrays.toString(moves));
        box1.l = moves[0];
        box1.toDraw = true;

        box2.l = moves[1];
        box2.toDraw = true;

        box3.l = moves[2];
        box3.toDraw = true;

        // Updates Board
        repaint();
    }

    private void locationChecker(Pawn p, String b) {
        String[] moves = location.moveOptions(round, p.dt);
        System.out.println(Arrays.toString(moves));

        if (ult.arrayStringChecker(moves, b)) {
            box1.toDraw = false;
            box2.toDraw = false;
            box3.toDraw = false;

            p.l = b;
            p.t = p.dt;
            round++;
            playerChose = false; // Resets Player stuff
        }

        repaint();
    }

    // RESET Methods
    private void startUpVariables() {
        round = 1;
        wins = 0;
        loss = 0;
        playerChose = false;
    }

    // Drawing Board
    private static void drawBackground(Graphics g) {
        ImageIcon background = new ImageIcon("Imgs/WindowStuff/3x3-Board.png");
        g.drawImage(background.getImage(), 0, 0, null);
    }

    // Drawing Elements to the panel
    public void paint(Graphics g) {
        drawBackground(g);

        box1.draw(g);
        box2.draw(g);
        box3.draw(g);

        pawnA.draw(g);
        pawnB.draw(g);
        pawnC.draw(g);

        pawn1.draw(g);
        pawn2.draw(g);
        pawn3.draw(g);
    }

    // Mouse Events
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        if (!playerChose) {
            characterSelection(location.checkCords(e.getX(), e.getY()));
        } else {
            locationChecker(playerSelectionPawn, location.checkCords(e.getX(), e.getY()));
        }
    }

    // Shit is down here
    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
    }
}