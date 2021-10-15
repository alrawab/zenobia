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

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alrawab
 */
public class ReadFasta_1 {
     static String seq="";
    public static String ParseFasta(String filename)
{
 // code to be executed....
    
    try
    {
     BufferedReader in     = new BufferedReader( new FileReader( filename ) );
     StringBuffer   buffer = new StringBuffer();
        String         line   = in.readLine();
         
        if( line.charAt( 0 ) != '>' ){
            //throw new IOException( "First line of " + filename + " should start with '>'" );
            System.out.println("not valied");
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
             JOptionPane.showMessageDialog(frame, "Fasta File should start with > ", "Zanobia Invalid Fasta File ",JOptionPane.WARNING_MESSAGE);
            return "";
        }
      for( line = in.readLine().trim(); line != null; line = in.readLine() )
	{
            if( line.length()>0 && line.charAt( 0 ) != '>' )
	    {
               seq +=line; 
            }
           // System.out.println(line);
        }
     
    }
    catch (Exception ex){System.out.println(ex.toString());}
    // System.out.println(seq);
    return seq;
}
}
