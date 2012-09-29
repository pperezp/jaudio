/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.awt.Color;
import java.awt.Component;
import java.io.File;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Pato Pérez
 */
public class CRArchivo extends JLabel implements ListCellRenderer{

    @Override
    public Component getListCellRendererComponent
    (JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        this.setOpaque(true);
        if(value instanceof File){
            File f = (File)value;
            this.setText(f.getName());
        }
        
        if(isSelected){
            this.setBackground(Color.black);
            this.setForeground(Color.green);
        }else{
            this.setBackground(Color.white);
            this.setForeground(Color.black);
        }
        return this;
    }
    
}
