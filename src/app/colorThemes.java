package app;

import java.awt.Color;
import java.util.HashMap;
public interface colorThemes {
      String[] hexValues = {"1", "2", "3", "4", "5", "6", "7", "8",
              "9", "A", "B", "C", "D", "E", "F"};

      static HashMap<String, Color> getBarca(){
          HashMap<String, Color> barca = new HashMap<>();
          barca.put("BackG", new Color(0x12086F));
          barca.put("FontC", new Color(0xFFFFFF));
          barca.put("BorderC", new Color(0xEDBB00));
          barca.put("Reg1", new Color(0xEDBB00));
          barca.put("Reg2", new Color(0xA50044));
          barca.put("MenuB", new Color(0xDB0030));
          barca.put("Alternative", new Color(0x0000000));
          return barca;
      }
      static HashMap<String, Color> getDefault(){
          return getBarca();
      }

}
