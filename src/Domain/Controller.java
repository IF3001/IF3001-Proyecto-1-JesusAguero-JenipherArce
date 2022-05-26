/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import if3001.proyecto.pkg1.jesusaguero.jenipherarce.ControllerData;
import if3001.proyecto.pkg1.jesusaguero.jenipherarce.GUI;
import if3001.proyecto.pkg1.jesusaguero.jenipherarce.GUIData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Controller extends JPanel implements ActionListener
{
    	private GUI g;
        private GUIData h;
       private ControllerData CD;
       int ingresados = 0, match,mismatch,gap;
public  Controller(){
 

 g = new GUI();

  g.setVisible(true);
    initializerActions();
}
public void initializerActions() {
//		
		g.getBHelp().addActionListener(this);
             g.getBSave().addActionListener(this);
              g.getBSave1().addActionListener(this);
					
	}
public void actionPerformed(ActionEvent e) 
	{
            if(e.getSource() == g.getBSave())
   	 	{
                    
                    
                }
            
            
            
            
   	 	
   		if(e.getSource() == g.getBSave1())
   	 	{
                    int verificar = 0;
			int valor = Integer.parseInt(g.getTFMatch().getText());
			if(valor >= -1 && valor <= 2)
			{
				match = valor;
				verificar++;
			}else {
				JOptionPane.showMessageDialog(null,"El valor debe ser mayor a -1 y menor igual a 2");
			}
			
			int valor2 = Integer.parseInt(g.getTFMismatch().getText());
			if(valor2 >= -1 && valor2 <= 2)
			{
				mismatch = valor;
				verificar++;
			}else {
				JOptionPane.showMessageDialog(null,"El valor debe ser mayor a -1 y menor igual a 2");
			}
                        int valor3 = Integer.parseInt(g.getTFGap().getText());
			if(valor3 >= -1 && valor3 <= 2)
			{
				gap = valor;
				verificar++;
			}else {
				JOptionPane.showMessageDialog(null,"El valor debe ser mayor a -1 y menor igual a 2");
			}
   	 		
   	 	}
                if(e.getSource() == g.getBHelp()) 
   	 	{   	 	
   	 		 CD= new ControllerData();   
                         g.dispose();
   	 	}
}}
