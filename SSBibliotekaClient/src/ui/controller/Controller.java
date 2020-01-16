/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.controller;

import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import ui.view.logIn.MainPanelLog;

/**
 *
 * @author vidan
 */
public class Controller {

    MainPanelLog mainPanel;

    public Controller(MainPanelLog panel) {
        mainPanel = panel;
        povezi();
    }

    private void povezi() {
        javax.swing.JLabel btnSignIn = mainPanel.getSignInButton();
        javax.swing.JLabel btnSignUp = mainPanel.getSignUpButton();
        btnSignIn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                mainPanel.switchPnl(true);
            }
        });
        btnSignUp.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                
                mainPanel.switchPnl(false);
            }
        });
    };

    public MainPanelLog getPanel(){
        return mainPanel;
    }
    
}
