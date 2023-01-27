/*
 * Shooping Doopy 
*/

package src;

import java.util.ArrayList;
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
        private int[] pastMove = { 0, 0, 0 };

        /*
         * This will be the move database that the bot uses
         */
        int[][][][] BOTMOVESET = {
                        { // Bots first turn
                                        { // Gamestates
                                                        { 1, 4, 3, 1 },
                                                        { 1, 5, 3, 1 }, //
                                                        { 1, 2, 6, 1 } //
                                        },
                                        {
                                                        { 4, 2, 3, 1 }, //
                                                        { 5, 2, 3, 1 }, //
                                                        { 1, 2, 5, 1 }, //
                                                        { 1, 2, 6, 1 }//
                                        },
                                        {
                                                        { 4, 2, 3, 1 }, //
                                                        { 1, 5, 3, 1 },
                                                        { 1, 6, 3, 1 }
                                        }
                        },
                        { // Bots second turn
                                        {
                                                        { 1, 4, 6, 1 } // Good it works
                                        },
                                        {
                                                        { 5, 4, 3, 1 }, // Good checked off
                                                        { 1, 7, 3, 1 },
                                                        { 1, 4, 5, 1 },
                                                        { 1, 4, 6, 1 },
                                        },
                                        {
                                                        { 1, 7, 3, 1 }, // Good dont touch
                                                        { 1, 8, 3, 1 },

                                        },
                                        {
                                                        { 5, 5, 3, 1 }, // Good dont touch
                                                        { 1, 5, 5, 1 },
                                                        { 1, 5, 6, 1 },
                                        },
                                        {
                                                        { 10, 10, 10, 1 } // Cant do anything
                                        },
                                        {
                                                        { 10, 10, 10, 1 } // Cant do anything
                                        },
                                        {
                                                        { 5, 2, 6, 1 },
                                                        { 1, 4, 6, 1 },
                                        },
                                        {
                                                        { 1, 4, 6, 1 },
                                                        { 1, 5, 6, 1 },
                                                        { 1, 6, 6, 1 },
                                        },
                                        {
                                                        { 10, 10, 10, 1 } // Cant do anything
                                        },
                                        {
                                                        { 4, 6, 3, 1 },
                                                        { 4, 2, 5, 1 },
                                        },
                                        {
                                                        { 8, 2, 3, 1 },
                                                        { 9, 2, 3, 1 },
                                                        { 5, 4, 3, 1 },
                                                        { 5, 2, 6, 1 },
                                        },
                                        {
                                                        { 5, 2, 5, 1 },
                                                        { 5, 2, 6, 1 }
                                        },
                                        {
                                                        { 5, 2, 5, 1 },
                                                        { 5, 2, 6, 1 }
                                        },
                                        {
                                                        { 7, 2, 3, 1 },
                                                        { 8, 2, 3, 1 },
                                                        { 5, 6, 3, 1 }
                                        },
                                        {
                                                        { 1, 4, 5, 1 },
                                                        { 1, 2, 8, 1 },
                                                        { 1, 2, 9, 1 }
                                        },
                                        {
                                                        { 4, 2, 5, 1 },
                                                        { 5, 2, 5, 1 },
                                        },
                                        {
                                                        { 4, 2, 5, 1 },
                                                        { 5, 2, 5, 1 }
                                        },
                                        {
                                                        { 4, 2, 5, 1 },
                                                        { 1, 6, 5, 1 },
                                                        { 1, 2, 7, 1 },
                                                        { 1, 2, 8, 1 }
                                        },
                                        {
                                                        { 10, 10, 10, 1 } // Cant do anything
                                        },
                                        {
                                                        { 4, 4, 3, 1 },
                                                        { 4, 5, 3, 1 },
                                                        { 4, 6, 3, 1 }
                                        },
                                        {
                                                        { 10, 10, 10, 1 } // Cant do anything
                                        },
                                        {
                                                        { 10, 10, 10, 1 } // Cant do anything
                                        },
                                        {
                                                        { 4, 5, 3, 1 },
                                        },
                                        {
                                                        { 1, 8, 3, 1 },
                                                        { 1, 9, 3, 1 }
                                        },
                                        {
                                                        { 4, 6, 3, 1 },
                                                        { 5, 6, 3, 1 },
                                                        { 1, 6, 5, 1 },
                                                        { 1, 9, 3, 1 },
                                        },
                                        {
                                                        { 4, 6, 3, 1 }
                                        }
                        },
                        { // Bots last turn

                        }
        };

        BotBrain() {

        }

        /*
         * This will activate the brain of the bot
         */
        public void setPlan(int round, int gameState) {

                int move = checkPlan(round, gameState);

                storeMove(round, gameState, move);

                System.out.println(move);

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
                int randPlan;

                ArrayList<Integer> possibleMoves = new ArrayList<Integer>(); // Eat Shit dumbass

                for (int i = 0; i < BOTMOVESET[r][g].length; i++) {
                        if (BOTMOVESET[r][g][i][3] == 1) {

                                possibleMoves.add(i);
                        }
                }

                System.out.println(possibleMoves);

                randPlan = random.nextInt(possibleMoves.size());

                return possibleMoves.get(randPlan);
        }

        /*
         * Stores previous move
         */
        private void storeMove(int round, int game, int move) {
                pastMove[0] = round;
                pastMove[1] = game;
                pastMove[2] = move;

                System.out.println("STORED MOVE -" + pastMove[0] + "," + pastMove[1] + "," + pastMove[2]);
        }
}