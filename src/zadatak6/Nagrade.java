package zadatak6;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.SwingUtilities;

public class Nagrade {
    private static Prozor window;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }

    static void createGUI() {
        window = new Prozor("Nagrade");
        Toolkit theKit = window.getToolkit();
        Dimension wndSize = theKit.getScreenSize();
        window.setBounds(wndSize.width / 4, wndSize.height / 4,
                         wndSize.width / 2, wndSize.height / 2);
        window.pack();
        window.setVisible(true);
    }
}
