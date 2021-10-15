/*****************************************************************************************
                        Zanobia - fingerprinting data analysis software
Copyright (C) 2020 Usama S Erawab <alrawab@hotmail.com> Libya
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

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alrawab
 */
public class ReadFasta {
    public List<String> SEQ =new ArrayList<String>();
    public  List<String> ParseFasta(String filename)
    {
         boolean first = true;
           StringBuilder sAlleel_one = new StringBuilder();
        StringBuilder sAlleel_two = new StringBuilder();
 boolean second = false;
        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.charAt(0) == '>') {
                    if (first && !second){
                        first = false;
                       // second=true;
                    // System.out.print(line);
                    }
                    else{
                        second=true;
                      //  System.out.println();
                       //  System.out.print(line);
                    }
                  //  System.out.printf("%s: ", line.substring(1));
                }

 if (line.charAt(0) != '>')
 {
      if (!first && !second)
      {
       //    System.out.print(line);
          sAlleel_one.append(line);
          
      }
      else
      {
        sAlleel_two.append(line);
      }
 }

//System.out.print(sAlleel_one.toString());

// else {
                   // System.out.print(line);!!!!
                //
            /////////////////
        /*    if (line.charAt(0) == '>') {
                    if (!first && second){
                        first = true;
                        second=false;
                    // System.out.print(line);
                    }
                    else{
                       // System.out.println(line);
                     //    System.out.print(line);
                    }
                  //  System.out.printf("%s: ", line.substring(1));
                }
            */
            ///////////////
            }//while
         //----------------.
         SEQ.add(sAlleel_two.toString());
         SEQ.add(sAlleel_one.toString());
        }
        catch(Exception ex)
        {
        }
        System.out.println();
    
        return SEQ;
    }
}
