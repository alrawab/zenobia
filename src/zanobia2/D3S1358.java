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
public class D3S1358 {
      public static String RepeatUnit="[TCTA]\n" +
"[TCTG]";
    public static String RepeatType="Compound";
    public static int Allele_Count=7;
    
    
    public static Map Get_ALLEL_SEQ(){
 Map D3S1358_STR_ALLEL_SEQ =new HashMap();
 D3S1358_STR_ALLEL_SEQ.put(19, "TCTATCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D3S1358_STR_ALLEL_SEQ.put(18, "TCTATCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D3S1358_STR_ALLEL_SEQ.put(17, "TCTATCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D3S1358_STR_ALLEL_SEQ.put(16, "TCTATCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D3S1358_STR_ALLEL_SEQ.put(15, "TCTATCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D3S1358_STR_ALLEL_SEQ.put(14, "TCTATCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 D3S1358_STR_ALLEL_SEQ.put(13, "TCTATCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
  D3S1358_STR_ALLEL_SEQ.put(12,"TCTATCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTA");
 
 
 
  
    return D3S1358_STR_ALLEL_SEQ;
} 
   
    public static Map Get_ALLEL_SEQ_ABV(){
 Map D3S1358_STR_ALLEL_SEQ =new HashMap();
 
D3S1358_STR_ALLEL_SEQ.put(19, "TCTA[TCTG]3[TCTA]15");
D3S1358_STR_ALLEL_SEQ.put(18, "TCTA[TCTG]2[TCTA]14");
D3S1358_STR_ALLEL_SEQ.put(17, "TCTA[TCTG]3[TCTA]13");
D3S1358_STR_ALLEL_SEQ.put(16, "TCTA[TCTG]3[TCTA]12");
D3S1358_STR_ALLEL_SEQ.put(15, "TCTA[TCTG]3[TCTA]11");
D3S1358_STR_ALLEL_SEQ.put(14, "TCTA[TCTG]2[TCTA]11");
D3S1358_STR_ALLEL_SEQ.put(13, "TCTA[TCTG]2[TCTA]10");
 D3S1358_STR_ALLEL_SEQ.put(12,"TCTA[TCTG]2[TCTA]9");
    return D3S1358_STR_ALLEL_SEQ;
}
    
    
    public static double Find_Allel_NO(String seq)
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
    
}
