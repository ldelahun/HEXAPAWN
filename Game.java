import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.MouseListener;

public class Game extends JPanel implements MouseListener{
    // Objects
    static Pawn pawnA, pawnB, pawnC, pawn1, pawn2, pawn3, playerSelectionPawn;
    static BoardLocations location = new BoardLocations();

    // Game data
    static int wins,loss,round;
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
        pawnA.l="seven";
        pawnB.l="eight";
        pawnC.l="nine";
        pawn1.l="one";
        pawn2.l="two";
        pawn3.l="three";
    }

    private void createPawns() {// Creates all the pawns
        pawnA = new Pawn(0);
        pawnB = new Pawn(1);
        pawnC = new Pawn(2);
        pawn1 = new Pawn(3);
        pawn2 = new Pawn(3);
        pawn3 = new Pawn(3);
    }
    
    // Player Things
    private void characterSelection(String b){
        if(pawnA.l.equals(b)) {
            pawnSelected(pawnA);
        }else if(pawnB.l.equals(b)){
            pawnSelected(pawnB);
        }else if(pawnC.l.equals(b)){
            pawnSelected(pawnC);
        }
    }
    private void pawnSelected(Pawn p){
        p.t = 4;// Sets pawn select icon
        playerSelectionPawn = p;
        playerChose = true;
        //Updates Board
        repaint();
    }
    private void locationSelect(Pawn p, String b){
        String[] moves = location.moveOptions(round, p.dt);

        
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
        if(!playerChose){
            characterSelection(location.checkCords(e.getX(), e.getY()));
        }else {
            locationSelect(playerSelectionPawn, location.checkCords(e.getX(), e.getY()));
        }
    }
    //Shit is down here
    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {}
    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {}
    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {}
    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {}
}