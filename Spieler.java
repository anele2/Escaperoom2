import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.Color;
/**
 * Spieler-Klasse. Kann mit der Gui interagieren. 
 * 
 * @Tim Jascheck 
 * @21.02.2020
 */
public class Spieler
{
    int blickrichtung;
    Inventar inventar=new Inventar();
    /**
     * Konstruktor für Objekte der Klasse Spieler
     */
    public Spieler()
    {
        blickrichtung = 0;
    }

    /**
     * Nach Links schauen.
     */
    public void nachLinksKucken()
    {
        blickrichtung = (blickrichtung+3)%4; //Damit der Wert der Blickrichtung nicht Ã¼ber 3 steigt wird der Operator % (Rest) verwedet
    }
    
    /**
     * Nach Rechts schauen.
     */
    public void nachRechtsKucken()
    {
        blickrichtung = (blickrichtung+1)%4; //Damit der Wert der Blickrichtung nicht Ã¼ber 3 steigt wird der Operator % (Rest) verwedet 
    }   
    
    public int getBlickrichtung()
    {
        return blickrichtung;
    }
    
    public Inventar getInventar()
    {
        return inventar;
    }
    
}
