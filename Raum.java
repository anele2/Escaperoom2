/**
 * Ein Raum des Spieles. Besitzt 4 Räume und ist quadratisch. 
 * 
 * @Tim Jascheck
 * @11.02.2020
 */
public class Raum
{
    //Vier Variablen für die 4 Wände des quadratischen Raumes
    protected Wand wandN;
    protected Wand wandO;
    protected Wand wandS;
    protected Wand wandW;
    //Damit Probleme in dem Code leichter verortet werden können
    private Wand error = new Wand("Norden","src/wandRot.jpg");
    /**
     * Konstruktor für Objekte der Klasse Raum
     */
    public Raum()
    {
        //Erstellt vier Wände mit den dementsprechent benannten JLabels
        wandN=new Wand("Norden","src/wandBlau.jpg");
        wandO=new Wand("Osten","src/wandGelb.jpg");
        wandS=new Wand("Sueden","src/wandRot.jpg");
        wandW=new Wand("Westen","src/wandGruen.jpg");
    }

    /**
     * Zum Wände-Benuzten
     * @param  himmelsrichtung gibt die Himmelsrichtung (und damit die Wand) an, die abgefragt wird. Zahlen von 0-3, zuordnung siehe Dokumentation "SpielGUI"
     * @return liefert die abgefragte Wand
     */
    public Wand getWand(int himmelsrichtung)
    {
        if(himmelsrichtung == 0){return wandN;}
        if(himmelsrichtung == 1){return wandO;}
        if(himmelsrichtung == 2){return wandS;}
        if(himmelsrichtung == 3){return wandW;}
        else{return error;}      
    }
}
