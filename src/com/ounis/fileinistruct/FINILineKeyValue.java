/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ounis.fileinistruct;

/**
 *
 * @author AndroidDev
 */
public class FINILineKeyValue extends FINILine {
    
    protected String key;
    public String getKey() {
        return this.key;
    }
    protected String value;
    public String getValue() {
        return value;
    }
//    
//    protected FINILine section;
//    public FINILine getSection() {
//        return this.section;
//    }
    
    protected String section;
    public String getSection() {
        return this.section.toString();
    }
    
    public FINILineKeyValue(int alineNum, String  aSection,String aLine) {
        super(alineNum, aSection, aLine);
        this.linePref = CONST.PREF_EMPTY;
        this.section = aSection;
        this.section = aSection.toString();
        
        String[] pairKV = aLine.split(CONST.SEP_KEY_VAL);
        this.key = pairKV[0];
/*        tutaj sprawdzanie i reagowanie na przypadek, który wystąpił w pliku
*           fo2tweaks.ini:
        
         [unlimited_party]
         npc_pids=
        brak wartości klucza, zapełniamy domyślną pustą wartością: KEY_EMPTY_VALUE
*/

        this.value = pairKV.length > 1 ? pairKV[1] : CONST.KEY_EMPTY_VALUE;
    }
    
    public FINILineKeyValue(int alineNum, String aSection, String aKey, String aValue) {
        this(alineNum, aSection, aKey.concat(CONST.SEP_KEY_VAL).concat(aValue));
//        super(alineNum,aSection,aKey.concat("=").concat(aValue));
    }
    
    
    
    public String toString() {
        return this.linePref.concat(key).concat(CONST.SEP_KEY_VAL).concat(this.value);
    }
}   // end of FINILineKeyValue