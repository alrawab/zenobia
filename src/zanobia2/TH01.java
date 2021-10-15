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
public class TH01 {
    public static String RepeatUnit="AATG";
    public static String RepeatType="Simple";
    public static int Allele_Count=14;
    
    
    public static Map Get_ALLEL_SEQ(){
 Map TH0_STR_ALLEL_SEQ =new HashMap();
 
 TH0_STR_ALLEL_SEQ.put(14, "AATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATG");
 TH0_STR_ALLEL_SEQ.put(13, "AATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATG");
 TH0_STR_ALLEL_SEQ.put(12, "AATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATG");
 TH0_STR_ALLEL_SEQ.put(11, "AATGAATGAATGAATGAATGAATGAATGAATGAATGAATGAATG");
 TH0_STR_ALLEL_SEQ.put(10.3, "AATGAATGAATGAATGAATGAATGATGAATGAATGAATGAATG");
 TH0_STR_ALLEL_SEQ.put(10, "AATGAATGAATGAATGAATGAATGAATGAATGAATGAATG");
 TH0_STR_ALLEL_SEQ.put(9.3, "AATGAATGAATGAATGAATGAATGATGAATGAATGAATG");
 TH0_STR_ALLEL_SEQ.put(9, "AATGAATGAATGAATGAATGAATGAATGAATGAATG");
 TH0_STR_ALLEL_SEQ.put(8.3, "AATGAATGAATGAATGAATGATGAATGAATGAATG");
 TH0_STR_ALLEL_SEQ.put(8, "AATGAATGAATGAATGAATGAATGAATGAATG");
 TH0_STR_ALLEL_SEQ.put(7, "AATGAATGAATGAATGAATGAATGAATG");
TH0_STR_ALLEL_SEQ.put(6.3, "AATGAATGAATGATGAATGAATGAATG");
 TH0_STR_ALLEL_SEQ.put(6, "AATGAATGAATGAATGAATGAATG");
 TH0_STR_ALLEL_SEQ.put(5, "AATGAATGAATGAATGAATG");
 TH0_STR_ALLEL_SEQ.put(4, "AATGAATGAATGAATG");
 TH0_STR_ALLEL_SEQ.put(3, "AATGAATGAATG");
 
    return TH0_STR_ALLEL_SEQ;
}
    
    public static Map Get_ALLEL_SEQ_ABV(){
 Map THO_STR_ALLEL_SEQ =new HashMap();
 THO_STR_ALLEL_SEQ.put(3, "[AATG]3");
 THO_STR_ALLEL_SEQ.put(4, "[AATG]4");
 THO_STR_ALLEL_SEQ.put(5, "[AATG]5");
 THO_STR_ALLEL_SEQ.put(6, "[AATG]6");
 THO_STR_ALLEL_SEQ.put(6.3, "[AATG]3ATG[AATG]3");
 THO_STR_ALLEL_SEQ.put(7, "[AATG]7");
 THO_STR_ALLEL_SEQ.put(8, "[AATG]8");
 THO_STR_ALLEL_SEQ.put(8.3, "[AATG]5ATG[AATG]3");
 THO_STR_ALLEL_SEQ.put(9, "[AATG]9");
 THO_STR_ALLEL_SEQ.put(9.3, "[AATG]6ATG[AATG]3");
 THO_STR_ALLEL_SEQ.put(10, "[AATG]10");
 THO_STR_ALLEL_SEQ.put(10.3, "[AATG]6ATG[AATG]4");
 THO_STR_ALLEL_SEQ.put(11, "[AATG]11");
 THO_STR_ALLEL_SEQ.put(12, "[AATG]12");
 THO_STR_ALLEL_SEQ.put(13, "[AATG]13");
 THO_STR_ALLEL_SEQ.put(14, "[AATG]14");
 
    return THO_STR_ALLEL_SEQ;
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
       if(Allele_10_3(seq))
        return 10.3;
       if(Allele_10(seq))
        return 10;
       if(Allele_9_3(seq))
        return 9.3;
       if(Allele_9(seq))
        return 9;
       if(Allele_8_3(seq))
        return 8.3;
       if(Allele_8(seq))
        return 8;
       if(Allele_7(seq))
        return 7;
       if(Allele_6_3(seq))
        return 6.3;
       if(Allele_6(seq))
        return 6;
       if(Allele_5(seq))
        return 5;
       if(Allele_4(seq))
        return 4;
       if(Allele_3(seq))
        return 3;
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
        public static Boolean Allele_10_3(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(10.3).toString())>0)
        return true;
    return false;
} 
         public static Boolean Allele_10(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(10).toString())>0)
        return true;
    return false;
} 
         
          public static Boolean Allele_9_3(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(9.3).toString())>0)
        return true;
    return false;
} 
  public static Boolean Allele_9(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(9).toString())>0)
        return true;
    return false;
}         
         
        public static Boolean Allele_8_3(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(8.3).toString())>0)
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
  
    public static Boolean Allele_6_3(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(6.3).toString())>0)
        return true;
    return false;
} 
  public static Boolean Allele_6(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(6).toString())>0)
        return true;
    return false;
}    
  public static Boolean Allele_5(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(5).toString())>0)
        return true;
    return false;
}   
  public static Boolean Allele_4(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(4).toString())>0)
        return true;
    return false;
}    
  public static Boolean Allele_3(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(3).toString())>0)
        return true;
    return false;
}    
}
