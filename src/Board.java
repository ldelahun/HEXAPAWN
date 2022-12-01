package src;

public class Board {
    int x, y;

    // Location data base
    public void boardValues(int boardCode) {// Input Code Name
        switch (boardCode) {
            case 1:
                x = 0;
                y = 0;
                break;
            case 2:
                x = 300;
                y = 0;
                break;
            case 3:
                x = 600;
                y = 0;
                break;
            case 4:
                x = 0;
                y = 300;
                break;
            case 5:
                x = 300;
                y = 300;
                break;
            case 6:
                x = 600;
                y = 300;
                break;
            case 7:
                x = 0;
                y = 600;
                break;
            case 8:
                x = 300;
                y = 600;
                break;
            case 9:
                x = 600;
                y = 600;
                break;
            default:
                x = -300;
                y = -300;
        }
    }

    public int checkCords(int x, int y) {
        int boardCode = 0;

        // Giant if else chain because god is dead.
        if (y > 300 && y <= 600) {
            if (x >= 0 && x < 300) {
                boardCode = 4;
            } else if (x >= 300 && x < 600) {
                boardCode = 5;
            } else {
                boardCode = 6;
            }
        } else if (y > 600 && y <= 900) {
            if (x >= 0 && x < 300) {
                boardCode = 7;
            } else if (x >= 300 && x < 600) {
                boardCode = 8;
            } else {
                boardCode = 9;
            }
        } else {
            if (x >= 0 && x < 300) {
                boardCode = 1;
            } else if (x >= 300 && x < 600) {
                boardCode = 2;
            } else {
                boardCode = 3;
            }
        }

        // Returning the code name
        return boardCode;
    }

    // Check if it is placeable
    public int moveOptions(int round, int pawn, int box, int boardState) {
        int boxPosition = 10;
        int[][][][] possiblePositions = { // God comes to die right here
            { // What pawn this thing is
                { // What round we are on
                    {4,10,10} // Game state of the board 
                },
                {

                }
            },
            {
                {
                    {5,10,10}
                },
                {

                }
            },
            {
                {
                    {6,10,10}
                },
                {

                }
            }
        };

        round--; // This is to set it up for an array

        try {
            boxPosition = possiblePositions[pawn][round][boardState][box];
        } catch (Exception e) {
            System.out.println("error array is dogshit - "+e);
        }

        return boxPosition;
    }

    public int stateChecker(int round, int aLocation, int bLocation, int cLocation, int oneLocation, int twoLocation, int threeLocation){
        int gameState = -1;
        
        if (round == 1) {
            if (aLocation == 7 && bLocation == 8 && cLocation == 9 && oneLocation == 1 && twoLocation == 2 && threeLocation == 3) {
                gameState = 0;
            }
        }else if (round == 2) {
            if (aLocation == 4 && bLocation == 8 && cLocation == 9 && oneLocation == 1 && twoLocation == 2 && threeLocation == 3) {
                gameState = 0;
            }else if (aLocation == 7 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 2 && threeLocation == 3) {
                gameState = 1;
            }else if (aLocation == 7 && bLocation == 8 && cLocation == 6 && oneLocation == 1 && twoLocation == 2 && threeLocation == 3) {
                gameState = 2;
            }
        }else if (round == 3) {

        }else if (round == 4) {

        }else if(round == 5){
            
        }else if(round == 6){

        }else if(round == 7){

        }
        
        
        return gameState;
    }

    public boolean pawnActive(int round, int gameState, int pawn){
        
        return true;
    }
}