/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.administrator;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author vidan
 */
public class PanelPrikazKlijenta extends javax.swing.JPanel {

    /**
     * Creates new form PanelPrikazKlijenta
     */
    public PanelPrikazKlijenta() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblZad = new javax.swing.JTable();
        txtPrezime = new javax.swing.JTextField();
        txtIme = new javax.swing.JTextField();
        txtDatumR = new javax.swing.JTextField();
        txtClanarinaDo = new javax.swing.JTextField();
        txtKontakt = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnProduziClanarinu = new javax.swing.JButton();
        btnSacuvaj = new javax.swing.JButton();
        btnTriMeseca = new javax.swing.JButton();
        btnSestMeseci = new javax.swing.JButton();
        btnGodinuDana = new javax.swing.JButton();
        btnRazduzi = new javax.swing.JButton();
        btnOdobrii = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 82, 82));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(212, 221, 225));
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(212, 221, 225));
        jLabel4.setText("Kontakt:");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(212, 221, 225));
        jLabel5.setText("Clanarina vazi do:");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(212, 221, 225));
        jLabel6.setText("Datum rodjenja:");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(212, 221, 225));
        jLabel7.setText("Prezime:");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(212, 221, 225));
        jLabel8.setText("Ime:");

        tblZad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblZad);

        txtPrezime.setEditable(false);
        txtPrezime.setBackground(new java.awt.Color(212, 221, 225));
        txtPrezime.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtPrezime.setForeground(new java.awt.Color(45, 48, 51));

        txtIme.setEditable(false);
        txtIme.setBackground(new java.awt.Color(212, 221, 225));
        txtIme.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtIme.setForeground(new java.awt.Color(45, 48, 51));

        txtDatumR.setEditable(false);
        txtDatumR.setBackground(new java.awt.Color(212, 221, 225));
        txtDatumR.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtDatumR.setForeground(new java.awt.Color(45, 48, 51));

        txtClanarinaDo.setEditable(false);
        txtClanarinaDo.setBackground(new java.awt.Color(212, 221, 225));
        txtClanarinaDo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtClanarinaDo.setForeground(new java.awt.Color(45, 48, 51));

        txtKontakt.setEditable(false);
        txtKontakt.setBackground(new java.awt.Color(212, 221, 225));
        txtKontakt.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtKontakt.setForeground(new java.awt.Color(45, 48, 51));

        txtUsername.setEditable(false);
        txtUsername.setBackground(new java.awt.Color(212, 221, 225));
        txtUsername.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(45, 48, 51));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(212, 221, 225));
        jLabel9.setText("Zauzenja klijenta:");

        btnProduziClanarinu.setBackground(new java.awt.Color(212, 221, 225));
        btnProduziClanarinu.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnProduziClanarinu.setForeground(new java.awt.Color(45, 48, 51));
        btnProduziClanarinu.setIcon(new javax.swing.ImageIcon("C:\\Users\\vidan\\Documents\\NetBeansProjects\\SeminarskiPS\\SSBiblioteka\\SSBibliotekaClient\\src\\images\\icons8_update_24px.png")); // NOI18N
        btnProduziClanarinu.setText("Produzi clanarinu klijentu");

        btnSacuvaj.setBackground(new java.awt.Color(212, 221, 225));
        btnSacuvaj.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnSacuvaj.setForeground(new java.awt.Color(45, 48, 51));
        btnSacuvaj.setIcon(new javax.swing.ImageIcon("C:\\Users\\vidan\\Documents\\NetBeansProjects\\SeminarskiPS\\SSBiblioteka\\SSBibliotekaClient\\src\\images\\icons8_save_24px.png")); // NOI18N
        btnSacuvaj.setText("Sacuvaj izmene");

        btnTriMeseca.setBackground(new java.awt.Color(212, 221, 225));
        btnTriMeseca.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnTriMeseca.setForeground(new java.awt.Color(45, 48, 51));
        btnTriMeseca.setText("Tri meseca");
        btnTriMeseca.setEnabled(false);

        btnSestMeseci.setBackground(new java.awt.Color(212, 221, 225));
        btnSestMeseci.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnSestMeseci.setForeground(new java.awt.Color(45, 48, 51));
        btnSestMeseci.setText("Sest meseci");
        btnSestMeseci.setEnabled(false);

        btnGodinuDana.setBackground(new java.awt.Color(212, 221, 225));
        btnGodinuDana.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnGodinuDana.setForeground(new java.awt.Color(45, 48, 51));
        btnGodinuDana.setText("Godinu dana");
        btnGodinuDana.setEnabled(false);

        btnRazduzi.setBackground(new java.awt.Color(212, 221, 225));
        btnRazduzi.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnRazduzi.setForeground(new java.awt.Color(45, 48, 51));
        btnRazduzi.setText("Razduzi");

        btnOdobrii.setBackground(new java.awt.Color(212, 221, 225));
        btnOdobrii.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnOdobrii.setForeground(new java.awt.Color(45, 48, 51));
        btnOdobrii.setText("Odobri");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDatumR, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClanarinaDo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKontakt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnProduziClanarinu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSestMeseci, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(btnTriMeseca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGodinuDana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnOdobrii, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRazduzi, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnSacuvaj, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDatumR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClanarinaDo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKontakt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnProduziClanarinu)
                        .addGap(21, 21, 21)
                        .addComponent(btnTriMeseca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSestMeseci)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGodinuDana))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRazduzi)
                    .addComponent(btnOdobrii))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGodinuDana;
    private javax.swing.JButton btnOdobrii;
    private javax.swing.JButton btnProduziClanarinu;
    private javax.swing.JButton btnRazduzi;
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JButton btnSestMeseci;
    private javax.swing.JButton btnTriMeseca;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblZad;
    private javax.swing.JTextField txtClanarinaDo;
    private javax.swing.JTextField txtDatumR;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtKontakt;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnGodinuDana() {
        return btnGodinuDana;
    }

    public void setBtnGodinuDana(JButton btnGodinuDana) {
        this.btnGodinuDana = btnGodinuDana;
    }

    public JButton getBtnProduziClanarinu() {
        return btnProduziClanarinu;
    }

    public JButton getBtnRazduzi() {
        return btnRazduzi;
    }

    public JButton getBtnOdobrii() {
        return btnOdobrii;
    }

    public JButton getBtnSestMeseci() {
        return btnSestMeseci;
    }

    public JButton getBtnTriMeseca() {
        return btnTriMeseca;
    }

    public JTable getTblZad() {
        return tblZad;
    }

    public JTextField getTxtClanarinaDo() {
        return txtClanarinaDo;
    }

    public JTextField getTxtDatumR() {
        return txtDatumR;
    }

    public JTextField getTxtIme() {
        return txtIme;
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

    public JButton getBtnSacuvaj() {
        return btnSacuvaj;
    }

}