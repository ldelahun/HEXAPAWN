import javax.swing.JFrame;

public class Main {
    // Planning Components of the Window
    static JFrame window;

    public static void main(String[] args) {
        //Setting Parameters of the window
        window = new JFrame("test");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300,300);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        
        
        //Showing window
        window.setVisible(true);
    }
}