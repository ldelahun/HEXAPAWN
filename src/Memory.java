package src;

class Memory {
    static int[][][] history = {
            {
                    { 0, 0, 0 },
                    { 0, 0, 0 }
            },
            {
                    { 0, 0, 0 },
                    { 0, 0, 0 }
            },
            {
                    { 0, 0, 0 },
                    { 0, 0, 0 }
            },
    }; // round, moves

    public static void storeMove(int[] pawnLocations, int round) {
        round--;

        try {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < pawnLocations.length; j++) {
                    history[round][j][i] = pawnLocations[i];
                }
            }
        } catch (Exception e) {
            System.out.println("FUCK IT FAILED - " + e);
        }
    }
}