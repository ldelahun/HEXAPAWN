/*
 * Shooping Doopy 
*/
package src;

import java.awt.Graphics;

import javax.swing.ImageIcon;

/** 
 * This class will hold the pawn objects that can be manipulate the board
*/
public class Pawns {
    int type;
    int defaultType;
    int boardLocation; // Location of Pawn
    boolean isActive = true;
    String[] pawnIcons = {"Imgs/Pawns/Player/PawnA.png","Imgs/Pawns/Player/PawnB.png","Imgs/Pawns/Player/PawnC.png","Imgs/Pawns/Bot/PawnBot.png","Imgs/Pawns/Special/PawnSpecial.png"};//All known pawn icons

    // objs
    BoardLocations board = new BoardLocations();//Usefull object for board x,y locations

    Pawns(int pawnType){
        //Applying Data
        type = pawnType;
        defaultType = pawnType;
    }

    public void draw(Graphics g) {
        // Calling method
        board.boardValues(boardLocation);

        if(isActive){
            ImageIcon icon = new ImageIcon(pawnIcons[type]);
            g.drawImage(icon.getImage(), board.x, board.y, null);
        }
    }
}