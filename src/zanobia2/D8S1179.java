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
public class D8S1179 {
    public static String RepeatUnit="[TCTA]";
    public static String RepeatType="Simple";
    public static int Allele_Count=13;


public static Map Get_ALLEL_SEQ(){
 Map D8S1179_STR_ALLEL_SEQ =new HashMap();
 D8S1179_STR_ALLEL_SEQ.put(19, "TCTATCTATCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 //D8S1179_STR_ALLEL_SEQ.put(19,
 
 D8S1179_STR_ALLEL_SEQ.put(18,"TCTATCTATCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D8S1179_STR_ALLEL_SEQ.put(17, "TCTATCTATCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D8S1179_STR_ALLEL_SEQ.put(16,"TCTATCTATCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D8S1179_STR_ALLEL_SEQ.put(15,"TCTATCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D8S1179_STR_ALLEL_SEQ.put(14,"TCTATCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D8S1179_STR_ALLEL_SEQ.put(13,"TCTATCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D8S1179_STR_ALLEL_SEQ.put(12,"TCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D8S1179_STR_ALLEL_SEQ.put(11,"TCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D8S1179_STR_ALLEL_SEQ.put(10,"TCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D8S1179_STR_ALLEL_SEQ.put(9,"TCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D8S1179_STR_ALLEL_SEQ.put(8,"TCTATCTATCTATCTATCTATCTATCTATCTA");
 D8S1179_STR_ALLEL_SEQ.put(7,"TCTATCTATCTATCTATCTATCTATCTA");
 
    return D8S1179_STR_ALLEL_SEQ;
} 
   
  public static Map Get_ALLEL_SEQ_ABV(){
 Map D8S1179_STR_ALLEL_SEQ =new HashMap();
 

D8S1179_STR_ALLEL_SEQ.put(19, "[TCTA]2[TCTG]2[TCTA]15");
D8S1179_STR_ALLEL_SEQ.put(18, "[TCTA]2[TCTG]1[TCTA]15");
D8S1179_STR_ALLEL_SEQ.put(17, "[TCTA]2[TCTG]2[TCTA]13");
D8S1179_STR_ALLEL_SEQ.put(16, "[TCTA]2[TCTG]1[TCTA]13");
D8S1179_STR_ALLEL_SEQ.put(15, "[TCTA]1[TCTG]1[TCTA]13");
D8S1179_STR_ALLEL_SEQ.put(14, "[TCTA]1[TCTG]1[TCTA]12");
D8S1179_STR_ALLEL_SEQ.put(13, "[TCTA]1[TCTG]1[TCTA]11");
D8S1179_STR_ALLEL_SEQ.put(12, "[TCTA]12");
D8S1179_STR_ALLEL_SEQ.put(11, "[TCTA]11");
D8S1179_STR_ALLEL_SEQ.put(10, "[TCTA]10");
D8S1179_STR_ALLEL_SEQ.put(9, "[TCTA]9");
D8S1179_STR_ALLEL_SEQ.put(8, "[TCTA]8");
D8S1179_STR_ALLEL_SEQ.put(7, "[TCTA]7");



    return D8S1179_STR_ALLEL_SEQ;
}
public static int Find_Allel_NO(String seq)
{

    if(Allele_19(seq))
        return 19;
    if(Allele_18(seq))
        return 18;
   if(Allele_17(seq))
        return 17;
   if(Allele_16(seq))
        return 16;
   if(Allele_15(seq))
        return 15;
     if(Allele_14(seq))
        return 14;
	if(Allele_13(seq))
        return 13;
	if(Allele_12(seq))
        return 12;
	if(Allele_11(seq))
        return 11;
	if(Allele_10(seq))
        return 10;
	if(Allele_9(seq))
        return 9;
	if(Allele_8(seq))
        return 8;
    if(Allele_7(seq))
        return 7;

		 return 0;
}        

public static Boolean Allele_19(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(19).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_18(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(18).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_17(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(17).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_16(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(16).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_15(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(15).toString())>0)
        return true;
    return false;
}


public static Boolean Allele_14(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(14).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_13(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(13).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_12(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(12).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_11(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(11).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_10(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(10).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_9(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(9).toString())>0)
        return true;
    return false;
}


public static Boolean Allele_8(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(8).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_7(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(7).toString())>0)
        return true;
    return false;
}




}

