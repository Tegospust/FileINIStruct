/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ounis.fileinistruct;

import java.util.ArrayList;

/**
 *
 * @author AndroidDev
 */
public class FINILine {

    protected int lineNum;
    public int getLineNum() {
        return this.lineNum;
    }
    
    protected String linePref;
    public String getLinePref() {
        return this.linePref;
    }
    
    protected String line;
    public String getLine() {
        return this.line;
    }
    
    FINILine(int aLineNum, String aLine) {
        this.lineNum = aLineNum;
        this.line = aLine;
        this.linePref = CONST.PREF_EMPTY;
    }
    
    @Override
    public String toString() {
        return this.linePref.concat(this.line);
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<FINILine> arrFINI = new ArrayList<FINILine>();
        
        FINILine iniRem = new FINILineRem(1, "komentarz");
        arrFINI.add(iniRem);
//        System.out.printf("%d %s\n",iniRem.getLineNum(),iniRem);
        
        FINILine iniEmpty = new FINILineEmpty(3);
        arrFINI.add(iniEmpty);
//        System.out.printf("%d %s\n", iniEmpty.getLineNum(),iniEmpty);
        
        FINILine iniSection = new FINILineSection(4, "main");
        arrFINI.add(iniSection);
//        System.out.printf("%d %s\n", iniSection.getLineNum(),iniSection);
        
        FINILineKeyValue iniKeyValue = new FINILineKeyValue(5, "max=45", iniSection);
        arrFINI.add(iniKeyValue);
//        System.out.printf("%d %s <- %s\n", iniKeyValue.getLineNum(), 
//                (iniKeyValue).getSection(),
//                iniKeyValue);
        
        for(FINILine fini: arrFINI) {
                System.out.println(String.valueOf(fini.getLineNum()).concat(" ".concat(fini.toString())));
        }

    }
    
    
    
} // end of FINILine
    
class FINILineRem extends FINILine {
    
    public FINILineRem(int aLineNum, String aLine) {
        super(aLineNum, aLine);
        this.linePref = CONST.PREF_REM;
    }
    
    @Override
    public String toString() {
        return this.linePref.concat(line);
    }
}   // end of FINILineRem
    
class FINILineEmpty extends FINILine {
    
    FINILineEmpty(int aLineNum) {
        super(aLineNum, "");
        this.linePref = CONST.PREF_EMPTY;
    }
    
    public String toString() {
        return this.linePref.concat(this.line);
    }
}   //  end of FINILineEmpty

class FINILineSection extends FINILine {
    
    protected String sectionName;
    public String getSectionName() {
        return this.sectionName;
    }
    
    FINILineSection(int aLineNum, String aSectName) {
        super(aLineNum, CONST.PREF_SECT.concat(aSectName).concat(CONST.SUFF_SECT));
        this.sectionName = aSectName;
        this.linePref = CONST.PREF_SECT;
    }
    
    @Override
    public String toString() {
        return CONST.PREF_SECT.concat(this.sectionName).concat(CONST.SUFF_SECT);
    }
    
}

class FINILineKeyValue extends FINILine {
    
    protected String key;
    public String getKey() {
        return this.key;
    }
    protected String value;
    public String getValue() {
        return value;
    }
    
    protected FINILine section;
    public FINILine getSection() {
        return this.section;
    }
    
    protected String s_section;
    public String getS_section() {
        return this.section.toString();
    }
    
    FINILineKeyValue(int alineNum, String aLine, FINILine  aSection) {
        super(alineNum, aLine);
        this.linePref = CONST.PREF_EMPTY;
        this.section = aSection;
        this.s_section = aSection.toString();
        
        String[] pairKV = aLine.split(CONST.SEP_KEY_VAL);
        this.key = pairKV[0];
        this.value = pairKV[1];
    }
    
    
    
    public String toString() {
        return this.linePref.concat(key).concat(CONST.SEP_KEY_VAL).concat(this.value);
    }
}   // end of FINILineKeyValue


