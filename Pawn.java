/****************************
 * This will run the pawn 
 * icons. All it needs is
 * its type and location
****************************/

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Pawn {
    //Pawn Data
    int x,y;
    int t,dt; // Type of Pawn
    String l; // Location of Pawn
    boolean isSelected;
    boolean isActive = true;
    String[] pawnIcon = {"Imgs/Pawns/Player/PawnA.png","Imgs/Pawns/Player/PawnB.png","Imgs/Pawns/Player/PawnC.png","Imgs/Pawns/Bot/PawnBot.png","Imgs/Pawns/Special/PawnSpecial.png"};//All known pawn icons

    // objs
    BoardLocations board = new BoardLocations();//Usefull object for board x,y locations

    Pawn(int type){
        //Applying Data
        t = type;
        dt = type;
    }

    private void saveLocation(){
        x = board.x;
        y = board.y;
    }

    public void draw(Graphics g) {
        // Calling method
        board.boardValues(l);

        if(isActive){
            ImageIcon icon = new ImageIcon(pawnIcon[t]);
            g.drawImage(icon.getImage(), board.x, board.y, null);
            saveLocation();
        }
    }
}