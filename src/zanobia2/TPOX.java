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
public class TPOX {
    public static String RepeatUnit="AATG";
    public static String RepeatType="Simple";
    public static int Allele_Count=9; 
    
     public static Map Get_ALLEL_SEQ(){
 Map TPOX_STR_ALLEL_SEQ =new HashMap();
 
  TPOX_STR_ALLEL_SEQ.put(14, "AATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATG");
  TPOX_STR_ALLEL_SEQ.put(13, "AATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATG");
 TPOX_STR_ALLEL_SEQ.put(12, "AATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATG");
 TPOX_STR_ALLEL_SEQ.put(11, "AATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATG");
 TPOX_STR_ALLEL_SEQ.put(10, "AATGAATGAATGAATGAATGAATGAATGAATGAATGAATG");
 TPOX_STR_ALLEL_SEQ.put(9, "AATGAATGAATGAATGAATGAATGAATGAATGAATG");
 TPOX_STR_ALLEL_SEQ.put(8, "AATGAATGAATGAATGAATGAATGAATGAATG");
 TPOX_STR_ALLEL_SEQ.put(7, "AATGAATGAATGAATGAATGAATGAATG");
 TPOX_STR_ALLEL_SEQ.put(6, "AATGAATGAATGAATGAATGAATG");

 
 
    return TPOX_STR_ALLEL_SEQ;
}
    
     
     
     
     public static Map Get_ALLEL_SEQ_ABV(){
 Map TPOX_STR_ALLEL_SEQ =new HashMap();
 TPOX_STR_ALLEL_SEQ.put(6, "[AATG]6");
 TPOX_STR_ALLEL_SEQ.put(7, "[AATG]7");
 TPOX_STR_ALLEL_SEQ.put(8, "[AATG]8");
 TPOX_STR_ALLEL_SEQ.put(9, "[AATG]9");
 TPOX_STR_ALLEL_SEQ.put(10, "[AATG]10");
 TPOX_STR_ALLEL_SEQ.put(11, "[AATG]11");
 TPOX_STR_ALLEL_SEQ.put(12, "[AATG]12");
 TPOX_STR_ALLEL_SEQ.put(13, "[AATG]13");
 TPOX_STR_ALLEL_SEQ.put(14, "[AATG]14");
 
 
    return TPOX_STR_ALLEL_SEQ;
}
     
     
public static double Find_Allel_NO(String seq)
{
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
       
    return 0;
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
     public static Boolean Allele_6(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(6).toString())>0)
        return true;
    return false;
} 
     
     
     
}
