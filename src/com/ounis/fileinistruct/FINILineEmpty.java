/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ounis.fileinistruct;

/**
 *
 * @author AndroidDev
 */
public class FINILineEmpty extends FINILine {
    
    public FINILineEmpty(int aLineNum, String aSection) {
        super(aLineNum, aSection, "");
        this.linePref = CONST.PREF_EMPTY;
    }
    
    public String toString() {
        return this.linePref.concat(this.line);
    }
}   //  end of FINILineEmpty