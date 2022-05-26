/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class panelImage extends JPanel{

    @Override
    public void paint(Graphics g){
        Dimension dimension = this.getSize();
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/a4.jpg"));
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintChildren(g); "↖"
    }
 
    
}
