package app;
import guiBuildingTools.generalTools;
import javax.swing.*;
import javax.swing.border.Border;

public class AppCodeSpace extends javax.swing.JScrollPane implements colorThemes {

    JTextArea textArea;

    {
        textArea = new JTextArea();
        textArea.setFont(colorThemes.deafultCodeSpaceFont);
        textArea.setForeground(colorThemes.colorPalette.get("Default").get("FontColor"));
        textArea.setCaretColor(colorThemes.colorPalette.get("Default").get("FontColor"));
    }

    AppCodeSpace() {

        // Creates Border
        Border border = BorderFactory.createLineBorder(colorPalette.get("Default").get("BorderColor"), generalTools.getRatio(0.0015));

        // Sets textArea as view port
        setViewportView(textArea);

        // Sets position and size
        setBounds(generalTools.getRatio(0.02), generalTools.getRatio(0.04),
                generalTools.getRatio(0.96), generalTools.getRatio(0.45));

        // Sets a custom scrollbar 'cause the default sucks
        setHorizontalScrollBar(getScrollBar(JScrollBar.HORIZONTAL));
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setVerticalScrollBar(getScrollBar(JScrollBar.VERTICAL));
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Sets background color
        getViewport().getView().setBackground(colorThemes.colorPalette.get("Default").get("codeSpace"));

        // Sets border
        setBorder(border);

    }

    static AppScrollBar getScrollBar(int orientation){
        return new AppScrollBar(colorThemes.colorPalette.get("Default").get("Thumb"),
                colorThemes.colorPalette.get("Default").get("codeSpace"),colorThemes.colorPalette.get("Barca").get("FocusedThumb"), orientation);
    }

    public void changeTheme(String themeName){
        textArea.setForeground(colorThemes.colorPalette.get(themeName).get("FontColor"));
        getViewport().getView().setBackground(colorThemes.colorPalette.get(themeName).get("codeSpace"));
    }
}
