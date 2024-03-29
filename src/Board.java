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
    public int moveOptions(int pRound, int pawn, int box, int boardState) {
        int boxPosition = 10; // Defualt Position

        int[][][][] possiblePositions = { // God comes to die right here
                { // Players first turn
                        { // Game State 0
                            { 4, 10, 10 },
                            { 5, 10, 10 },
                            { 6, 10, 10 } 
                        }
                },
                { // Players second turn
                        { // Chilled out
                                { 10, 10, 10 }, // pawn A
                                { 4, 5, 10 },
                                { 6, 10, 10 }
                        },
                        { // Chilled out
                                { 10, 10, 10 },
                                { 10, 10, 10 },
                                { 5, 6, 10 },
                        },
                        {
                                { 2, 10, 10 }, // Win Condition
                                { 5, 6, 10 },
                                { 10, 10, 10 },
                        },
                        {
                                { 10, 10, 10 },
                                { 3, 10, 10 },
                                { 6, 10, 10 },
                        },
                        {
                                { 4, 5, 10 },
                                { 10, 10, 10 },
                                { 5, 6, 10 },
                        },
                        {
                                { 4, 5, 10 },
                                { 10, 10, 10 },
                                { 5, 6, 10 },
                        },
                        {
                                { 4, 10, 10 },
                                { 1, 10, 10 },
                                { 10, 10, 10 },
                        },
                        {
                                { 10, 10, 10 },
                                { 4, 5, 10 },
                                { 2, 10, 10 },
                        },
                        {
                                { 4, 5, 10 },
                                { 10, 10, 10 },
                                { 10, 10, 10 },
                        },
                        {
                                { 4, 10, 10 },
                                { 5, 6, 10 },
                                { 10, 10, 10 },
                        },
                },
                { // Players third turn WOw
                        {
                                
                        },
                        {
                                { 10, 10, 10 },
                                { 10, 10, 10 },
                                { 5, 6, 10 },
                        },
                        {
                                
                        },
                        {
                                { 10, 10, 10 },
                                { 10, 10, 10 },
                                { 5, 6, 10 },
                        },
                        {
                                { 10, 10, 10 },
                                { 1, 2, 10 },
                                { 10, 10, 10 },
                        },
                        {
                                
                        },
                        {
                                
                        },
                        {
                                { 1, 10, 10 },
                                { 10, 10, 10 },
                                { 10, 10, 10 },
                        },
                        {
                                
                        },
                        {
                                { 10, 10, 10 },
                                { 6, 10, 10 },
                                { 2, 1, 10 },
                        },
                        {
                                { 1, 2, 10 },
                                { 10, 10, 10 },
                                { 5, 10, 10 },
                        },
                        {
                                { 10, 10, 10 },
                                { 3, 10, 10 },
                                { 10, 10, 10 },
                        },
                        {},
                        {
                                { 10, 10, 10 },
                                { 3, 10, 10 },
                                { 5, 10, 10 },
                        },
                        {
                                
                        },
                        {
                                { 10, 10, 10 },
                                { 2, 3, 10 },
                                { 10, 10, 10 },
                        },
                        {
                                { 5, 10, 10 },
                                { 10, 10, 10 },
                                { 2, 3, 10 },
                        },
                        {
                                
                        },
                        {
                                
                        },
                        {},
                        {},
                        {
                                { 10, 10, 10 },
                                { 10, 10, 10 },
                                { 5, 6, 10 },
                        },
                        {
                                
                        },
                        {
                                { 4, 5, 10 },
                                { 10, 10, 10 },
                                { 10, 10, 10 },
                        },
                        {
                                { 4, 10, 10 },
                                { 10, 10, 10 },
                                { 10, 10, 10 },
                        },
                        {
                                
                        },
                        {
                                
                        },
                        {
                                { 4, 5, 10 },
                                { 10, 10, 10 },
                                { 10, 10, 10 },
                        },
                        {
                                
                        },
                        {},
                        {
                                
                        },
                        {
                                { 10, 10, 10 },
                                { 10, 10, 10 },
                                { 6, 10, 10 },
                        },
                        {
                                
                        },
                        {},
                        {},
                        {},
                        {
                                { 4, 5, 10 },
                                { 10, 10, 10 },
                                { 10, 10, 10 },
                        },
                        {
                                
                        },
                        {
                                
                        },
                        {
                                
                        },
                        {
                                { 5, 10, 10 },
                                { 1, 10, 10 },
                                { 10, 10, 10 },
                        },
                        {
                                { 2, 3, 10 },
                                { 4, 10, 10 },
                                { 10, 10, 10 },
                        },
                        {
                                
                        },
                        {
                                
                        },
                        {
                                
                        },
                        {
                                
                        },
                        {
                                
                        },
                        {
                                { 10, 10, 10 },
                                { 1, 10, 10 },
                                { 10, 10, 10 },
                        },

                },
                { // Final player round
                        {}, //
                        { { 2, 10, 10 },
                                { 2, 10, 10 },
                                { 2, 10, 10 }, },
                        {
                                { 2, 10, 10 },
                                { 2, 10, 10 },
                                { 2, 10, 10 },
                        },
                        {
                                
                        }, //
                        {
                                
                        }, //
                        {
                                
                        }, //
                        {
                        }, //
                        {
                                
                        }, //
                        {{ 2, 10, 10 },
                        { 2, 10, 10 },
                        { 2, 10, 10 },},
                        {{ 2, 10, 10 },
                        { 2, 10, 10 },
                        { 2, 10, 10 },},
                        {
                                
                        }, //
                        {
                                
                        }, //
                        {{ 2, 10, 10 },
                        { 2, 10, 10 },
                        { 2, 10, 10 },},
                        {{ 2, 10, 10 },
                        { 2, 10, 10 },
                        { 2, 10, 10 },},
                        {
                                
                        }, //
                        {
                                
                        }, //
                        {{ 2, 10, 10 },
                        { 2, 10, 10 },
                        { 2, 10, 10 },},
                        {
                                
                        }, //
                        {
                            
                        }, //
                        {{ 2, 10, 10 },
                        { 2, 10, 10 },
                        { 2, 10, 10 },},
                        {
                                
                        }, //
                }

        };

        if (possiblePositions[pRound][boardState].length == 0){
            System.out.println("no moves on player");
            Game.winner(false);
        }

        try {
            boxPosition = possiblePositions[pRound][boardState][pawn][box];
        } catch (Exception e) {
            System.out.println("error array is - " + e);
        }

        return boxPosition;
    }

    public int stateChecker(int round, int aLocation, int bLocation, int cLocation, int oneLocation, int twoLocation,
            int threeLocation) {
        int gameState = -1;

        System.out.println(round + "The ching has fallen" + aLocation + "-" + bLocation + "-" + cLocation + "-"
                + oneLocation + "-" + twoLocation + "-" + threeLocation + "I have Terminal Cancer"); // Debuging Script

        if (round == 1) { // Start of all rounds
            if (aLocation == 7 && bLocation == 8 && cLocation == 9 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 0;
            }
        } else if (round == 2) {
            if (aLocation == 4 && bLocation == 8 && cLocation == 9 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 0;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 1;
            } else if (aLocation == 7 && bLocation == 8 && cLocation == 6 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 2;
            }
        } else if (round == 3) {
            if (aLocation == 4 && bLocation == 8 && cLocation == 9 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 3) {
                gameState = 0;
            } else if (aLocation == 4 && bLocation == 8 && cLocation == 9 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 1;
            } else if (aLocation == 4 && bLocation == 8 && cLocation == 9 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 6) {
                gameState = 2;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 9 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 3;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 9 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 4;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 5;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 6) {
                gameState = 6;
            } else if (aLocation == 7 && bLocation == 8 && cLocation == 6 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 7;
            } else if (aLocation == 7 && bLocation == 8 && cLocation == 6 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 8;
            } else if (aLocation == 7 && bLocation == 8 && cLocation == 6 && oneLocation == 1 && twoLocation == 6
                    && threeLocation == 3) {
                gameState = 9;
            }
        } else if (round == 4) {
            if (aLocation == 4 && bLocation == 4 && cLocation == 9 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 3) {
                gameState = 0;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 3) {
                gameState = 1;
            } else if (aLocation == 4 && bLocation == 8 && cLocation == 6 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 3) {
                gameState = 2;
            } else if (aLocation == 4 && bLocation == 8 && cLocation == 5 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 3;
            } else if (aLocation == 4 && bLocation == 8 && cLocation == 6 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 4;
            } else if (aLocation == 2 && bLocation == 8 && cLocation == 9 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 6) {
                gameState = 5;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 6) {
                gameState = 6;
            } else if (aLocation == 4 && bLocation == 6 && cLocation == 9 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 6) {
                gameState = 7;
            } else if (aLocation == 7 && bLocation == 3 && cLocation == 9 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 8;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 9;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 10;
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 9 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 11; // Next one
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 12;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 13;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 14;
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 15;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 5 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 16;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 17;
            } else if (aLocation == 7 && bLocation == 1 && cLocation == 9 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 6) {
                gameState = 18;
            } else if (aLocation == 7 && bLocation == 4 && cLocation == 6 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 19;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 20; // this may be useless
            } else if (aLocation == 7 && bLocation == 8 && cLocation == 2 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 21;
            } else if (aLocation == 5 && bLocation == 8 && cLocation == 6 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 22;
            } else if (aLocation == 4 && bLocation == 8 && cLocation == 6 && oneLocation == 1 && twoLocation == 6
                    && threeLocation == 3) {
                gameState = 23;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 1 && twoLocation == 6
                    && threeLocation == 3) {
                gameState = 24;
            } else if (aLocation == 7 && bLocation == 6 && cLocation == 6 && oneLocation == 1 && twoLocation == 6
                    && threeLocation == 3) {
                gameState = 25;
            }

        } else if (round == 5) {
            if (aLocation == 4 && bLocation == 4 && cLocation == 9 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 6) {
                gameState = 0; //
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 5 && twoLocation == 4
                    && threeLocation == 3) {
                gameState = 1;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 7
                    && threeLocation == 3) {
                gameState = 2;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 5) {
                gameState = 3;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 6) {
                gameState = 4;
            } else if (aLocation == 4 && bLocation == 8 && cLocation == 6 && oneLocation == 1 && twoLocation == 7
                    && threeLocation == 3) {
                gameState = 5;
            } else if (aLocation == 4 && bLocation == 8 && cLocation == 6 && oneLocation == 1 && twoLocation == 8
                    && threeLocation == 3) {
                gameState = 6;
            } else if (aLocation == 4 && bLocation == 8 && cLocation == 5 && oneLocation == 5 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 7;
            } else if (aLocation == 4 && bLocation == 8 && cLocation == 5 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 5) {
                gameState = 8;
            } else if (aLocation == 4 && bLocation == 8 && cLocation == 5 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 6) {
                gameState = 9;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 6) {
                gameState = 10;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 6) {
                gameState = 12;
            } else if (aLocation == 4 && bLocation == 6 && cLocation == 9 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 6) {
                gameState = 13;
            } else if (aLocation == 4 && bLocation == 6 && cLocation == 9 && oneLocation == 1 && twoLocation == 6
                    && threeLocation == 6) {
                gameState = 14;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 4 && twoLocation == 6
                    && threeLocation == 3) {
                gameState = 15;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 16;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 8 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 17;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 9 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 18;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 5 && twoLocation == 4
                    && threeLocation == 3) {
                gameState = 19;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 6) {
                gameState = 20;
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 9 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 21;
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 9 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 6) {
                gameState = 22;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 23;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 6) {
                gameState = 24;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 7 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 25;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 8 && twoLocation == 2
                    && threeLocation == 3) {
                gameState = 26;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 5 && twoLocation == 6
                    && threeLocation == 3) {
                gameState = 27;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 5) {
                gameState = 28;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 8) {
                gameState = 29;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 9 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 9) {
                gameState = 30;
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 9 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 31;
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 9 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 32;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 5 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 33;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 34;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 35;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 1 && twoLocation == 6
                    && threeLocation == 5) {
                gameState = 36;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 7) {
                gameState = 37;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 1 && twoLocation == 2
                    && threeLocation == 8) {
                gameState = 38;
            } else if (aLocation == 7 && bLocation == 4 && cLocation == 6 && oneLocation == 4 && twoLocation == 4
                    && threeLocation == 3) {
                gameState = 39;
            } else if (aLocation == 7 && bLocation == 4 && cLocation == 6 && oneLocation == 4 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 40;
            } else if (aLocation == 5 && bLocation == 8 && cLocation == 6 && oneLocation == 4 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 41;
            } else if (aLocation == 5 && bLocation == 8 && cLocation == 6 && oneLocation == 5 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 42;
            } else if (aLocation == 5 && bLocation == 8 && cLocation == 6 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 5) {
                gameState = 43;
            } else if (aLocation == 4 && bLocation == 8 && cLocation == 6 && oneLocation == 1 && twoLocation == 9
                    && threeLocation == 3) {
                gameState = 44;
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 6 && oneLocation == 1 && twoLocation == 9
                    && threeLocation == 3) {
                gameState = 45;
            } else if (aLocation == 7 && bLocation == 6 && cLocation == 6 && oneLocation == 4 && twoLocation == 6
                    && threeLocation == 3) {
                gameState = 46;
            } else if (aLocation == 4 && bLocation == 6 && cLocation == 9 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 6) {
                gameState = 11;
            } else if (aLocation == 7 && bLocation == 4 && cLocation == 6 && oneLocation == 4 && twoLocation == 6
                    && threeLocation == 3) {
                gameState = 47;
            } else if (aLocation == 5 && bLocation == 8 && cLocation == 6 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 48;
            }
        } else if (round == 6) {
            if (aLocation == 4 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 4
                    && threeLocation == 3) {
                gameState = 0; //
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 6 && oneLocation == 5 && twoLocation == 4
                    && threeLocation == 3) {
                gameState = 1; //
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 5 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 5) {
                gameState = 2; //
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 6 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 5) {
                gameState = 3; //
            } else if (aLocation == 4 && bLocation == 1 && cLocation == 9 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 6) {
                gameState = 4; //
            } else if (aLocation == 4 && bLocation == 2 && cLocation == 9 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 6) {
                gameState = 5; //
            } else if (aLocation == 1 && bLocation == 8 && cLocation == 5 && oneLocation == 5 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 6; //
            } else if (aLocation == 4 && bLocation == 6 && cLocation == 5 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 6) {
                gameState = 7; //
            } else if (aLocation == 4 && bLocation == 8 && cLocation == 2 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 6) {
                gameState = 8; //
            } else if (aLocation == 4 && bLocation == 8 && cLocation == 1 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 6) {
                gameState = 9;//
            } else if (aLocation == 1 && bLocation == 5 && cLocation == 9 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 6) {
                gameState = 10; //
            } else if (aLocation == 2 && bLocation == 5 && cLocation == 9 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 6) {
                gameState = 11; //
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 6) {
                gameState = 12; //
            } else if (aLocation == 4 && bLocation == 3 && cLocation == 9 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 6) {
                gameState = 13; //
            } else if (aLocation == 4 && bLocation == 3 && cLocation == 9 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 6) {
                gameState = 14; //
            } else if (aLocation == 4 && bLocation == 6 && cLocation == 5 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 6) {
                gameState = 15; //
            } else if (aLocation == 7 && bLocation == 2 && cLocation == 6 && oneLocation == 4 && twoLocation == 6
                    && threeLocation == 3) {
                gameState = 16;//
            } else if (aLocation == 7 && bLocation == 3 && cLocation == 6 && oneLocation == 4 && twoLocation == 6
                    && threeLocation == 3) {
                gameState = 17; //
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 6 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 18; //
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 2 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 19; //
            } else if (aLocation == 7 && bLocation == 5 && cLocation == 3 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 20; //
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 21; //
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 6 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 22;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 23; //
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 6) {
                gameState = 24;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 6 && oneLocation == 5 && twoLocation == 6
                    && threeLocation == 3) {
                gameState = 25;
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 6 && oneLocation == 5 && twoLocation == 6
                    && threeLocation == 3) {
                gameState = 26;
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 6 && oneLocation == 4 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 27;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 6 && oneLocation == 1 && twoLocation == 6
                    && threeLocation == 5) {
                gameState = 28; //
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 6 && oneLocation == 1 && twoLocation == 6
                    && threeLocation == 5) {
                gameState = 29;
            } else if (aLocation == 5 && bLocation == 4 && cLocation == 6 && oneLocation == 4 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 30;
            } else if (aLocation == 7 && bLocation == 1 && cLocation == 6 && oneLocation == 4 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 31;
            } else if (aLocation == 7 && bLocation == 1 && cLocation == 6 && oneLocation == 4 && twoLocation == 6
                    && threeLocation == 3) {
                gameState = 32;//
            } else if (aLocation == 2 && bLocation == 8 && cLocation == 6 && oneLocation == 4 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 33; //
            } else if (aLocation == 3 && bLocation == 8 && cLocation == 6 && oneLocation == 4 && twoLocation == 5
                    && threeLocation == 3) {
                gameState = 34; //
            }
        } else if (round == 7) {
            if (aLocation == 4 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 7
                    && threeLocation == 3) {
                gameState = 0; //
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 4
                    && threeLocation == 5) {
                gameState = 1;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 4
                    && threeLocation == 6) {
                gameState = 2;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 6 && oneLocation == 5 && twoLocation == 7
                    && threeLocation == 3) {
                gameState = 3;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 6 && oneLocation == 8 && twoLocation == 4
                    && threeLocation == 3) {
                gameState = 4;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 5 && oneLocation == 1 && twoLocation == 7
                    && threeLocation == 5) {
                gameState = 5;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 6 && oneLocation == 1 && twoLocation == 7
                    && threeLocation == 5) {
                gameState = 6;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 6 && oneLocation == 1 && twoLocation == 4
                    && threeLocation == 8) {
                gameState = 7;
            } else if (aLocation == 4 && bLocation == 6 && cLocation == 5 && oneLocation == 5 && twoLocation == 5
                    && threeLocation == 6) {
                gameState = 8;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 5
                    && threeLocation == 6) {
                gameState = 9;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 9) {
                gameState = 10;
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 6 && oneLocation == 7 && twoLocation == 2
                    && threeLocation == 5) {
                gameState = 11;
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 6 && oneLocation == 4 && twoLocation == 6
                    && threeLocation == 5) {
                gameState = 12;
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 6 && oneLocation == 5 && twoLocation == 6
                    && threeLocation == 5) {
                gameState = 13;
            } else if (aLocation == 5 && bLocation == 5 && cLocation == 6 && oneLocation == 5 && twoLocation == 3
                    && threeLocation == 8) {
                gameState = 14;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 2
                    && threeLocation == 8) {
                gameState = 15;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 5 && oneLocation == 5 && twoLocation == 4
                    && threeLocation == 5) {
                gameState = 16;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 6 && oneLocation == 1 && twoLocation == 8
                    && threeLocation == 6) {
                gameState = 17;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 6 && oneLocation == 1 && twoLocation == 5
                    && threeLocation == 9) {
                gameState = 18;
            } else if (aLocation == 5 && bLocation == 4 && cLocation == 6 && oneLocation == 4 && twoLocation == 5
                    && threeLocation == 5) {
                gameState = 19;
            } else if (aLocation == 4 && bLocation == 5 && cLocation == 6 && oneLocation == 5 && twoLocation == 9
                    && threeLocation == 3) {
                gameState = 20; //
            }
        } else if (round == 8) {
            if (true) {
                gameState = 0;
            } 
        }

        return gameState;
    }

    public boolean pawnActive(int round, int gameState, int pawn) {
        boolean stillActive;
        String[][][] storedPossibilities = {
                { // End of Round 1
                        { "true", "true", "true", "true", "true", "true" },
                        { "true", "true", "true", "true", "true", "true" },
                        { "true", "true", "true", "true", "true", "true" },
                },
                { // End of Round 2
                        { "false", "true", "true", "true", "true", "true" },
                        { "true", "true", "true", "true", "true", "true" },
                        { "true", "true", "true", "true", "true", "true" },
                        { "true", "true", "true", "true", "true", "true" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "true", "true", "true", "true", "true", "true" },
                        { "true", "true", "true", "true", "true", "true" },
                        { "true", "true", "true", "true", "true", "true" },
                        { "true", "true", "false", "true", "true", "true" },
                },
                { // End of Round 3
                        { "false", "true", "true", "true", "false", "true" },
                        { "false", "true", "true", "true", "true", "true" },
                        { "false", "true", "true", "true", "true", "true" },
                        { "true", "true", "true", "true", "false", "true" },
                        { "true", "true", "true", "true", "true", "true" },
                        { "true", "true", "true", "true", "false", "true" },
                        { "true", "true", "true", "true", "true", "true" },
                        { "true", "true", "true", "true", "true", "false" },
                        { "true", "true", "true", "true", "true", "false" },
                        { "true", "true", "true", "true", "true", "true" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "true", "false", "true", "false", "true", "true" },
                        { "true", "false", "true", "false", "true", "true" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "true", "false", "true", "true", "true", "false" },
                        { "true", "false", "true", "true", "true", "false" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "true", "true", "true", "false", "true", "true" },
                        { "true", "true", "true", "false", "true", "true" },
                        { "true", "true", "true", "true", "true", "true" },
                        { "true", "true", "true", "true", "false", "true" },
                        { "true", "true", "true", "true", "false", "true" },
                        { "true", "true", "false", "true", "true", "true" },
                        { "true", "true", "false", "true", "true", "true" },
                        { "true", "true", "false", "true", "false", "true" },

                },
                { // End of round 4
                        { "false", "true", "true", "true", "false", "true" },
                        { "false", "false", "true", "true", "true", "true" },
                        { "false", "true", "true", "true", "true", "true" },
                        { "false", "false", "true", "true", "true", "true" },
                        { "false", "true", "true", "true", "true", "true" },
                        { "false", "true", "true", "true", "true", "true" },
                        { "true", "false", "false", "true", "true", "true" },
                        { "true", "true", "false", "true", "false", "true" },
                        { "true", "true", "false", "true", "false", "true" },
                        { "true", "true", "true", "true", "false", "true" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "false", "true", "true", "true", "true", "false" },
                        { "false", "true", "true", "true", "true", "false" },
                        { "true", "true", "true", "true", "true", "false" },
                        { "true", "false", "true", "true", "true", "false" },
                        { "true", "true", "false", "true", "true", "true" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "true", "false", "false", "true", "true", "true" },
                        { "false", "false", "true", "true", "true", "true" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "false", "false", "true", "false", "true", "true" },
                        { "true", "false", "true", "false", "true", "true" },
                        { "true", "false", "false", "false", "true", "true" },
                        { "true", "false", "true", "false", "true", "true" },
                        { "false", "false", "true", "true", "true", "true" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "true", "false", "false", "true", "true", "true" },
                        { "false", "false", "true", "true", "true", "true" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "true", "false", "false", "true", "true", "true" },
                        { "true", "false", "true", "true", "true", "false" },
                        { "false", "false", "true", "true", "true", "false" },
                        { "true", "false", "true", "true", "true", "false" },
                        { "true", "false", "false", "true", "true", "false" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "true", "false", "false", "true", "true", "true" },
                        { "false", "false", "true", "true", "true", "true" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "true", "false", "true", "false", "true", "true" },
                        { "true", "true", "true", "false", "true", "true" },
                        { "true", "true", "true", "true", "false", "true" },
                        { "false", "true", "true", "true", "false", "true" },
                        { "false", "true", "true", "true", "false", "true" },
                        { "true", "true", "false", "true", "true", "true" },
                        { "true", "true", "false", "true", "true", "true" },
                        { "true", "true", "false", "true", "false", "true" },
                        { "true", "true", "false", "false", "true", "true" },
                        { "true", "true", "true", "true", "false", "true" }
                },
                {
                        { "false", "false", "true", "false", "true", "true" },
                        { "false", "false", "true", "true", "true", "true" },
                        { "false", "false", "true", "true", "true", "false" },
                        { "false", "false", "true", "true", "true", "true" },
                        { "false", "true", "true", "false", "true", "true" },
                        { "false", "true", "true", "true", "true", "true" },
                        { "true", "true", "false", "true", "false", "true" },
                        { "true", "true", "true", "true", "false", "false" },
                        { "true", "true", "true", "true", "false", "true" },
                        { "true", "true", "true", "false", "false", "true" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "true", "false", "true", "true", "false", "true" },
                        { "true", "false", "true", "false", "true", "true" },
                        { "false", "true", "true", "true", "true", "false" },
                        { "true", "true", "true", "true", "true", "false" },
                        { "true", "true", "true", "true", "false", "false" },
                        { "true", "true", "false", "true", "true", "true" },
                        { "true", "true", "false", "true", "true", "false" },
                        { "true", "false", "true", "true", "true", "false" },
                        { "true", "false", "true", "true", "false", "true" },
                        { "true", "false", "true", "true", "true", "true" },
                        { "false", "false", "true", "false", "true", "false" },
                        { "false", "false", "true", "false", "true", "true" },
                        { "true", "false", "false", "false", "true", "true" },
                        { "true", "false", "true", "false", "true", "true" },
                        { "true", "false", "false", "true", "true", "true" },
                        { "true", "false", "false", "false", "true", "true" },
                        { "true", "false", "true", "true", "true", "false" },
                        { "true", "false", "false", "true", "true", "true" },
                        { "true", "false", "false", "true", "true", "false" },
                        { "true", "true", "true", "false", "false", "true" },
                        { "true", "true", "true", "false", "true", "true" },
                        { "true", "true", "false", "false", "true", "true" },
                        { "true", "true", "true", "true", "false", "true" },
                        { "true", "true", "true", "true", "false", "false" },
                },
                {
                        { "false", "false", "true", "false", "true", "true" },
                        { "false", "false", "false", "false", "true", "true" },
                        { "false", "false", "true", "false", "true", "true" },
                        { "false", "false", "true", "true", "true", "true" },
                        { "false", "false", "true", "true", "true", "true" },
                        { "false", "false", "true", "true", "true", "false" },
                        { "false", "false", "true", "true", "true", "true" },
                        { "false", "false", "true", "true", "true", "true" },
                        { "true", "true", "true", "true", "false", "false" },
                        { "true", "false", "true", "false", "true", "true" },
                        { "true", "false", "true", "true", "true", "false" },
                        { "true", "false", "true", "true", "true", "false" },
                        { "true", "false", "false", "true", "true", "false" },
                        { "false", "false", "false", "false", "true", "true" },
                        { "false", "false", "true", "false", "false", "true" },
                        { "true", "false", "false", "false", "true", "true" },
                        { "false", "false", "false", "false", "true", "true" },
                        { "true", "false", "false", "true", "true", "true" },
                        { "true", "false", "false", "true", "true", "true" },
                        { "false", "true", "true", "false", "false", "true" },
                        { "true", "false", "false", "true", "true", "true" },
                },
                {
                        { "true", "true", "true", "true", "true", "true" },
                }
        };

        round = round - 2;

        stillActive = Boolean.valueOf(storedPossibilities[round][gameState][pawn]);
        System.out.println(round + " " + pawn + " " + stillActive + " " + gameState);

        return stillActive;
    }
}