/*****************************************************************************************
                        Zanobia - fingerprinting data analysis software
Copyright (C) 2020 Usama S Erawab <usamaerawab@gmail.com> Libya
This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA
************************************************************************************************/
package zanobia2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alrawab
 */
public class D21S11 {
    public static String RepeatUnit="[TCTA][TCTG]";
    public static String RepeatType="Compound";
    public static int Allele_Count=6;//------------------------


public static Map Get_ALLEL_SEQ(){
 Map D21S11_STR_ALLEL_SEQ =new HashMap();
 
 D21S11_STR_ALLEL_SEQ.put(33, "TCTATCTATCTATCTATCTATCTGTCTGTCTGTCTGTCTGTCTGTCTATCTATCTATA"
         + "TCTATCTATCTATCATCTATCTA"
         + "TCCATA"
         + "TCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 
 D21S11_STR_ALLEL_SEQ.put(32, "TCTATCTATCTATCTATCTATCTATCTGTCTGTCTGTCTGTCTGTCTATCTATCTATA"
         + "TCTATCTATCTATCATCTATCTA"
         + "TCCATA"
         + "TCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 
 D21S11_STR_ALLEL_SEQ.put(31, "TCTATCTATCTATCTATCTATCTGTCTGTCTGTCTGTCTGTCTGTCTATCTATCTATA"
         + "TCTATCTATCTATCATCTATCTA"
         + "TCCATA"
         + "TCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 
    
 D21S11_STR_ALLEL_SEQ.put(30, "TCTATCTATCTATCTATCTATCTATCTGTCTGTCTGTCTGTCTGTCTATCTATCTATA"
         + "TCTATCTATCTATCATCTATCTA"
         + "TCCATA"
         + "TCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 
  
  D21S11_STR_ALLEL_SEQ.put(29, "TCTATCTATCTATCTATCTGTCTGTCTGTCTGTCTGTCTGTCTATCTATCTATA"
         + "TCTATCTATCTATCATCTATCTA"
         + "TCCATA"
         + "TCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
  
  D21S11_STR_ALLEL_SEQ.put(28, "TCTATCTATCTATCTATCTGTCTGTCTGTCTGTCTGTCTGTCTATCTATCTATA"
         + "TCTATCTATCTATCATCTATCTA"
         + "TCCATA"
         + "TCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
  
  
    return D21S11_STR_ALLEL_SEQ;
} 
   
  public static Map Get_ALLEL_SEQ_ABV(){
 Map D21S11_STR_ALLEL_SEQ =new HashMap();
 
D21S11_STR_ALLEL_SEQ.put(32, "[TCTA]6[TCTG]5[TCTA]3TA[TCTA]3TCA[TCTA]2TCCATA[TCTA]14");
D21S11_STR_ALLEL_SEQ.put(32, "[TCTA]6[TCTG]5[TCTA]3TA[TCTA]3TCA[TCTA]2TCCATA[TCTA]13");
D21S11_STR_ALLEL_SEQ.put(31, "[TCTA]5[TCTG]6[TCTA]3TA[TCTA]3TCA[TCTA]2TCCATA[TCTA]12");
D21S11_STR_ALLEL_SEQ.put(30, "[TCTA]6[TCTG]5[TCTA]3TA[TCTA]3TCA[TCTA]2TCCATA[TCTA]11");
D21S11_STR_ALLEL_SEQ.put(29, "[TCTA]4[TCTG]6[TCTA]3TA[TCTA]3TCA[TCTA]2TCCATA[TCTA]11");
D21S11_STR_ALLEL_SEQ.put(29, "[TCTA]4[TCTG]6[TCTA]3TA[TCTA]3TCA[TCTA]2TCCATA[TCTA]10");

    return D21S11_STR_ALLEL_SEQ;
}
public static int Find_Allel_NO(String seq)
{
 if(Allele_33(seq))
        return 33;
    if(Allele_32(seq))
        return 32;
    if(Allele_31(seq))
        return 31;
 if(Allele_30(seq))
        return 30;
  if(Allele_29(seq))
        return 29;
   if(Allele_28(seq))
        return 28;
		 return 0;
}        

public static Boolean Allele_33(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(33).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_32(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(32).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_31(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(31).toString())>0)
        return true;
    return false;
}
public static Boolean Allele_30(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(30).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_29(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(29).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_28(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(28).toString())>0)
        return true;
    return false;
}

}

