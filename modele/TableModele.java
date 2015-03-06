/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 0924345
 */
public class TableModele extends AbstractTableModel {

    private ArrayList<Membre> liste;
    String[] column_names = {"Code membre", "Nom", "Prenom"};

 
  public TableModele(ArrayList<Membre> liste) {
        this.liste = liste;
    }
  
    @Override
    public String getColumnName(int column) {
        return column_names[column];
    }

    public int getColumnCount() {
        return column_names.length;
    }

    public int getRowCount() {
        return liste.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return liste.get(rowIndex).getCode_membre();
        } else if (columnIndex == 1) {
            return liste.get(rowIndex).getNom();
        } else if (columnIndex == 2) {
            return liste.get(rowIndex).getPrenom();
        }
        return null;
    }
}
