import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Title extends JPanel {
    // Title Panel Settings
    final Dimension titleSize;
    final String titleTXT = "HEXAPAWN";
    JLabel main;
    
    Title() {
        // Adding Values
        titleSize = new Dimension(1200, 100);
        main = new JLabel(titleTXT);

        // Applying Settings
        this.setBackground(new Color(102, 153, 204));
        this.setPreferredSize(titleSize);

        // Main Text
        main.setFont(new Font("Serif", Font.BOLD, 72));

        //Adding to Panel
        this.add(main);
    }
}
