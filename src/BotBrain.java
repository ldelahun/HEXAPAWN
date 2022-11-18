/*
 * Shooping Doopy 
*/

package src;


public class BotBrain {
    
    /*
     * Locations for each of the bots pawns
     */
    int[] locations = {1,2,3};

    /*
     * This will activate the brain of the bot
     */
    public void setPlan(int round, int gameState) {
        switch (gameState) {
            case 0:
                locations[2] = 6;
                break;
            case 1:
                locations[0] = 4;
                break;
            case 2:
                locations[1] = 5;
                break;
        }
    }
}
