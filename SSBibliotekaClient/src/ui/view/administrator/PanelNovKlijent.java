/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.administrator;

import communication.CommunicationController;
import domain.Klijent;
import exception.ValidationException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author vidan
 */
public class PanelNovKlijent extends javax.swing.JPanel {

    /**
     * Creates new form PanelNovKlijent
     */
    public PanelNovKlijent() {
        initComponents();
        cmbUplacuje.addItem("3 meseca");
        cmbUplacuje.addItem("6 meseci");
        cmbUplacuje.addItem("Godinu dana");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        txtIme = new javax.swing.JTextField();
        txtDatR = new javax.swing.JTextField();
        txtJMBG = new javax.swing.JTextField();
        txtKontakt = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbUplacuje = new javax.swing.JComboBox();
        btnSacuvaj = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 82, 82));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nov klijent", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 18), new java.awt.Color(212, 221, 225))); // NOI18N
        setPreferredSize(new java.awt.Dimension(740, 626));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(212, 221, 225));
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(212, 221, 225));
        jLabel4.setText("Kontakt:");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(212, 221, 225));
        jLabel5.setText("JMBG:");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(212, 221, 225));
        jLabel6.setText("Datum rodjenja:");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(212, 221, 225));
        jLabel7.setText("Prezime:");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(212, 221, 225));
        jLabel8.setText("Ime:");

        txtPrezime.setBackground(new java.awt.Color(212, 221, 225));
        txtPrezime.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtPrezime.setForeground(new java.awt.Color(45, 48, 51));

        txtIme.setBackground(new java.awt.Color(212, 221, 225));
        txtIme.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtIme.setForeground(new java.awt.Color(45, 48, 51));

        txtDatR.setBackground(new java.awt.Color(212, 221, 225));
        txtDatR.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtDatR.setForeground(new java.awt.Color(45, 48, 51));

        txtJMBG.setBackground(new java.awt.Color(212, 221, 225));
        txtJMBG.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtJMBG.setForeground(new java.awt.Color(45, 48, 51));

        txtKontakt.setBackground(new java.awt.Color(212, 221, 225));
        txtKontakt.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtKontakt.setForeground(new java.awt.Color(45, 48, 51));

        txtUsername.setBackground(new java.awt.Color(212, 221, 225));
        txtUsername.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(45, 48, 51));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(212, 221, 225));
        jLabel9.setText("Upacuje:");

        cmbUplacuje.setBackground(new java.awt.Color(212, 221, 225));
        cmbUplacuje.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        cmbUplacuje.setForeground(new java.awt.Color(45, 48, 51));

        btnSacuvaj.setBackground(new java.awt.Color(212, 221, 225));
        btnSacuvaj.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnSacuvaj.setForeground(new java.awt.Color(45, 48, 51));
        btnSacuvaj.setIcon(new javax.swing.ImageIcon("C:\\Users\\vidan\\Documents\\NetBeansProjects\\SeminarskiPS\\SSBiblioteka\\SSBibliotekaClient\\src\\images\\icons8_save_24px.png")); // NOI18N
        btnSacuvaj.setText("Sacuvaj klijenta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addComponent(btnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtIme, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDatR, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtJMBG, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtKontakt, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbUplacuje, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKontakt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbUplacuje, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(btnSacuvaj)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JComboBox cmbUplacuje;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDatR;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtJMBG;
    private javax.swing.JTextField txtKontakt;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnSacuvaj() {
        return btnSacuvaj;
    }

    public JComboBox getCmbUplacuje() {
        return cmbUplacuje;
    }

    public JTextField getTxtDatR() {
        return txtDatR;
    }

    public JTextField getTxtIme() {
        return txtIme;
    }

    public JTextField getTxtJMBG() {
        return txtJMBG;
    }

    public JTextField getTxtKontakt() {
        return txtKontakt;
    }

    public JTextField getTxtPrezime() {
        return txtPrezime;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }
    
    

}
