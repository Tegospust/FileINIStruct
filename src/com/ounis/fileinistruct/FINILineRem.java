/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ounis.fileinistruct;

public class FINILineRem extends FINILine {
    
    public FINILineRem(int aLineNum,String aSection, String aLine) {
        super(aLineNum, aSection, aLine);
        this.linePref = CONST.PREF_REM;
    }
    
    @Override
    public String toString() {
        return this.linePref.concat(line);
    }
}   // end of FINILineRem