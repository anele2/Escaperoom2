
/**
 * Unterklassen und Vererbung sind hier sehr verschieden, da sich die Gegenstaende in ihrer Funktionsweisen stark unterscheiden. Erst noch platzhalter
 * 
 * @Tim Jascheck
 * @21.02.2020
 */
public class GegenstandEins extends Gegenstand
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse GegenstandEins
     */
    public GegenstandEins()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
}
