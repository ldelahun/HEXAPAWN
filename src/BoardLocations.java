package src;

public class BoardLocations {
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

    public String checkCords(int x, int y) {
        String n = "";

        // Giant if else chain because god is dead.
        if (y > 300 && y <= 600) {
            if (x >= 0 && x < 300) {
                n = "four";
            } else if (x >= 300 && x < 600) {
                n = "five";
            } else {
                n = "six";
            }
        } else if (y > 600 && y <= 900) {
            if (x >= 0 && x < 300) {
                n = "seven";
            } else if (x >= 300 && x < 600) {
                n = "eight";
            } else {
                n = "nine";
            }
        } else {
            if (x >= 0 && x < 300) {
                n = "one";
            } else if (x >= 300 && x < 600) {
                n = "two";
            } else {
                n = "three";
            }
        }

        // Returning the code name
        return n;
    }

    // Check if it is placeable
    public String[] moveOptions(int r, int t) {
        String opt1 = "ten";
        String opt2 = "ten";
        String opt3 = "ten";

        if (t == 0) {
            switch (r) {
                case 1:
                    opt1 = "four";
                    opt2 = "ten";
                    opt3 = "ten";
                    break;
            }
        } else if (t == 1) {
            switch (r) {
                case 1:
                    opt1 = "five";
                    opt2 = "ten";
                    opt3 = "ten";
                    break;
            }
        } else if (t == 2) {
            switch (r) {
                case 1:
                    opt1 = "six";
                    opt2 = "ten";
                    opt3 = "ten";
                    break;
            }
        }

        return new String[] { opt1, opt2, opt3 };
    }
}