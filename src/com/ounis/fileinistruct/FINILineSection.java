/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ounis.fileinistruct;

public class FINILineSection extends FINILine {
    
    protected String sectionName;
    public String getSectionName() {
        return this.sectionName;
    }
    
    public FINILineSection(int aLineNum, String aSectName) {
        super(aLineNum, null,CONST.PREF_SECT.concat(aSectName).concat(CONST.SUFF_SECT));
        this.sectionName = aSectName;
        this.linePref = CONST.PREF_SECT;
    }
    
    @Override
    public String toString() {
//        return CONST.PREF_SECT.concat(this.sectionName).concat(CONST.SUFF_SECT);
        return this.sectionName;
    }
    
}
