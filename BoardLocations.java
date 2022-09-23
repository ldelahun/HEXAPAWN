
public class BoardLocations {
    int x, y;

    // Location data base
    public void boardValues(String n) {// Input Code Name
        switch (n) {
            case "one":
                x = 0;
                y = 0;
                break;
            case "two":
                x = 300;
                y = 0;
                break;
            case "three":
                x = 600;
                y = 0;
                break;
            case "four":
                x = 0;
                y = 300;
                break;
            case "five":
                x = 300;
                y = 300;
                break;
            case "six":
                x = 600;
                y = 300;
                break;
            case "seven":
                x = 0;
                y = 600;
                break;
            case "eight":
                x = 300;
                y = 600;
                break;
            case "nine":
                x = 600;
                y = 600;
                break;
        }
    }

    public String checkCords(int x, int y) {
        String n = "";

        // Giant if else chain because god is dead.
        if (y > 300 && y <= 600) {
            if(x >= 0 && x < 300){
                n = "four";
            }else if(x >= 300 && x < 600){
                n = "five";
            }else {
                n = "six";
            }
        }else if (y > 600 && y <= 900) {
            if(x >= 0 && x < 300){
                n = "seven";
            }else if(x >= 300 && x < 600){
                n = "eight";
            }else {
                n = "nine";
            }
        }else {
            if(x >= 0 && x < 300){
                n = "one";
            }else if(x >= 300 && x < 600){
                n = "two";
            }else {
                n = "three";
            }
        }
        
        // Returning the code name
        return n;
    }

    // Check if it is placeable
    public String[] moveOptions(int r, int t) {
        String[] moves = {};
        
        if(t == 0){
            switch (r) {
                case 1:
                    System.out.println("WORK");
                    moves[0] = "four";
                    break;
            }
        }

        System.out.println("ASS"
        );
        return moves;
    }
}
