/*
 * Shooping Doopy 
*/
package src;

import java.awt.Graphics;

import javax.swing.ImageIcon;

class SelectedBox {
    // Variables
    int location = 0;
    boolean toDraw = false;

    // Objects
    ImageIcon icon = new ImageIcon("Imgs/WindowStuff/allowedBox.png");
    BoardLocations board = new BoardLocations();//Usefull object for board x,y locations

    public void draw(Graphics g) {
        board.boardValues(location);// Getting x and y locations

        if(toDraw){
            g.drawImage(icon.getImage(), board.x, board.y, null);
        }
    }
}