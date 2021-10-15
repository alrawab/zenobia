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

/**
 *
 * @author alrawab
 */
public class PatternMatch {
    
     public static int bruteforce(String input,String pattern){
       int output = 0;
    for (int i = 0; i <= input.length() - pattern.length(); i++) {
        boolean ok = true;
        for (int k = 0; k < pattern.length(); k++) {
            if(input.charAt(i + k) != pattern.charAt(k)) {
                ok = false;
                break;
            }
        }
        if(ok) output++;
    }
    return output;
    }
}
