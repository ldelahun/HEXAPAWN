package src;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.MouseListener;

public class Game extends JPanel implements MouseListener {
    // Objects
    static Pawns pawnA, pawnB, pawnC, pawn1, pawn2, pawn3, playerSelectionPawn;
    static BoardLocations location = new BoardLocations();
    static SelectedBox box1, box2, box3;

    // Game data
    static int wins, loss, round, gameState;
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
        pawnA.boardLocation = 7;
        pawnB.boardLocation = 8;
        pawnC.boardLocation = 9;
        pawn1.boardLocation = 1;
        pawn2.boardLocation = 2;
        pawn3.boardLocation = 3;
    }

    private void createPawns() {// Creates all the pawns
        pawnA = new Pawns(0);
        pawnB = new Pawns(1);
        pawnC = new Pawns(2);
        pawn1 = new Pawns(3);
        pawn2 = new Pawns(3);
        pawn3 = new Pawns(3);

        box1 = new SelectedBox();
        box2 = new SelectedBox();
        box3 = new SelectedBox();
    }

    // Player Things
    private void characterSelection(int box) {
        if (pawnA.boardLocation == box) {
            pawnSelected(pawnA);
        } else if (pawnB.boardLocation == box) {
            pawnSelected(pawnB);
        } else if (pawnC.boardLocation == box) {
            pawnSelected(pawnC);
        }

    }

    private void pawnSelected(Pawns pawn) {
        pawn.type = 4;// Sets pawn select icon
        playerSelectionPawn = pawn;
        playerChose = true;

        // Shows boxes
        box1.location = location.moveOptions(round, pawn.defaultType, 0, gameState);
        box1.toDraw = true;

        box2.location = location.moveOptions(round, pawn.defaultType, 1, gameState);
        box2.toDraw = true;

        box3.location = location.moveOptions(round, pawn.defaultType, 2, gameState);
        box3.toDraw = true;

        // Updates Board
        repaint();
    }

    private void locationChecker(Pawns pawn, int pawnPosition) {

        if (location.moveOptions(round, pawn.defaultType, 0, gameState) == pawnPosition || location.moveOptions(round, pawn.defaultType, 1, gameState) == pawnPosition || location.moveOptions(round, pawn.defaultType, 2, gameState) == pawnPosition ) {
            box1.toDraw = false;
            box2.toDraw = false;
            box3.toDraw = false;

            pawn.boardLocation = pawnPosition;
            pawn.type = pawn.defaultType;
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
        gameState = 0;
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
    public void mouseClicked(java.awt.event.MouseEvent mouse) {
        if (!playerChose) {
            characterSelection(location.checkCords(mouse.getX(), mouse.getY()));
        } else {
            locationChecker(playerSelectionPawn, location.checkCords(mouse.getX(), mouse.getY()));
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