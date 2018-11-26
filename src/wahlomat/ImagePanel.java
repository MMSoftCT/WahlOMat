/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wahlomat;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * extended jpanel class for images
 * @author amederake
 */
public class ImagePanel extends JPanel
{
    // class variables
    private Image img;
    
    /**
     * constructor for filename
     * @param file // path of the imagefile
     */
    public ImagePanel(String file)
    {
        this.img = new ImageIcon(file).getImage();
    }

    /**
     * constructor for preloaded image
     * @param img // preloaded Image
     */
    public ImagePanel(Image img)
    {
        this.img = img;
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
        this.setPreferredSize(size);
        this.setMinimumSize(size);
        this.setMaximumSize(size);
        this.setSize(size);
        this.setLayout(null);

    }

    /**
     * draw the image
     * @param g 
     */
    public void paintComponent(Graphics g)
    {
        g.drawImage(img, 0, 0, null);
    }

}
