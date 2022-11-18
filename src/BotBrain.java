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
        locations[1] = 5;
    }
}
