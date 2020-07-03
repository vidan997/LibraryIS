/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.controller.klijent;

import domain.Klijent;
import ui.view.klijent.MainFrame;

/**
 *
 * @author Vidan
 */
public class MainFrameController {

    MainFrame mainFrame;
    Klijent klijent;
    
    public MainFrameController(MainFrame mainFrame, Klijent klijent) {
        this.klijent=klijent;
        this.mainFrame=mainFrame;
    }
    
}
