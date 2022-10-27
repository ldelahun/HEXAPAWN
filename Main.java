/****************************
 * This class will run the
 * window and options
****************************/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

public class Main {
    // Jpanels and JFrames
    static JFrame window;
    static JPanel title, options, board;

    // Window Settings
    static final String frameTitle = "HEXAPAWN";
    static final Dimension windowSize = new Dimension(1200, 1000);
    static final ImageIcon windowIcon = new ImageIcon("Imgs/WindowStuff/windowIcon.png");

    public static void main(String[] args) {
        createWindow();// Creating the window
    }

    private static void createWindow() {
        window = new JFrame(frameTitle);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(windowSize);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setIconImage(windowIcon.getImage());
        window.setUndecorated(true);

        // Adding Panels
        addTitle();
        optionList();
        addBars();
        addBoard();

        window.setVisible(true);
    }

    // Panel Adding
    private static void addBoard() {
        board = new Game();
        window.add(board, BorderLayout.CENTER);
    }

    private static void addBars() {
        final Dimension barSize = new Dimension(150, 1000);
        final Color barColor = new ColorUIResource(102, 153, 204);
        JPanel barL = new JPanel();
        JPanel barR = new JPanel();

        // Applying Settings
        barL.setBackground(barColor);
        barR.setBackground(barColor);
        barL.setPreferredSize(barSize);
        barR.setPreferredSize(barSize);

        // Adding bars
        window.add(barL, BorderLayout.LINE_START);
        window.add(barR, BorderLayout.LINE_END);
    }

    private static void optionList() {
        // Declaring Variables for Panel
        options = new JPanel();
        final Dimension optionListSize = new Dimension(1200, 50);

        // Declaring Variables for Buttons
        final Dimension buttonSizes = new Dimension(100, 50);
        JButton winLoss, rules, botInfo, reset;

        // Setting up rules
        rules = new JButton("RULES");
        rules.setPreferredSize(buttonSizes);
        rules.addActionListener((e) -> displayRules());
        options.add(rules);
        // Setting up botInfo
        botInfo = new JButton("BOT INFO");
        botInfo.setPreferredSize(buttonSizes);
        botInfo.addActionListener((e) -> displayBot());
        options.add(botInfo);
        // Setting up winLoss
        winLoss = new JButton("WINS");
        winLoss.setPreferredSize(buttonSizes);
        winLoss.addActionListener((e) -> displayWins());
        options.add(winLoss);
        // Setting up reset
        reset = new JButton("RESET");
        reset.setPreferredSize(buttonSizes);
        reset.addActionListener((e) -> reset());
        options.add(reset);

        // Setting up Panel
        options.setBackground(new Color(102, 153, 204));
        options.setPreferredSize(optionListSize);

        // Adding it to window
        window.add(options, BorderLayout.PAGE_END);
    }

    private static void addTitle() {
        // Declaring Variables
        title = new JPanel();
        final Dimension titleSize = new Dimension(1200, 50);
        JLabel titleTXT = new JLabel("HEXAPAWN");

        // Setting up panel
        title.setBackground(new Color(102, 153, 204));
        title.setPreferredSize(titleSize);

        // Main Text
        titleTXT.setFont(new Font("Serif", Font.BOLD, 36));

        // Adding to Panel
        title.add(titleTXT);

        // Adding it to window
        window.add(title, BorderLayout.PAGE_START);
    }

    // Button Functions
    private static void displayRules() {
        String ruleText = "Rules. As in chess, each pawn may be moved in two different ways:\nit may be moved one square forward, or it may capture a pawn one square diagonally ahead of it.\nA pawn may not be moved forward if there is a pawn in the next square. Unlike chess, the first move of a pawn may not advance it by two spaces.";
        JOptionPane.showMessageDialog(null, ruleText, "RULES", JOptionPane.PLAIN_MESSAGE);
    }

    private static void displayBot() {
        String text = "IN Future";
        JOptionPane.showMessageDialog(null, text, "Bot Information", JOptionPane.PLAIN_MESSAGE);
    }

    private static void displayWins() {
        String text = Integer.toString(Game.round);
        JOptionPane.showMessageDialog(null, text, "Player Wins", JOptionPane.PLAIN_MESSAGE);
    }

    private static void reset() {
        ((Game) board).reset();
    }
}