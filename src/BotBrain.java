/*
 * Shooping Doopy 
*/

package src;

import java.util.Random;

public class BotBrain {
    // Objects
    Random random = new Random(); // Like Arrays

    /*
     * Locations for each of the bots pawns
     */
    public int[] locations = { 1, 2, 3 };

    /*
     * This will be the move database that the bot uses
     */
    int[][][][] BOTMOVESET = {
            { // Bots first turn
                    { // Gamestates
                            { 1, 4, 3 }, // Movesets
                            { 1, 5, 3 },
                            { 1, 2, 6 }
                    },
                    {
                            { 4, 2, 3 },
                            { 5, 2, 3 },
                            { 1, 2, 5 },
                            { 1, 2, 6 }
                    },
                    {
                            { 4, 2, 3 },
                            { 1, 5, 3 },
                            { 1, 6, 3 }
                    }
            },
            { // Bots second turn
                    {
                            { 1, 4, 6 }
                    }
            },
            { // Round 6

            }
    };

    BotBrain() {

    }

    /*
     * This will activate the brain of the bot
     */
    public void setPlan(int round, int gameState) {

        int rand = random.nextInt(BOTMOVESET[round][gameState].length);
        System.out.println(rand + " " + BOTMOVESET[round][gameState].length);

        try {
            for (int i = 0; i < 3; i++) {
                locations[i] = BOTMOVESET[round][gameState][rand][i];
            }
        } catch (Exception e) {
            System.out.println("Round 2 Game plans failed - " + e);
        }
    }
}