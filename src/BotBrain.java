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
         * Memory of recent move
         */
        private int pastMove;

        /*
         * This will be the move database that the bot uses
         */
        int[][][][] BOTMOVESET = {
                        { // Bots first turn
                                        { // Gamestates
                                                        { 1, 4, 3, 0 }, // Movesets
                                                        { 1, 5, 3, 0 },
                                                        { 1, 2, 6, 1 }
                                        },
                                        {
                                                        { 4, 2, 3, 1 },
                                                        { 5, 2, 3, 1 },
                                                        { 1, 2, 5, 1 },
                                                        { 1, 2, 6, 1 }
                                        },
                                        {
                                                        { 4, 2, 3, 1 },
                                                        { 1, 5, 3, 1 },
                                                        { 1, 6, 3, 1 }
                                        }
                        },
                        { // Bots second turn

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

                int move = checkPlan(round, gameState);

                pastMove = move;

                try {
                        for (int i = 0; i < 3; i++) {
                                locations[i] = BOTMOVESET[round][gameState][move][i];
                        }
                } catch (Exception e) {
                        System.out.println("Bot System has failed; please check - " + e);
                }
        }

        /*
         * checking if the move is still in play
         */
        private int checkPlan(int r, int g) {
                int plan = random.nextInt(BOTMOVESET[r][g].length);

                if (BOTMOVESET[r][g][plan][3] == 0) {
                        System.out.println(BOTMOVESET[r][g][plan][3]);
                        System.out.println(BOTMOVESET[r][g][plan][0]+" "+BOTMOVESET[r][g][plan][1]+" "+BOTMOVESET[r][g][plan][2]);
                        checkPlan(r, g);
                }

                return plan;
        }
}