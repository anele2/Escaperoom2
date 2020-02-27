import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.Color;
/**
 * Unterklassen und Vererbung sind hier sehr verschieden, da sich die Gegenstaende in ihrer Funktionsweisen stark unterscheiden. Erst noch platzhalter
 * 
 * @Tim Jascheck
 * @21.02.2020
 */
public class Zettel extends Gegenstand
{
    private JLabel zettelLabel;    
    private String text;
    
    
    private BildComponent wandCont; //Wird im "Center" der Main-GUI angezeigt
    
    /**
     * Konstruktor für Objekte der Klasse GegenstandEins
     */
    public Zettel(String textZet)
    {        
        super("src/zettel.jpg",100,100);    
        text = textZet; 
        constructJLabel();              
    }
    
    public void constructJLabel()
    {
        /**
                 * Hintergrundbild für den Zettel, funktiniert aber noch nicht
                try {
            		wandCont = new BildComponent(ImageIO.read(getClass().getResourceAsStream("src/zettel.jpg")));
            		wandCont.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        		} catch (IOException e) {
        			e.printStackTrace();
        		}
                
                GridLayout wandLayout = new GridLayout(1,1);
                wandCont.setLayout(wandLayout);
                wandCont.add(zettelLabel);
                */
        zettelLabel=new JLabel(text, JLabel.CENTER);
        zettelLabel.setFont(new Font("Serif", Font.BOLD, 28));   
    }    
    
    /**
     * @return Liefert das Label vom Zettel zurueck. Wichtig für die anziege in der GUI.
     */
    public JLabel getTextLabel()
    {
        return zettelLabel;
    }
}
