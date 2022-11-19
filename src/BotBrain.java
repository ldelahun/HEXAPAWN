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
    int[] locations = {1,2,3};

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
    private void roundTwo(int gameState){
        int[][][] gamePlans = {
            { // Gameplan
                {1,4,3}, // Movesets
                {1,5,3},
                {1,2,6}
            },
            {
                {4,2,3},
                {5,2,3},
                {1,2,5},
                {1,2,6}
            },
            {
                {4,2,3},
                {1,5,3},
                {1,6,3}
            }
        };

        System.out.println(gamePlans[gameState].length);
        
        int rand = random.nextInt(gamePlans[gameState].length);

        try {
            for (int i = 0; i < 3; i++) {
                locations[i] = gamePlans[gameState][rand][i];
            }
        } catch (Exception e) {
            System.out.println("Round 2 Game plans failed - "+e);
        }
    }
}
