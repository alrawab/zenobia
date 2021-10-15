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
public class D16S539 {
    public static String RepeatUnit="[GATA]";
    public static String RepeatType="Simple";
    public static int Allele_Count=9;
    
    
    public static Map Get_ALLEL_SEQ(){
 Map D16S539_STR_ALLEL_SEQ =new HashMap();
 D16S539_STR_ALLEL_SEQ.put(15, "GATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATA");
 D16S539_STR_ALLEL_SEQ.put(14, "GATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATA");
 D16S539_STR_ALLEL_SEQ.put(13, "GATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATA");
 D16S539_STR_ALLEL_SEQ.put(12, "GATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATA");
 D16S539_STR_ALLEL_SEQ.put(11, "GATAGATAGATAGATAGATAGATAGATAGATAGATAGATAGATA");
 D16S539_STR_ALLEL_SEQ.put(10, "GATAGATAGATAGATAGATAGATAGATAGATAGATAGATA");
 D16S539_STR_ALLEL_SEQ.put(9, "GATAGATAGATAGATAGATAGATAGATAGATAGATA");
 D16S539_STR_ALLEL_SEQ.put(8, "GATAGATAGATAGATAGATAGATAGATAGATA");
 D16S539_STR_ALLEL_SEQ.put(5, "GATAGATAGATAGATAGATA");
 
    return D16S539_STR_ALLEL_SEQ;
} 
   
    
    public static Map Get_ALLEL_SEQ_ABV(){
 Map D16S539_STR_ALLEL_SEQ =new HashMap();
 
D16S539_STR_ALLEL_SEQ.put(15, "[GATA]15");
D16S539_STR_ALLEL_SEQ.put(14, "[GATA]14");
D16S539_STR_ALLEL_SEQ.put(13, "[GATA]13");
D16S539_STR_ALLEL_SEQ.put(12, "[GATA]12");
D16S539_STR_ALLEL_SEQ.put(11, "[GATA]11");
D16S539_STR_ALLEL_SEQ.put(10, "[GATA]10");
D16S539_STR_ALLEL_SEQ.put(9, "[GATA]9");
D16S539_STR_ALLEL_SEQ.put(8, "[GATA]8");
D16S539_STR_ALLEL_SEQ.put(5, "[GATA]5");

    return D16S539_STR_ALLEL_SEQ;
}
    
   public static int Find_Allel_NO(String seq)
{
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
    if(Allele_5(seq))
        return 5;
		 return 0;
}  
   public static Boolean Allele_5(String seq)
{
    if (PatternMatch.bruteforce(seq, Get_ALLEL_SEQ().get(5).toString())>0)
        return true;
    return false;
}
    
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
}
