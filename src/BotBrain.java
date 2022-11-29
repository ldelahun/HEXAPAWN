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
    final int[][][][] BOTMOVESET = {
            { // Round 2
                    {
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
            { // Round 4

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
        switch (round) {
            case 2:
                roundTwo(gameState);
                break;

            default:
                break;
        }
    }

    /*
     * Round 2 bot events
     */
    private void roundTwo(int gameState) {

        int rand = random.nextInt(BOTMOVESET[0][gameState].length);

        try {
            for (int i = 0; i < 3; i++) {
                locations[i] = BOTMOVESET[0][gameState][rand][i];
            }
        } catch (Exception e) {
            System.out.println("Round 2 Game plans failed - " + e);
        }
    }
}