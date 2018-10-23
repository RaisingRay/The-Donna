/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUITools.Tweakers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Raiisa
 */
public class TweakedTable {
    private JTable table;
    public TweakedTable(JTable table){
         this.table=table;
         initChages();
    }

    private void initChages() {
      table.setBackground(new Color(255,255,255));
      table.setForeground(new Color(14, 67, 117));
      table.setFillsViewportHeight(true);
      DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
      centerRenderer.setHorizontalAlignment( JLabel.CENTER );
      for(int i=0;i<table.getColumnCount();i++)
      table.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
      table.getTableHeader().setBackground(new Color(14, 67, 117));
      table.getTableHeader().setForeground(new Color(255,255,255));
      table.setSelectionBackground(new Color(239, 130, 63));
      table.setSelectionForeground(new Color(255,255,255));
      Font f=table.getTableHeader().getFont();
      table.getTableHeader().setFont(f.deriveFont(f.getStyle() | Font.BOLD));
      table.getTableHeader().setFont(f.deriveFont(15.0f));
      table.setShowGrid(false);
      table.setShowVerticalLines(true);
      table.setGridColor(new Color(14, 67, 117) );
      
    }
    
}
