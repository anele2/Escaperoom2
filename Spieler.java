
/**
 * Spieler-Klasse. Kann mit der Gui interagieren. 
 * 
 * @Tim Jascheck 
 * @21.02.2020
 */
public class Spieler
{
    int blickrichtung;
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
    
}
