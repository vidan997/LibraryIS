/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.components;

import domain.Administrator;
import domain.PrimerakKnjige;
import domain.Zaduzivanje;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Vidan
 */
public class TableZaduzenjaKlijenta extends AbstractTableModel {

    List<Zaduzivanje> zaduzenja;
    private String[] columnNames = new String[]{"Naziv", "Invertacioni br.", "Zaduzena", "Datum zaduzivanja", "Do datuma", "Datum razduzivanja", "Prekoraceno", "Odobreno"};

    public TableZaduzenjaKlijenta() {
        zaduzenja = new ArrayList<>();
    }

    public TableZaduzenjaKlijenta(List<Zaduzivanje> zaduzenja) {
        this.zaduzenja = zaduzenja;
    }

    @Override
    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public Object getValueAt(int x, int y) {
        Zaduzivanje item = zaduzenja.get(x);
        switch (y) {
            case 0:
                return item.getKnjiga().getKnjiga().getNaziv();
            case 1:
                return item.getKnjiga().getInvertacioniBr();
            case 2:
                return item.getKnjiga().isZaduzena();
            case 3:
                return item.getDatumZaduzivanja();
            case 4:
                return item.getDoDatuma();
            case 5:
                return item.getDatumRazduzivanja();
            case 6:
                return item.isPrekoracen();
            case 7:
                return item.isOdobreno();
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
        return zaduzenja.size();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return Integer.class;
            case 2:
                return Boolean.class;
            case 3:
                return Date.class;
            case 4:
                return Date.class;
            case 5:
                return Date.class;
            case 6:
                return Boolean.class;
            case 7:
                return Boolean.class;
            default:
                return String.class;
        }
    }

    public void razduzi(int selectedRow) throws Exception {
        if (zaduzenja.get(selectedRow).getDatumRazduzivanja() != null) {
            throw new Exception("Ova knjiga je vec razduzena!");
        }

        zaduzenja.get(selectedRow).setDatumRazduzivanja(new Date());
        fireTableDataChanged();
    }

    public void odobri(int selectedRow, Administrator administrator) throws Exception {
        if (zaduzenja.get(selectedRow).isOdobreno() == true) {
            throw new Exception("Ova knjiga je vec odobrena!");
        }

        zaduzenja.get(selectedRow).setDatumRazduzivanja(new Date());
        zaduzenja.get(selectedRow).setAdministrator(administrator);
        zaduzenja.get(selectedRow).setOdobreno(true);

        fireTableDataChanged();
    }

    public List<Zaduzivanje> getZaduzanja() {
        return zaduzenja;
    }
}
