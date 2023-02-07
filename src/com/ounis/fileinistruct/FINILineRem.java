/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ounis.fileinistruct;

public class FINILineRem extends FINILine {

    /**
     * 
     * <font size="5" color="#ff0000">konstruktor linii komentarza</font>
     * 
     * @param aLineNum
     * @param aSection
     * @param aLine 
     */
    public FINILineRem(int aLineNum,String aSection, String aLine) {
        super(aLineNum, aSection, aLine);
        this.linePref = CONST.PREF_REM;
    }
    
    @Override
    public String toString() {
        return this.line; //linePref.concat(line);
    }
}   // end of FINILineRem