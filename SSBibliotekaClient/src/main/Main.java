/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.BorderLayout;
import ui.view.main.MainFrame;
import javax.swing.JFrame;
import ui.controller.Controller;
import ui.view.logIn.MainPanelLog;

/**
 *
 * @author vidan
 */
public class Main {
    
    public static void main(String[] args) {
        Controller controller = new Controller(new MainPanelLog());
        MainFrame frame = new MainFrame();
        frame.add(controller.getPanel(),BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
