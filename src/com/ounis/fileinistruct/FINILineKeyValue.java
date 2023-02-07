/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ounis.fileinistruct;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AndroidDev
 */
public class FINILineKeyValue extends FINILine {
    
    /**
     * historia zmian wartości klucza
     */
    protected List<String> valueChangeHist;
    public ArrayList<String> getValueChangedHist() {  // readonly
        ArrayList<String> result = new ArrayList<>();
        if (valueChangeHist.size() > 0) {
//            result = new ArrayList<>();
            // kopiowanie
            for(String s: valueChangeHist) 
                result.add(s);
        }
        return result;
    }
    
    protected String key;
    public String getKey() {
        return this.key;
    }
    protected String value;
    public String getValue() {
        return value;
    }

    public void setValue (String aNewValue) {
        this.value = aNewValue;
//        dodanie zmienionej wartości do listy histori zmian wartości w dla klucza  
        if (valueChangeHist == null)
            valueChangeHist = new ArrayList<>();
        valueChangeHist.add(aNewValue);
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
    
    /**
     * <font size="5" color="#ff0000">konstruktor linii klucz=wartość</font>
     * @param alineNum
     * @param aSection
     * @param aLine 
     */
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
        valueChangeHist = new ArrayList<>();
    }
    
    public FINILineKeyValue(int alineNum, String aSection, String aKey, String aValue) {
        this(alineNum, aSection, aKey.concat(CONST.SEP_KEY_VAL).concat(aValue));
//        super(alineNum,aSection,aKey.concat("=").concat(aValue));
    }
    
    
    
    public String toString() {
        return this.linePref.concat(key).concat(CONST.SEP_KEY_VAL).concat(this.value);
    }
}   // end of FINILineKeyValue