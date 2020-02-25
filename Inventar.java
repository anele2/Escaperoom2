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
public class Inventar
{
    /** Farben fuer die GUI. 3 Arten von Blau + Grau + Braun */
        Color hellBlau = new Color(225, 236, 255);
        Color blau = new Color(205, 224, 255);
        Color dunkelBlau = new Color(191, 215, 255);
        Color grau = new Color(180, 180, 180);
        Color braun = new Color(230, 176, 170);
    Container inventarCont;
    /**
     * Konstruktor für Objekte der Klasse Inventar
     */
    public Inventar()
    {
        inventarCont=new Container();
    }
    
    public void buttonInventar()
    {
        /** Erstellt einen unfunktionalen Platzhalter, bis ein funktionsfÃ¤higes Inventar vorhanden ist*/
        JPanel inventarflaeche = new JPanel();
        FlowLayout inventarLayout = new FlowLayout();
        inventarflaeche.setLayout(inventarLayout);
        JButton inventar1 = new JButton("Speicher1");
        /** Test-Zettel, erstmal nur zum Testen des Inventars*/
            inventar1.addActionListener(new ActionListener() 
                    {
                        public void actionPerformed(ActionEvent e) { //zettelBetrachtenWechsel();
                        }
                    }     
                    ); 
        JButton inventar2 = new JButton("Speicher2");
        JButton inventar3 = new JButton("Speicher3");
        inventarflaeche.add(inventar1);
        inventarflaeche.add(inventar2);
        inventarflaeche.add(inventar3);
        inventarflaeche.setBackground(braun);
        inventar1.setBackground(braun);
        inventar2.setBackground(braun);
        inventar3.setBackground(braun);
        
            JButton ansichtSchl = new JButton("Ansicht schliessen");
            ansichtSchl.addActionListener(new ActionListener() 
                    {
                        public void actionPerformed(ActionEvent e) { //wandWechsel(spieler.blickrichtung)
                        }
                    }     
                    ); 
                    inventarflaeche.add(ansichtSchl);
                    ansichtSchl.setBackground(braun);
        //fenster.add(inventarflaeche, BorderLayout.SOUTH);                  
    }
    /**
    public void zettelBetrachtenWechsel()
    {
        fenster.remove(aktuelleWand); //ZunÃ¤chst wird die alte Wand entfernt
        aktuelleWand = zettel1.getTextLabel(); 
        fenster.add(aktuelleWand, BorderLayout.CENTER);
        fenster.pack(); //Kriege noch nicht hin, das Fenster verlÃ¤sslich zu updaten, ohne es zu "packen"
        fenster.setSize(1000,750); //Hier gibt es bestimmt eine schoenere LÃ¶sung 
    }
    */
    public Container getInventarCont()
    {
        return inventarCont;
    }
}
