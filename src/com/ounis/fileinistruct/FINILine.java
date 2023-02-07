/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ounis.fileinistruct;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author AndroidDev
 */
public abstract class FINILine {

    
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
    
//    abstract public void test();
    
    /**
     * <font size="5" color="#ff0000">konstruktor linii </font>
     * @param aLineNum
     * @param aSection
     * @param aLine 
     */
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
  
    
    public static char[] fillArrC(char[] anArr, String s) {
        for(int i=0;i<s.length();i++) {
            anArr[i] = s.charAt(i);
        }
        return anArr;
    }
    
    /**
     * testowanie
     * @param args 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        String word = "ROMANI ITE DOMUM";
//        char[] chars = new char[word.length()];
//        char[] chars1 = fillArrC(chars, word);
//        
//        System.out.print(Arrays.toString(chars).concat("\n"));
//        System.out.print(Arrays.toString(chars1).concat("\n"));
//        
        
//        ArrayList<FINILine> arrFINI = new ArrayList<FINILine>();
//        
//        FINILine iniRem = new FINILineRem(1, "main","komentarz");
//        arrFINI.add(iniRem);
////        System.out.printf("%d %s\n",iniRem.getLineNum(),iniRem);
//        
//        FINILine iniEmpty = new FINILineEmpty(3, "main");
//        arrFINI.add(iniEmpty);
////        System.out.printf("%d %s\n", iniEmpty.getLineNum(),iniEmpty);
//        
//        FINILine iniSection = new FINILineSection(4, "main");
//        arrFINI.add(iniSection);
////        System.out.printf("%d %s\n", iniSection.getLineNum(),iniSection);
//        
//        FINILineKeyValue iniKeyValue = new FINILineKeyValue(5, "main", "max=45");
//        arrFINI.add(iniKeyValue);
////        System.out.printf("%d %s <- %s\n", iniKeyValue.getLineNum(), 
////                (iniKeyValue).getSection(),
////                iniKeyValue);
//        
//        for(FINILine fini: arrFINI) {
//                System.out.println(String.valueOf(fini.getLineNum()).concat(" ".concat(fini.toString())));
//                if (fini instanceof FINILineKeyValue)
//                    System.out.println(fini.toString().concat(" -> ".concat(fini.getSection())));
//        }

    }
    
    
    
} // end of FINILine

