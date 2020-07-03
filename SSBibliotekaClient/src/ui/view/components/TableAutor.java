/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.components;

import domain.Autor;
import domain.Knjiga;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vidan
 */
public class TableAutor extends AbstractTableModel{
    List<Autor> autori;
    private String[] columnNames = new String[]{"Naziv","Domaci"};

    public TableAutor() {
        autori = new ArrayList<>();
    }

    @Override
    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public Object getValueAt(int x, int y) {
        Autor item = autori.get(x);
        switch (y) {
            case 0:
                return item.toString();
            case 1:
                return item.isDomaci();
            default:
                return "n/a";
        }
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return autori.size();
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return Boolean.class;
            default:
                return String.class;
        }
    }

    public void setAutori(List<Autor> autori) {
        this.autori = autori;
        fireTableDataChanged();
    }

    public void add(Autor autor) {
        autori.add(autor);
        fireTableDataChanged();
    }

    public List<Autor> getAutori() {
        return autori;
    }
}
