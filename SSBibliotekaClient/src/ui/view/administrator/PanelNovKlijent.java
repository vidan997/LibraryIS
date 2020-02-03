/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.administrator;

import communication.CommunicationController;
import domain.Klijent;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
        jButton3 = new javax.swing.JButton();

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

        jButton3.setBackground(new java.awt.Color(212, 221, 225));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(45, 48, 51));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vidan\\Documents\\NetBeansProjects\\SeminarskiPS\\SSBiblioteka\\SSBibliotekaClient\\src\\images\\icons8_save_24px.png")); // NOI18N
        jButton3.setText("Sacuvaj klijenta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                            .addComponent(cmbUplacuje, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addComponent(jButton3)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Klijent klijent = new Klijent();
        klijent.setIme(txtIme.getText());
        klijent.setPrezime(txtPrezime.getText());
        try {
            klijent.setJMBG(Integer.parseInt(txtJMBG.getText()));
            klijent.setKontakt(Integer.parseInt(txtKontakt.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Kontakt i jmbg moraju biti brojevi", "Greska", WIDTH);
        }
        klijent.setUserName(txtUsername.getText());

        try {
            klijent.setDatumRodjenja(new SimpleDateFormat("dd.MM.yyyy.").parse(txtDatR.getText()));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Datum rodjenja mora biti u formatu dd.MM.yyyy.", "Greska!", WIDTH);
        }
        Date datum = new Date();
        Calendar myCal = Calendar.getInstance();
        myCal.setTime(datum);
        if (cmbUplacuje.getSelectedItem().equals("3 meseca")) {
            myCal.add(Calendar.MONTH, +3);
        } else if (cmbUplacuje.getSelectedItem().equals("6 meseci")) {
            myCal.add(Calendar.MONTH, +6);
        } else if (cmbUplacuje.getSelectedItem().equals("Godinu dana")) {
            myCal.add(Calendar.MONTH, +12);
        }
        datum = myCal.getTime();
        klijent.setClanarina(datum);
        try {
            klijent.setIsteklaClanarina(false);
            klijent.setPassword("123");
            klijent = CommunicationController.getInstance().sacuvajNovogKlijenta(klijent);
            JOptionPane.showMessageDialog(this, "Sacuvan je korisnik sa ID: " + klijent.getSifraKL(), "Uspesno!", WIDTH);
            txtIme.setText("");
            txtPrezime.setText("");
            txtDatR.setText("");
            txtKontakt.setText("");
            txtJMBG.setText("");
            txtUsername.setText("");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Greska!", WIDTH);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Greska!", WIDTH);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbUplacuje;
    private javax.swing.JButton jButton3;
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
}
