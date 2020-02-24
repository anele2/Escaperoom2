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

    /**
     * Konstruktor für Objekte der Klasse Gegenstand
     */
    public Gegenstand(String bildname)
    {
        try {
            aussehen = new BildComponent(ImageIO.read(getClass().getResourceAsStream(bildname)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        aussehen.setSize(100,100);
    }
    
    public BildComponent getAussehen()
    {
        return aussehen;
    }
}
