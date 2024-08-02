package compiler;

import java.lang.reflect.Method;

public enum Types {

    RAWVOLE("RAW_VOLE"),
    KEYWORD("KEYWORD"),
    STRING("STRING"),
    INT("INT"),
    FLOATING_POINT("FLOATING_POINT");

    final String type;

    Types(String type) {
        this.type = type;
    }

    public String getType() {
       return this.type;
    }
}