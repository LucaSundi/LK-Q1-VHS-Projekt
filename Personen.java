/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 05.09.2019
 * @author 
 */

public class Personen {
  
  // Anfang Attribute
  protected String nName;
  protected String vName;
  protected int alter;
  // Ende Attribute
  
  public Personen (String pNName, String pVName, int pAlter) {
    this.nName = pNName;
    this.vName = pVName;
    this.alter = pAlter;
  }

  // Anfang Methoden
  public String getNName() {
    return nName;
  }

  public String getVName() {
    return vName;
  }

  public int getAlter() {
    return alter;
  }

  // Ende Methoden
} // end of Personen

