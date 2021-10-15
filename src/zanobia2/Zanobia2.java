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

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author alrawab
 */
public class Zanobia2 {

    /**
     * @param args the command line arguments
     */
  //  static Splash_Screen sp;
    public static void main(String[] args) {
        
       
        // TODO code application logic here
        Splash_Screen sp=new Splash_Screen();
        sp.setVisible(true);
       try
          {
              for(int i=0; i<=100 ;i++)
                      {
                         Thread.sleep(50);
                        Splash_Screen.jProgressBar1.setValue(i);
                        
                      }
          }
          catch (Exception ex)
          {
              
          }
    //    sp.dispatchEvent(new WindowEvent(sp, WindowEvent.WINDOW_CLOSING));
    sp.dispose();
    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
              /*  if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
            //  com.jtattoo.plaf.mcwin.McWinLookAndFeel
             // UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
               UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
              UIDefaults defaults = UIManager.getLookAndFeelDefaults();
defaults.putIfAbsent("Table.alternateRowColor", Color.LIGHT_GRAY);

DefaultTableCellRenderer rendar = new DefaultTableCellRenderer();
  //  rendar.setHorizontalAlignment(jLabel1.CENTER);

  // DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
 




            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        MainWindow mw=new MainWindow();
        mw.setVisible(true);
        mw.setLocationRelativeTo(null);
      //  mw.setExtendedState(JFrame.MAXIMIZED_BOTH);
        /*****************************
         * 
         */
        mw.jTable1.setRowSelectionInterval(0, 0);
        
        JTableHeader header=  mw.jTable1.getTableHeader();
        header.setBackground(Color.yellow);
       //header.setForeground(Color.white);
//       mw.jTable1.getTableHeader().setForeground(Color.yellow);
       
       //  mw.jTable1.getTableHeader().setForeground(new Color(0).yellow);
     //  mw.jTable1.getTableHeader().setOpaque(false);
        mw.jTable1.getTableHeader().setForeground(Color.BLUE);
       mw.jTable1.getTableHeader().setFont(new Font("Calisto MT", Font.BOLD, 40));
       
       DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
centerRenderer.setHorizontalAlignment( JLabel.CENTER );
mw.jTable1.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
mw.jTable1.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
mw.jTable1.getColumnModel().getColumn(2).setCellRenderer( centerRenderer ); 
mw.jTable1.getColumnModel().getColumn(3).setCellRenderer( centerRenderer ); 
mw.jTable1.getColumnModel().getColumn(4).setCellRenderer( centerRenderer ); 
mw.jTable1.getColumnModel().getColumn(5).setCellRenderer( centerRenderer ); 
mw.jTable1.getColumnModel().getColumn(6).setCellRenderer( centerRenderer ); 
mw.jTable1.getColumnModel().getColumn(7).setCellRenderer( centerRenderer ); 
mw.jTable1.getColumnModel().getColumn(8).setCellRenderer( centerRenderer ); 




DefaultTableCellRenderer rendar1 = new DefaultTableCellRenderer();
    centerRenderer.setForeground(Color.red);

    mw.jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    rendar1.setForeground(Color.BLUE);
    mw.jTable1.getColumnModel().getColumn(1).setCellRenderer(rendar1);
   rendar1.setHorizontalAlignment( JLabel.CENTER );
   DefaultTableCellRenderer rendar2 = new DefaultTableCellRenderer();
    rendar2.setHorizontalAlignment( JLabel.CENTER );
    rendar2.setForeground(Color.MAGENTA);
    mw.jTable1.getColumnModel().getColumn(2).setCellRenderer(rendar2);
    DefaultTableCellRenderer rendar3 = new DefaultTableCellRenderer();
    rendar3.setForeground(Color.BLACK);
    mw.jTable1.getColumnModel().getColumn(3).setCellRenderer(rendar3);
    mw.jTable1.getColumnModel().getColumn(5).setCellRenderer(rendar3);
    mw.jTable1.getColumnModel().getColumn(7).setCellRenderer(rendar3);
    rendar3.setHorizontalAlignment( JLabel.CENTER );
    }
    
}
