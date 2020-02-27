import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.Color;
/**
 * Eine Wand eines Raumes. Hier befinden sich GegenstÃ¤nde und anderes. 
 * 
 * @Tim Jascheck
 * @11.02.2020
 */
public class Wand
{    
    private JLabel test;    //Lediglich fuer die Prototyp-Phase
    private BildComponent wandCont; //Wird im "Center" der Main-GUI angezeigt
    private ArrayList<Gegenstand> gegenstaende = new ArrayList<Gegenstand>();
    /**
     * Konstruktor fÃ¼r Objekte der Klasse Wand
     * @param String name : liefert den Text fÃ¼r das Test-Label
     */
    public Wand(String name, String bildname)
    {
        try {
    		wandCont = new BildComponent(ImageIO.read(getClass().getResourceAsStream(bildname)));
    		wandCont.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        GridLayout wandLayout = new GridLayout(1,1);
        wandCont.setLayout(wandLayout);
        
        //Erzeugt und fÃ¼gt ein JLabel dem Container zu.
        test=new JLabel(name, JLabel.CENTER);
        test.setFont(new Font("Serif", Font.BOLD, 28)); 
        wandCont.add(test);
    }
    
    /**
     * Liefert eine Referenz auf den Container "wand"
     */
    public Container getWand()
    {
        return wandCont; 
    }    
}