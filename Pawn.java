/****************************
 * This will run the pawn 
 * icons. All it needs is
 * its type and location
****************************/

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Pawn {
    //Pawn Data
    int t; // Type of Pawn
    String l; // Location of Pawn
    boolean isSelected;
    boolean isActive = true;
    String[] pawnIcon = {"Imgs/Pawns/Player/PawnA.png","Imgs/Pawns/Player/PawnB.png","Imgs/Pawns/Player/PawnC.png","Imgs/Pawns/Bot/PawnBot.png","Imgs/Pawns/Special/PawnSpecial.png"};
    

    Pawn(int type, String location){
        //Applying Data
        t = type;
        l = location;
    }

    public void draw(Graphics g) {
        BoardLocations board = new BoardLocations();//Usefull object for board x,y locations
        
        // Calling method
        board.boardValues(l);

        if(isActive){
            ImageIcon icon = new ImageIcon(pawnIcon[t]);
            g.drawImage(icon.getImage(), board.x, board.y, null);
        }
    }
}

class BoardLocations {
    int x,y;

    // Location data base
    public void boardValues(String n) {//Input Code Name
        switch (n) {
            case "one":
                x = 0;
                y = 0;
                break;
            case "two":
                x = 300;
                y = 0;
                break;
            case "three":
                x = 600;
                y = 0;
                break;
            case "four":
                x = 0;
                y = 300;
                break;
            case "five":
                x = 300;
                y = 300;
                break;
            case "six":
                x = 600;
                y = 300;
                break;
                case "seven":
                x = 0;
                y = 600;
                break;
                case "eight":
                x = 300;
                y = 600;
                break;
                case "nine":
                x = 600;
                y = 600;
                break;
        }
    }
}