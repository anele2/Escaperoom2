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
    /**
     * Konstruktor für Objekte der Klasse GegenstandEins
     */
    public Zettel()
    {        
        super("src/zettel.jpg");    
        text = "Hier steht der Text des Zettels; also der Hinweis für das Snape-Raetsel";
        zettelLabel=new JLabel(text, JLabel.CENTER);
    }

    /**
     */
    public JLabel getText()
    {
        return zettelLabel;
    }
}
