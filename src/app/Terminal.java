package app;

import guiBuildingTools.generalTools;
import javax.swing.*;

public class Terminal extends javax.swing.JFrame {

    JTextArea textArea;
    {
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setForeground(colorThemes.colorPalette.get("Default").get("FontColor"));
        textArea.setFont(colorThemes.deafultCodeSpaceFont);
    }

    JScrollPane scrollPane;
    {
        scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBar(AppCodeSpace.getScrollBar(JScrollBar.HORIZONTAL));
        scrollPane.setVerticalScrollBar(AppCodeSpace.getScrollBar(JScrollBar.VERTICAL));
        scrollPane.getViewport().getView().setBackground(colorThemes.colorPalette.get("Default").get("codeSpace"));
    }


    public Terminal() {

        setLocation(getX(), generalTools.getRatio(0.33));
        setSize(generalTools.getRatio(1), generalTools.getRatio(0.2));
        getContentPane().setBackground(colorThemes.colorPalette.get("Default").get("codeSpace"));
        setAlwaysOnTop(true);

        add(scrollPane);

        setVisible(true);

    }

    public void printInTerminal(String text){
        textArea.setText(text);
    }
}
