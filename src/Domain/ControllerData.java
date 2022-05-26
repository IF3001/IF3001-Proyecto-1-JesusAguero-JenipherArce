/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;


import Gui.GUIData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class ControllerData extends JPanel implements ActionListener {

    private GUIData g;

    public ControllerData() {

        g = new GUIData();
        g.setVisible(true);
        g.Laberinto();
        initializerActions();
    }

    public void initializerActions() {
		g.getbClose().addActionListener(this);
		

    }

    public void actionPerformed(ActionEvent e) {

   	 	
   	 	if(e.getSource() == g.getbClose())
   	 	{
   	 		System.exit(0);	
   	 	}
    }
}
