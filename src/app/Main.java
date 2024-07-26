package app;

import guiBuildingTools.*;
import java.util.HashMap;
import java.awt.Color;

public class Main implements colorThemes, generalTools{

    public static void main(String[] args) {

        HashMap<String, Color> color = colorThemes.getDefault();

        appWindow win = new appWindow("Super Vole Interpreter", color.get("BackG"));

        myTextArea codeSpace = new myTextArea(color.get("FC"));

        myPanel menuBar = new myPanel(0,0, generalTools.getRatio(1),
                generalTools.getRatio(0.025), color.get("MenuB"));

        myScroll codingSpace = new myScroll(codeSpace,generalTools.getRatio(0.008), generalTools.getRatio(0.044),
                generalTools.getRatio(0.5), generalTools.getRatio(0.45), color.get("BackG"), color.get("BorderC"));

        win.add(menuBar);
        win.add(codingSpace);

        win.setVisible(false);
        win.setVisible(true);
    }
    static myTextField[] getRegisters() {

        myTextField[] registers = new myTextField[16];
        myTextField[] registersNum = new myTextField[16];
        String[] registersName = {"0x1", "0x2", "0x3", "0x4", "0x5", "0x6",
                "0x7", "0x8", "0x9", "0xA", "0xB", "0xC", "0xD", "0xE", "0xF"};


        int inicialPx = generalTools.getRatio(0.58);
        int inicialPy = generalTools.getRatio(0.044);
        int width = generalTools.getRatio(0.1);
        int height = generalTools.getRatio(0.035);
        int temp = generalTools.getRatio(0.08);
        int temp2 = inicialPy;

        int width2 = (int) (width * 0.5);
        int inicialPx2 = inicialPx - width2;

        Color even = colorThemes.getDefault().get("Reg1");
        Color odd = colorThemes.getDefault().get("Reg2");
        Color color;

        for (int i = 0; i < 16; i++) {

            if (i % 8 == 0 && i != 0){
                inicialPx = inicialPx + width + temp;
                inicialPy = temp2;
            }
            if(i%2==0){
                color = even;
            }
            else{
                color = odd;
            }
            registersNum[i] = new myTextField(inicialPx2, inicialPy, width2, height, color);
            registers[i] = new myTextField(inicialPx, inicialPy, width, height, color, Color.BLACK);
            inicialPy = inicialPy + height;


        }
        return registers;
    }

}