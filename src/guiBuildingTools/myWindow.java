package guiBuildingTools;
import main.UI.Interfaces.generalTools;

import java.awt.*;

public class myWindow extends javax.swing.JFrame implements generalTools {

    Color windowBackground;
    public myWindow() {
        this.windowBackground = Color.BLACK;
        this.setSize(800, 600);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    public myWindow(String title, Color windowColor){
        this.windowBackground = windowColor;
        this.setTitle(title);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLayout(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.getContentPane().setBackground(windowBackground);
    }


}
