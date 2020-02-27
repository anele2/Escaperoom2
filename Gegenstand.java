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

    protected BildComponent aussehen;
    protected int xPosition;
    protected int yPosition;
    
    /**
     * Konstruktor für Objekte der Klasse Gegenstand
     */
    public Gegenstand(String bildDateipfad, int ortX, int ortY)
    {
        try 
        {
            aussehen = new BildComponent(ImageIO.read(getClass().getResourceAsStream(bildDateipfad)));
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        
        xPosition = ortX;
        yPosition = ortY;
        //int breite = aussehen.getWidth();
        //int höhe = aussehen.getHeight();
        aussehen.setSize(100,100);
    }
    
    
    public BildComponent getAussehen()
    {
        return aussehen;
    }
    
    public int getXPosition()
    {
        return xPosition;
    }
    
    public int getYPosition()
    {
        return yPosition;
    }
}
