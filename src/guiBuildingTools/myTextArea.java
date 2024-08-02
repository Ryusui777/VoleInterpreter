package guiBuildingTools;
import main.UI.Interfaces.generalTools;

import java.awt.*;

public class myTextArea extends javax.swing.JTextArea implements generalTools {
    int textAreaWidth;
    int textAreaHeight;
    int textAreaPx;
    int textAreaPy;
    int defaultTextSize = (int)(this.monitorSize[0] * 0.015);
    Font defaultFont = new Font( "SansSerif", Font.BOLD, defaultTextSize);

    public myTextArea(Color textColor) {
        this.setFont(defaultFont);
        this.setForeground(textColor);
        this.setCaretColor(textColor);

    }
    public myTextArea(int Px, int Py, int Width, int Height, Color textColor, Color borderColor, Color BG){

        this.textAreaWidth = Width;
        this.textAreaHeight = Height;
        this.textAreaPx = Px;
        this.textAreaPy = Py;
        this.setBounds(this.textAreaPx, this.textAreaPy, this.textAreaWidth, this.textAreaHeight);

        this.setBackground(BG);
        this.setFont(defaultFont);
        this.setCaretColor(textColor);
        this.setForeground(textColor);
        this.setBorder(javax.swing.BorderFactory.createLineBorder(borderColor, (int)(this.monitorSize[0] * 0.004)));
    }

}
