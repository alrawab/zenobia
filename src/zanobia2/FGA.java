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
public class FGA {
    public static String RepeatUnit="[TCTA]\n" +
"[TCTG]";
    public static String RepeatType="Compound";
    public static int Allele_Count=17;
    
    //***********************
    
    public static Map Get_ALLEL_SEQ(){
        
        Map FGA_STR_ALLEL_SEQ =new HashMap();
        
        FGA_STR_ALLEL_SEQ.put(50.2,"TTTCTTTCTTTCTTTCTTTTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTGTCTGTCTGTCTGTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTCCTTCCTTCCTTCCTTTCTTTCTTTCTCCTTCCTTCCTTCCTTCC");
     //   FGA_STR_ALLEL_SEQ.put(48.2,"TTTCTTTCTTTCTTTCTTTTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTGTCTGTCTGTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTT");
     FGA_STR_ALLEL_SEQ.put(28,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC");    
     FGA_STR_ALLEL_SEQ.put(27,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC");    
    FGA_STR_ALLEL_SEQ.put(26,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC");   
      FGA_STR_ALLEL_SEQ.put(25,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC"); 
      FGA_STR_ALLEL_SEQ.put(24,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC"); 
     FGA_STR_ALLEL_SEQ.put(23,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC"); 
       FGA_STR_ALLEL_SEQ.put(22,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC"); 
          FGA_STR_ALLEL_SEQ.put(21,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC"); 
      FGA_STR_ALLEL_SEQ.put(20,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC");
      FGA_STR_ALLEL_SEQ.put(19,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC");
      
     FGA_STR_ALLEL_SEQ.put(18.2,"TTTCTTTCTTTCTTTTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC");
         FGA_STR_ALLEL_SEQ.put(18,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC");
         FGA_STR_ALLEL_SEQ.put(17,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC");
         FGA_STR_ALLEL_SEQ.put(16.1,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTTCTTTCTTTCTTTCTCCTTCCTTCC");
         FGA_STR_ALLEL_SEQ.put(16,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC"); 
         FGA_STR_ALLEL_SEQ.put(15,"TTTCTTTCTTTCTTTTTTCTCTTTCTTTCTTTCTTTCTTTCTTTCTTTCTCCTTCCTTCC"); 
        return FGA_STR_ALLEL_SEQ;
        
    }
    
    public static Map Get_ALLEL_SEQ_ABV(){
 Map FGA_STR_ALLEL_SEQ =new HashMap();
 //CSF1PO_STR_ALLEL_SEQ.put(5, "[AGAT]5");
 FGA_STR_ALLEL_SEQ.put(15, "[TTTC]3TTTT TTCT[CTTT]7CTCC[TTCC]2");
 FGA_STR_ALLEL_SEQ.put(16, "[TTTC]3TTTT TTCT[CTTT]8CTCC[TTCC]2");
 FGA_STR_ALLEL_SEQ.put(16.1, "TTTC]3TTTT TTCT[CTTT]5T[CTTT]3CTCC[TTCC]2");
 FGA_STR_ALLEL_SEQ.put(17, "[TTTC]3TTTT TTCT[CTTT]9CTCC[TTCC]2");
 FGA_STR_ALLEL_SEQ.put(18, "[TTTC]3TTTT TTCT[CTTT]10CTCC[TTCC]2");
 FGA_STR_ALLEL_SEQ.put(18.2, "[TTTC]3TTTT TT[CTTT]11CTCC[TTCC]2");
  FGA_STR_ALLEL_SEQ.put(28, "[TTTC]3TTTT TTCT[CTTT]20CTCC[TTCC]2");
  FGA_STR_ALLEL_SEQ.put(27, "[TTTC]3TTTT TTCT[CTTT]19CTCC[TTCC]2");
  FGA_STR_ALLEL_SEQ.put(26, "[TTTC]3TTTT TTCT[CTTT]18CTCC[TTCC]2");
  FGA_STR_ALLEL_SEQ.put(25, "[TTTC]3TTTT TTCT[CTTT]17CTCC[TTCC]2");
  FGA_STR_ALLEL_SEQ.put(25, "[TTTC]3TTTT TTCT[CTTT]16CTCC[TTCC]2");
  FGA_STR_ALLEL_SEQ.put(24, "[TTTC]3TTTT TTCT[CTTT]15CTCC[TTCC]2");
  FGA_STR_ALLEL_SEQ.put(23, "[TTTC]3TTTT TTCT[CTTT]14CTCC[TTCC]2");
   FGA_STR_ALLEL_SEQ.put(22, "[TTTC]3TTTT TTCT[CTTT]13CTCC[TTCC]2");
   FGA_STR_ALLEL_SEQ.put(21, "[TTTC]3TTTT TTCT[CTTT]12CTCC[TTCC]2");
   FGA_STR_ALLEL_SEQ.put(20, "[TTTC]3TTTT TTCT[CTTT]11CTCC[TTCC]2");
   FGA_STR_ALLEL_SEQ.put(19, "[TTTC]3TTTT TTCT[CTTT]10CTCC[TTCC]2");
   
   
 FGA_STR_ALLEL_SEQ.put(50.2, "[TTTC]4TTTT TT[CTTT]14[CTGT]4[CTTT]15[CTTC]4[CTTT]3CTCC[TTCC]4");
 
    return FGA_STR_ALLEL_SEQ;
}
    
    
    //--------------
    public static double Find_Allel_NO(String seq)
{
   
    if(Allele_50_2(seq))
        return 50.2;
  //   if(Allele_48_2(seq))
    //   return 48.2;
     if(Allele_28(seq))
        return 28;
      if(Allele_27(seq))
        return 27;
      if(Allele_26(seq))
        return 26;
      if(Allele_25(seq))
        return 25;
      if(Allele_24(seq))
        return 24;
      if(Allele_23(seq))
        return 23;
       if(Allele_22(seq))
        return 22;
       if(Allele_21(seq))
        return 21;
      if(Allele_20(seq))
        return 20;
       if(Allele_19(seq))
        return 19;
    if(Allele_18_2(seq))
        return 18.2;
     if(Allele_18(seq))
        return 18;
      if(Allele_17(seq))
        return 17;
      if(Allele_16_1(seq))
        return 16.1;
      if(Allele_16(seq))
        return 16;
      if(Allele_15(seq))
        return 15;
    return 0;
}
    //*****************************
    public static Boolean Allele_50_2(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(50.2).toString())>0)
        return true;
    
    return false;
}
      public static Boolean Allele_48_2(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(48.2).toString())>0)
        return true;
     return false;
}
       public static Boolean Allele_18_2(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(18.2).toString())>0)
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
           
                public static Boolean Allele_16_1(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(16.1).toString())>0)
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
     
      public static Boolean Allele_28(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(28).toString())>0)
        return true;
     return false;
}   
    
  public static Boolean Allele_27(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(27).toString())>0)
        return true;
     return false;
}   
public static Boolean Allele_26(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(26).toString())>0)
        return true;
     return false;
}   
public static Boolean Allele_25(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(25).toString())>0)
        return true;
     return false;
}   
public static Boolean Allele_24(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(24).toString())>0)
        return true;
     return false;
}   

public static Boolean Allele_23(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(23).toString())>0)
        return true;
     return false;
}   
public static Boolean Allele_22(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(22).toString())>0)
        return true;
     return false;
}


public static Boolean Allele_21(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(21).toString())>0)
        return true;
     return false;
}
public static Boolean Allele_20(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(20).toString())>0)
        return true;
     return false;
}
public static Boolean Allele_19(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(19).toString())>0)
        return true;
     return false;
}

//**************
    
    
}
