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
public class VWA {
     public static String RepeatUnit="[TCTA]\n" +
"[TCTG]";
    public static String RepeatType="Compound";
    public static int Allele_Count=14; 
    
    
   public static Map Get_ALLEL_SEQ(){
 Map VWA_STR_ALLEL_SEQ =new HashMap();
 //VWA_STR_ALLEL_SEQ.put(13, "TCTATCTGTCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTA");
      
 
  VWA_STR_ALLEL_SEQ.put(22, "TCTATCTGTCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTA");
  VWA_STR_ALLEL_SEQ.put(21,  "TCTATCTGTCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCCATCTA");
  VWA_STR_ALLEL_SEQ.put(20,  "TCTATCTGTCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCCATCTA");
  VWA_STR_ALLEL_SEQ.put(19, "TCTATCTGTCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCCATCTA");
  VWA_STR_ALLEL_SEQ.put(18, "TCTATCTGTCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCCATCTA");
  VWA_STR_ALLEL_SEQ.put(17, "TCTATCTGTCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCCATCTA");
  VWA_STR_ALLEL_SEQ.put(16, "TCTATCTGTCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCCATCTA");
  VWA_STR_ALLEL_SEQ.put(15, "TCTATCTGTCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCTATCCATCTA");
  VWA_STR_ALLEL_SEQ.put(14, "TCTATCTGTCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTATCTATCTATCCATCTA");
  VWA_STR_ALLEL_SEQ.put(13, "TCTATCTATCTGTCTGTCTGTCTGTCTATCTATCTATCCATCTATCTATCTA");
  VWA_STR_ALLEL_SEQ.put(12, "TCTATCTGTCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTA");
  VWA_STR_ALLEL_SEQ.put(11, "TCTATCTGTCTGTCTGTCTATCTATCTATCTATCTATCTATCTA");
  VWA_STR_ALLEL_SEQ.put(10, "TCTATCTGTCTATCTGTCTGTCTGTCTGTCTATCTATCTA");
    return VWA_STR_ALLEL_SEQ;
} 
   
   
   
   public static Map Get_ALLEL_SEQ_ABV(){
 Map VWA_STR_ALLEL_SEQ =new HashMap();
 
 VWA_STR_ALLEL_SEQ.put(22, "TCTA[TCTG]4[TCTA]17TCCATCTA");
 VWA_STR_ALLEL_SEQ.put(21, "TCTA[TCTG]4[TCTA]16TCCATCTA");
 VWA_STR_ALLEL_SEQ.put(20, "TCTA[TCTG]4[TCTA]15TCCATCTA");
 VWA_STR_ALLEL_SEQ.put(19, "TCTA[TCTG]4[TCTA]14TCCATCTA");
 VWA_STR_ALLEL_SEQ.put(18, "TCTA[TCTG]4[TCTA]13TCCATCTA");
 VWA_STR_ALLEL_SEQ.put(17, "TCTA[TCTG]4[TCTA]12TCCATCTA");
 VWA_STR_ALLEL_SEQ.put(16, "TCTA[TCTG]4[TCTA]11TCCATCTA");
 VWA_STR_ALLEL_SEQ.put(15, "TCTA[TCTG]4[TCTA]10TCCATCTA");
 VWA_STR_ALLEL_SEQ.put(14, "TCTA[TCTG]4[TCTA]9TCCATCTA");
 VWA_STR_ALLEL_SEQ.put(13, "[TCTA]2[TCTG]4[TCTA]3TCCA[TCTA]3");
 VWA_STR_ALLEL_SEQ.put(12, "TCTA[TCTG]4[TCTA]7");
 VWA_STR_ALLEL_SEQ.put(11, "TCTA[TCTG]3[TCTA]7");
 VWA_STR_ALLEL_SEQ.put(10, "TCTATCTGTCTA[TCTG]4[TCTA]3");
 
    return VWA_STR_ALLEL_SEQ;
}
   
 public static double Find_Allel_NO(String seq)
{
     if(Allele_22(seq))
        return 22;
		if(Allele_21(seq))
        return 21;
		if(Allele_20(seq))
        return 20;
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
		       
    return 0;
}       
   
   
   
  public static Boolean Allele_22(String seq)
{
    
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(22).toString())>0)
        return true;
    return false;
} 
     public static Boolean Allele_20(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(20).toString())>0)
        return true;
    return false;
} 
      public static Boolean Allele_21(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(21).toString())>0)
        return true;
    return false;
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
     
   
   
   
   
}
