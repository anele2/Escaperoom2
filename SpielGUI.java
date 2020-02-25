import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.Color;
/**
 * SpielGUI bring die einzelnen ELemente des Spieles durch die beutzung der GUI fÃ¼r den Spieler zusammen.
 * 
 * @Tim Jascheck
 * @11.02.2020
 */
public class SpielGUI
{
    /**
     * Blickrichtungen: Fuer Blickrichtungen werden in Zukunft diese Zahlen als Synonyme verwendet.
     *
        Norden = 0;
        Osten = 1;
        Sueden= 2;
        Westen = 3;
     */
    
    /**Der Spieler*/
    private Spieler spieler=new Spieler();
    
    /** Die Raeume des Spiels */  
    private Raum raumEins;
    
    /** Hier spielt die Musik */
    private JFrame fenster;
    
    /** Aktuelle Wand. */ 
    private Container aktuelleWand;
    
    /** Darstellung des Inventars */
    
    private Container inventarCont=spieler.getInventar().getInventarCont();
    
    /** Gegenstaende */
    
    private Zettel zettel1=new Zettel("Hier steht der Text des Zettels; also der Hinweis für das Snape-Raetsel");
    
    /** Farben fuer die GUI. 3 Arten von Blau + Grau + Braun */
        Color hellBlau = new Color(225, 236, 255);
        Color blau = new Color(205, 224, 255);
        Color dunkelBlau = new Color(191, 215, 255);
        Color grau = new Color(180, 180, 180);
        Color braun = new Color(230, 176, 170);
    
        
    public static void main(String[] args) {
        new SpielGUI();
    }
        
    /**
     * Konstruktor fuer die Spiel-GUI
     */
    public SpielGUI()
    {        
        raumEins = new Raum(); //Vorerst nur ein Raum
        fensterErzeugen(); 
    }

    /**
     * Erzeugt die GUI.
     */
    public void fensterErzeugen()
    {
        fenster = new JFrame("Escape-Room");        
        Container contentPane = fenster.getContentPane();
        
        /** Ein Border-Layout schien als Grundbaustein des Spieles sinnvoll*/
        BorderLayout mainLayout = new BorderLayout();
        fenster.setLayout(mainLayout);

        aktuelleWand = raumEins.getWand(0).getWand();
        fenster.add(aktuelleWand, BorderLayout.CENTER);
        
        /** Erstellen die Buttons, mit denen man sich im Raum bewegen kann. */
        nachRechtsButton();
        nachLinksButton();
        
        /** Erstellt einen unfunktionalen Platzhalter, bis ein funktionsfÃ¤higes Inventar vorhanden ist*/
        buttonInventar();
        
        /** Aufbau abgeschlossen - Komponenten arrangieren lassen */
        fenster.setSize(1000,750); //An den Zahlen kann nochmal gefeilt werden
        fenster.setVisible(true);
    }
    
    /**
     * Erstellen die Buttons, mit denen man sich im Raum bewegen kann/umschauen kann. 
     */
    public void nachRechtsButton()
    {
        JButton nachRechts = new JButton("->");  //Vielleicht kann man sich hier spÃ¤ter etwas schÃ¶neres Ã¼berlegen
            nachRechts.setFont(new Font("Serif", Font.BOLD, 16));  //Schriftanpassung
            fenster.add(nachRechts, BorderLayout.EAST);                      
                nachRechts.addActionListener(new ActionListener() 
                {
                    public void actionPerformed(ActionEvent e) { spieler.nachRechtsKucken(); wandWechsel(spieler.getBlickrichtung());}
                }     
                );
                nachRechts.setBackground(grau); //Farbanpassung
            }    
    public void nachLinksButton()
    {
        JButton nachLinks = new JButton("<-");  //Vielleicht kann man sich hier spÃ¤ter etwas schÃ¶neres Ã¼berlegen
            nachLinks.setFont(new Font("Serif", Font.BOLD, 16));  //Schriftanpassung
            fenster.add(nachLinks, BorderLayout.WEST);                    
                nachLinks.addActionListener(new ActionListener() 
                {
                    public void actionPerformed(ActionEvent e) { spieler.nachLinksKucken(); wandWechsel(spieler.getBlickrichtung());}
                }     
                ); 
                nachLinks.setBackground(grau); //Farbanpassung
            }
            
    /**
     * Zeige eine bestimmte Wand
     * @param himmelsrichtung Gebe die Himmelsrichtung an, dessen Wand betrachtet wird. (0-3 = Norden-Westen)
     */
    public void wandWechsel(int himmelsrichtung)
    {
        fenster.remove(aktuelleWand); //ZunÃ¤chst wird die alte Wand entfernt
        aktuelleWand = raumEins.getWand(himmelsrichtung).getWand(); //Zugriff Ã¼ber den Raum auf die Wand. SpÃ¤ter muss noch ein "aktueller Raum" als Attribut hinzugefÃ¼gt werden
        fenster.add(aktuelleWand, BorderLayout.CENTER);
        fenster.pack(); //Kriege noch nicht hin, das Fenster verlÃ¤sslich zu updaten, ohne es zu "packen"
        fenster.setSize(1000,750); //Hier gibt es bestimmt eine schoenere LÃ¶sung 
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
                        public void actionPerformed(ActionEvent e) { zettelBetrachtenWechsel();}
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
                        public void actionPerformed(ActionEvent e) { wandWechsel(spieler.blickrichtung);}
                    }     
                    ); 
                    inventarflaeche.add(ansichtSchl);
                    ansichtSchl.setBackground(braun);
        fenster.add(inventarflaeche, BorderLayout.SOUTH);                  
    }
    
    public void zettelBetrachtenWechsel()
    {
        fenster.remove(aktuelleWand); //ZunÃ¤chst wird die alte Wand entfernt
        aktuelleWand = zettel1.getTextLabel(); 
        fenster.add(aktuelleWand, BorderLayout.CENTER);
        fenster.pack(); //Kriege noch nicht hin, das Fenster verlÃ¤sslich zu updaten, ohne es zu "packen"
        fenster.setSize(1000,750); //Hier gibt es bestimmt eine schoenere LÃ¶sung 
    }
} 
