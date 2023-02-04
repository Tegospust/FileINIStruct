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

    
    protected String section;
    public String getSection() {
        return this.section;
    }
    
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
    
    FINILine(int aLineNum,String  aSection, String aLine) {
        this.lineNum = aLineNum;
        this.section = aSection;
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
        
        FINILine iniRem = new FINILineRem(1, "main","komentarz");
        arrFINI.add(iniRem);
//        System.out.printf("%d %s\n",iniRem.getLineNum(),iniRem);
        
        FINILine iniEmpty = new FINILineEmpty(3, "main");
        arrFINI.add(iniEmpty);
//        System.out.printf("%d %s\n", iniEmpty.getLineNum(),iniEmpty);
        
        FINILine iniSection = new FINILineSection(4, "main");
        arrFINI.add(iniSection);
//        System.out.printf("%d %s\n", iniSection.getLineNum(),iniSection);
        
        FINILineKeyValue iniKeyValue = new FINILineKeyValue(5, "main", "max=45");
        arrFINI.add(iniKeyValue);
//        System.out.printf("%d %s <- %s\n", iniKeyValue.getLineNum(), 
//                (iniKeyValue).getSection(),
//                iniKeyValue);
        
        for(FINILine fini: arrFINI) {
                System.out.println(String.valueOf(fini.getLineNum()).concat(" ".concat(fini.toString())));
                if (fini instanceof FINILineKeyValue)
                    System.out.println(fini.toString().concat(" -> ".concat(fini.getSection())));
        }

    }
    
    
    
} // end of FINILine

