import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.Color;
/**
 * Superklasse von den Gegenstaenden. Vorerst noch ein Platzhalter.
 * 
 * @Tim Jascheck @Elena Nehse
 * @21.02.2020
 */
public class Gegenstand
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private BildComponent aussehen;
    private int breite;
    private int höhe;
    /**
     * Konstruktor für Objekte der Klasse Gegenstand
     */
    public Gegenstand(String bildDateipfad)
    {
        try 
        {
            aussehen = new BildComponent(ImageIO.read(getClass().getResourceAsStream(bildDateipfad)));
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        
        GridLayout wandLayout = new GridLayout(1,1);
        aussehen.setLayout(wandLayout);
        breite = aussehen.getWidth();
        höhe = aussehen.getHeight();
        aussehen.setSize(100,100);
    }
    
    
    public BildComponent getAussehen()
    {
        return aussehen;
    }
}
