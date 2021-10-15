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
public class CSF1PO {
     
    public static String RepeatUnit="AGAT";
    public static String RepeatType="Simple";
    public static int Allele_Count=12;
public static Map Get_ALLEL_SEQ(){
 Map CSF1PO_STR_ALLEL_SEQ =new HashMap();
 CSF1PO_STR_ALLEL_SEQ.put(5, "AGATAGATAGATAGATAGAT");
 CSF1PO_STR_ALLEL_SEQ.put(6, "AGATAGATAGATAGATAGATAGAT");
 CSF1PO_STR_ALLEL_SEQ.put(7, "AGATAGATAGATAGATAGATAGATAGAT");
 CSF1PO_STR_ALLEL_SEQ.put(8, "AGATAGATAGATAGATAGATAGATAGATAGAT");
 CSF1PO_STR_ALLEL_SEQ.put(9, "AGATAGATAGATAGATAGATAGATAGATAGATAGAT");
 CSF1PO_STR_ALLEL_SEQ.put(10, "AGATAGATAGATAGATAGATAGATAGATAGATAGATAGAT");
 CSF1PO_STR_ALLEL_SEQ.put(11, "AGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGAT");
 CSF1PO_STR_ALLEL_SEQ.put(12, "AGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGAT");
 CSF1PO_STR_ALLEL_SEQ.put(13, "AGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGAT");
 CSF1PO_STR_ALLEL_SEQ.put(14, "AGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGAT");
 CSF1PO_STR_ALLEL_SEQ.put(15, "AGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGAT");
 CSF1PO_STR_ALLEL_SEQ.put(16, "AGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGAT");
    return CSF1PO_STR_ALLEL_SEQ;
}

public static Map Get_ALLEL_SEQ_ABV(){
 Map CSF1PO_STR_ALLEL_SEQ =new HashMap();
 CSF1PO_STR_ALLEL_SEQ.put(5, "[AGAT]5");
 CSF1PO_STR_ALLEL_SEQ.put(6, "[AGAT]6");
 CSF1PO_STR_ALLEL_SEQ.put(7, "[AGAT]7");
 CSF1PO_STR_ALLEL_SEQ.put(8, "[AGAT]8");
 CSF1PO_STR_ALLEL_SEQ.put(9, "[AGAT]9");
 CSF1PO_STR_ALLEL_SEQ.put(10, "[AGAT]10");
 CSF1PO_STR_ALLEL_SEQ.put(11, "[AGAT]11");
 CSF1PO_STR_ALLEL_SEQ.put(12, "[AGAT]12");
 CSF1PO_STR_ALLEL_SEQ.put(13, "[AGAT]13");
 CSF1PO_STR_ALLEL_SEQ.put(14, "[AGAT]14");
 CSF1PO_STR_ALLEL_SEQ.put(15, "[AGAT]15");
 CSF1PO_STR_ALLEL_SEQ.put(16, "[AGAT]16");
    return CSF1PO_STR_ALLEL_SEQ;
}
public static int Find_Allel_NO(String seq)
{
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
   if(Allele_6(seq))
        return 6;
    if(Allele_5(seq))
        return 5;
    return 0;
}

//----------------check Allel 5------------------
public static Boolean Allele_5(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(5).toString())>0)
        return true;
    return false;
}
//----------------END of check Allel 6------------------
public static Boolean Allele_6(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(6).toString())>0)
        return true;
    return false;
}
//----------------END of check Allel 6------------------
//----------------END of check Allel 7------------------
public static Boolean Allele_7(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(7).toString())>0)
        return true;
    return false;
}
//----------------END of check Allel 7------------------
//----------------END of check Allel 7------------------
public static Boolean Allele_8(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(8).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_9(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(9).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_10(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(10).toString())>0)
        return true;
    return false;
}
public static Boolean Allele_11(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(11).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_12(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(12).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_13(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(13).toString())>0)
        return true;
    return false;
}

public static Boolean Allele_14(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(14).toString())>0)
        return true;
    return false;
}
public static Boolean Allele_15(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(15).toString())>0)
        return true;
    return false;
}
public static Boolean Allele_16(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(16).toString())>0)
        return true;
    return false;
}
//----------------END of check Allel 7------------------
}
