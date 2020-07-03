/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.controller.administrator;

import domain.Administrator;
import domain.Klijent;
import domain.Zaduzivanje;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ui.view.administrator.PanelKlijent;
import ui.view.administrator.PanelPrikazKlijenta;
import ui.view.components.TableZaduzenjaKlijenta;
import ui.view.controller.UIController;

/**
 *
 * @author Vidan
 */
public class PanelPrikazKlijentaController {

    private PanelKlijent panelKlijent;
    private PanelPrikazKlijenta panelPrikazKlijenta;
    private Klijent klijent;
    private TableZaduzenjaKlijenta tableZaduzenjaKlijenta;
    private List<Zaduzivanje> zaduzenja;
    private Administrator administrator;

    public PanelPrikazKlijentaController(PanelKlijent panelKlijent, Administrator administrator) {
        this.panelKlijent = panelKlijent;
        this.administrator = administrator;
        postaviPokazivac();
    }

    private void postaviPokazivac() {
        panelKlijent.getBtnSearch().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    pretraziKorisnika();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(panelKlijent, ex.getMessage(), "Greska!", WIDTH);
                }
            }
        });
    }

    private void pretraziKorisnika() throws Exception {
        klijent = UIController.getInstance().pretraziKlijenta(panelKlijent.getTxtImeUser().getText());
        System.out.println(klijent.toString());
        if (klijent.getSifraKL() != 0) {
            zaduzenja = UIController.getInstance().vratiZaduzenja(klijent);
            panelPrikazKlijenta = new PanelPrikazKlijenta();
            postaviPokazivacePrikaz();
            popuniPanel();
            panelKlijent.add(panelPrikazKlijenta, BorderLayout.CENTER);
        }
    }

    private void postaviPokazivacePrikaz() {
        panelPrikazKlijenta.getBtnProduziClanarinu().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduziClanarinu();
            }
        });

        panelPrikazKlijenta.getBtnGodinuDana().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produziClanarinuGodinuDana();
            }
        });
        panelPrikazKlijenta.getBtnSestMeseci().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produziClanarinuSestMeseci();
            }
        });
        panelPrikazKlijenta.getBtnTriMeseca().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produziClanarinuTriMeseca();
            }
        });
        panelPrikazKlijenta.getBtnRazduzi().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razduziZaduzivanje();
            }
        });

        panelPrikazKlijenta.getBtnOdobrii().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odobriZaduzivanje();
            }

        });

        panelPrikazKlijenta.getBtnSacuvaj().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacuvajZaduzivanja();
            }
        });
    }

    private void popuniPanel() {
        panelPrikazKlijenta.getTxtIme().setText(klijent.getIme());
        panelPrikazKlijenta.getTxtPrezime().setText(klijent.getPrezime());
        panelPrikazKlijenta.getTxtKontakt().setText(klijent.getKontakt() + "");
        panelPrikazKlijenta.getTxtUsername().setText(klijent.getUserName());
        SimpleDateFormat s = new SimpleDateFormat("dd.MM.yyyy.");
        panelPrikazKlijenta.getTxtClanarinaDo().setText(s.format(klijent.getClanarina()));
        if (klijent.getClanarina().before(new Date())) {
            panelPrikazKlijenta.getTxtClanarinaDo().setSelectedTextColor(Color.red);
        }
        panelPrikazKlijenta.getTxtDatumR().setText(s.format(klijent.getDatumRodjenja()));
        tableZaduzenjaKlijenta = new TableZaduzenjaKlijenta(zaduzenja);
        panelPrikazKlijenta.getTblZad().setModel(tableZaduzenjaKlijenta);
    }

    private void btnProduziClanarinu() {
        panelPrikazKlijenta.getBtnGodinuDana().setEnabled(true);
        panelPrikazKlijenta.getBtnSestMeseci().setEnabled(true);
        panelPrikazKlijenta.getBtnTriMeseca().setEnabled(true);
        panelPrikazKlijenta.getBtnProduziClanarinu().setEnabled(false);
    }

    private void produziClanarinuGodinuDana() {
        panelPrikazKlijenta.getBtnGodinuDana().setEnabled(false);
        panelPrikazKlijenta.getBtnSestMeseci().setEnabled(false);
        panelPrikazKlijenta.getBtnTriMeseca().setEnabled(false);
        Date datum = new Date();
        Calendar myCal = Calendar.getInstance();
        myCal.setTime(datum);
        myCal.add(Calendar.MONTH, +12);
        datum = myCal.getTime();
        klijent.setClanarina(datum);
        produziClanarinu();
    }

    private void produziClanarinuSestMeseci() {
        panelPrikazKlijenta.getBtnGodinuDana().setEnabled(false);
        panelPrikazKlijenta.getBtnSestMeseci().setEnabled(false);
        panelPrikazKlijenta.getBtnTriMeseca().setEnabled(false);
        Date datum = new Date();
        Calendar myCal = Calendar.getInstance();
        myCal.setTime(datum);
        myCal.add(Calendar.MONTH, +6);
        datum = myCal.getTime();
        klijent.setClanarina(datum);
        produziClanarinu();
    }

    private void produziClanarinuTriMeseca() {
        panelPrikazKlijenta.getBtnGodinuDana().setEnabled(false);
        panelPrikazKlijenta.getBtnSestMeseci().setEnabled(false);
        panelPrikazKlijenta.getBtnTriMeseca().setEnabled(false);
        Date datum = new Date();
        Calendar myCal = Calendar.getInstance();
        myCal.setTime(datum);
        myCal.add(Calendar.MONTH, +3);
        datum = myCal.getTime();
        klijent.setClanarina(datum);
        produziClanarinu();
    }

    private void razduziZaduzivanje() {
        if (panelPrikazKlijenta.getTblZad().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(panelPrikazKlijenta, "Morate izabrati neko zaduzivanje", "Greska!", WIDTH);
        } else {
            try {
                tableZaduzenjaKlijenta.razduzi(panelPrikazKlijenta.getTblZad().getSelectedRow());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelPrikazKlijenta, ex.getMessage(), "Greska!", WIDTH);
            }
        }
    }

    private void odobriZaduzivanje() {
        if (panelPrikazKlijenta.getTblZad().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(panelPrikazKlijenta, "Morate izabrati neko zaduzivanje", "Greska!", WIDTH);
        } else {
            try {
                tableZaduzenjaKlijenta.odobri(panelPrikazKlijenta.getTblZad().getSelectedRow(), administrator);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panelPrikazKlijenta, ex.getMessage(), "Greska!", WIDTH);
            }
        }
    }

    private void sacuvajZaduzivanja() {
        try {
            UIController.getInstance().sacuvajZaduzivanja(tableZaduzenjaKlijenta.getZaduzanja());
            JOptionPane.showMessageDialog(panelPrikazKlijenta, "Zapamceno", "Uspesno!", WIDTH);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelPrikazKlijenta, ex.getMessage(), "Greska!", WIDTH);
        }
    }

    private void produziClanarinu() {
        try {
            UIController.getInstance().produziClanarinu(klijent);
            JOptionPane.showMessageDialog(panelPrikazKlijenta, "Zapamceno", "Uspesno!", WIDTH);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelPrikazKlijenta, ex.getMessage(), "Greska!", WIDTH);
        }
    }

}
