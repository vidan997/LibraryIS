/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.controller.logIn;

import communication.CommunicationController;
import domain.Administrator;
import domain.Klijent;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ui.view.administrator.MainFrameA;
import ui.view.controller.administrator.MainFrameAController;
import ui.view.controller.klijent.MainFrameController;
import ui.view.klijent.MainFrame;
import ui.view.logIn.MainFormLogIn;
import ui.view.controller.UIController;
/**
 *
 * @author Vidan
 */
public class MainFormLogInController {

    MainFormLogIn main;

    public MainFormLogInController(MainFormLogIn main) {
        this.main = main;
        postaviOsluskivace();
    }

    private void postaviOsluskivace() {
        main.setLocationRelativeTo(null);
        main.setResizable(false);
        main.getBtnKlijent().setSelected(true);

        main.getBtnAdmin().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (main.getBtnAdmin().isSelected()) {
                    main.getBtnKlijent().setSelected(false);
                }
            }
        });

        main.getBtnKlijent().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (main.getBtnKlijent().isSelected()) {
                    main.getBtnAdmin().setSelected(false);
                }
            }
        });

        main.getBtnLogIn().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (main.getTxtUser().getText().isEmpty() || main.getTxtPass().getText().isEmpty()) {
                    JOptionPane.showMessageDialog(main, "Unesite username i sifru.", "Greska", WIDTH);
                    return;
                }
                if (main.getBtnKlijent().isSelected()) {
                    try {
                        Klijent klijent = (Klijent) UIController.getInstance().logIn(main.getTxtUser().getText(), main.getTxtPass().getText(), "klijent");
                        MainFrame k = new MainFrame(klijent);
                        new MainFrameController(k, klijent);
                        main.dispose();
                    } catch (IOException ex) {
                        Logger.getLogger(MainFormLogIn.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(main, ex.getMessage(), "Greska", WIDTH);
                    }
                } else if (main.getBtnAdmin().isSelected()) {
                    try {
                        Administrator administrator = (Administrator) UIController.getInstance().logIn(main.getTxtUser().getText(), main.getTxtPass().getText(), "admin");
                        MainFrameA k = new MainFrameA(administrator);
                        new MainFrameAController(k, administrator);
                        main.dispose();
                    } catch (IOException ex) {
                        Logger.getLogger(MainFormLogIn.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(main, ex.getMessage(), "Greska", WIDTH);
                    }
                }
            }
        });

        main.getBtnExit().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(1);
            }
        });

    }

}
