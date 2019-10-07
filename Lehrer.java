/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 05.09.2019
 * @author 
 */

public class Lehrer extends Personen{
  
  // Anfang Attribute
  private String kuerzel;
  private Kurs meinKurs1;
  // Ende Attribute
  
  public Lehrer(String pNName , String pVName, int pAlter, String pKuerzel) { 
    super(pNName, pVName, pAlter);
    this.kuerzel = pKuerzel;
  }

  // Anfang Methoden
  public String getKuerzel() {
    return kuerzel;
  }

  public Kurs getMeinKurs1() {
    return meinKurs1;
  }

  public void kursAnbieten(String pBezeichnung, int pMaxTeilnehmer, String pKürzel) {
    //TODO Quelltext
      meinKurs1 = new Kurs(pBezeichnung, pMaxTeilnehmer, pKürzel);
  }
  public void druckeKursliste(Kurs pKurs)
  {
      meinKurs1.druckeListe()   ;
    }

  // Ende Methoden
} 

