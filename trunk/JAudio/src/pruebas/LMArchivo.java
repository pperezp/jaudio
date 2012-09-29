/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.io.File;
import java.util.List;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Pato Pérez
 */
public class LMArchivo implements ListModel{
    private List<File> archivos;

    public LMArchivo(List<File> archivos) {
        this.archivos = archivos;
    }
    
    @Override
    public int getSize() {
        return archivos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return archivos.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
//        throw new UnsupportedOperationException("Not supported yet.");
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }
}
