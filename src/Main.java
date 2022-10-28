/* 
 * POG MAN
 * I AM NOT RESPONSIBLE IF I DESTROY YOUR COMPUTER                             
*/
package src;

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

/**
 * This will create the JFrame and will house the side function buttons for the
 * the.
 * 
 * @version EAT MY ASS Oct 2022
 * @author POG MAN
 */
public class Main {

    /*
     * The main method makes the JFrame then adds other components
     */
    public static void main(String[] args) {
        final Dimension windowSize = new Dimension(1200, 1000);
        final ImageIcon windowIcon = new ImageIcon("Imgs/WindowStuff/windowIcon.png");

        JFrame window = new JFrame("HEXAPAWN");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(windowSize);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setIconImage(windowIcon.getImage());
        window.setUndecorated(true);

        addTitle(window);
        optionBar(window);
        addBars(window);
        addBoard(window);

        window.setVisible(true);

    }

    /*
     * Adds the game board to the Frame
     */
    private static void addBoard(JFrame f) {
        JPanel board = new Game();

        f.add(board, BorderLayout.CENTER);
    }

    /*
     * Adds the side bars to the frame to make it look good
     */
    private static void addBars(JFrame f) {
        final Dimension barSize = new Dimension(150, 1000);
        final Color barColor = new ColorUIResource(102, 153, 204);

        JPanel barL = new JPanel();
        JPanel barR = new JPanel();

        barL.setBackground(barColor);
        barR.setBackground(barColor);
        barL.setPreferredSize(barSize);
        barR.setPreferredSize(barSize);

        f.add(barL, BorderLayout.LINE_START);
        f.add(barR, BorderLayout.LINE_END);
    }

    /*
     * Adds all the buttons to the options bar [rules, bot info, wins, reset]
     */
    private static void optionBar(JFrame f) {
        final Dimension optionListSize = new Dimension(1200, 50);
        final Dimension buttonSizes = new Dimension(100, 50);

        JPanel options = new JPanel();

        JButton rules = new JButton("RULES");
        rules.setPreferredSize(buttonSizes);
        rules.addActionListener((e) -> displayRules());
        options.add(rules);

        JButton botInfo = new JButton("BOT INFO");
        botInfo.setPreferredSize(buttonSizes);
        botInfo.addActionListener((e) -> displayBot());
        options.add(botInfo);

        JButton winLoss = new JButton("WINS");
        winLoss.setPreferredSize(buttonSizes);
        winLoss.addActionListener((e) -> displayWins());
        options.add(winLoss);

        // JButton reset = new JButton("RESET");
        // reset.setPreferredSize(buttonSizes);
        // reset.addActionListener((e) -> reset());
        // options.add(reset);

        options.setBackground(new Color(102, 153, 204));
        options.setPreferredSize(optionListSize);

        f.add(options, BorderLayout.PAGE_END);
    }

    /*
     * Adds the title to the frame
     */
    private static void addTitle(JFrame f) {
        final Dimension titleSize = new Dimension(1200, 50);

        JPanel title = new JPanel();
        JLabel titleTXT = new JLabel("HEXAPAWN");

        titleTXT.setFont(new Font("Serif", Font.BOLD, 36));

        title.setBackground(new Color(102, 153, 204));
        title.setPreferredSize(titleSize);
        title.add(titleTXT);

        f.add(title, BorderLayout.PAGE_START);
    }

    /*
     * This holds all the four different button functions
     */
    private static void displayRules() {
        String ruleText = "IN THE FUTURE";

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
}