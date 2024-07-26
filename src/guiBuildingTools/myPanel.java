package guiBuildingTools;
import javax.swing.JPanel;
import java.awt.*;

public class myPanel extends JPanel implements generalTools {
    int panelWidth;
    int panelHeight;
    int panelPx;
    int panelPy;

    public myPanel() {
        this.setLayout(null);
    }

    public myPanel(int Py, int Px, int Width, int Height, Color panelColor) {

        this.panelWidth = Width;
        this.panelHeight = Height;
        this.panelPx = Px;
        this.panelPy = Py;

        this.setBounds(this.panelPx, 0, this.panelWidth, this.panelHeight);
        this.setBackground(panelColor);
        this.setVisible(true);
        this.setLayout(null);
    }
}
