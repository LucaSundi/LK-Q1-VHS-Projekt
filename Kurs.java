/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 05.09.2019
 * @author 
 */

public class Kurs {
  
  // Anfang Attribute
  private String bezeichnung;
  private int teilnehmerZahl;
  private int maxTeilnehmer;
  private String fachlehrer;
  private String [] kursListe;
  // Ende Attribute
  
  

  // Anfang Methoden
  public Kurs(String pBezeichnung, int pmaxTeilnehmer, String pLehrer) { 
    this.bezeichnung = pBezeichnung;
    this.teilnehmerZahl = 00;
    this.maxTeilnehmer = maxTeilnehmer;
    this.fachlehrer = pLehrer;
    this.kursListe = new String [pmaxTeilnehmer];
    
  }                                                                      

  public int getTeilnehmerZahl() {
    return teilnehmerZahl;
  }

  public int getMaxTeilnehmer() {
    return maxTeilnehmer;
  }

  
  

  public void setTeilnehmerZahl(int pTeilnehmer) {
    teilnehmerZahl = pTeilnehmer;
    
  }

  public void setMaxTeilnehmer(int pMaxTeilnehmer) {
    maxTeilnehmer = pMaxTeilnehmer;
    
  }

  public String getFachlehrer() {
    return fachlehrer;
  }
  
  public void teilnehmerHinzufügen(String pNName, String pVName)
  {
    this.kursListe [this.teilnehmerZahl] = pNName +","+ pVName;
     this.teilnehmerZahl++;
    
    }
  
  public boolean teilnahmeMoeglich()
   {
    boolean moeglich;
    if (this.teilnehmerZahl < kursListe.length -1 )       
    {
       moeglich = true;
       System.out.println("Die Teilnahme ist möglich.");
      }
    else
    {
       moeglich = false;
       System.out.println("Die Teilnahme ist leider nicht möglich.");
      }
    return moeglich;
  }
  
  public void druckeListe()
  {
     System.out.println(java.util.Arrays.toString(kursListe));
    }
  
  
  
  public int teinehmerSuche2(String gesVName, String gesNName)
  {
       int suchIndex=0;
    while (suchIndex<kursListe.length && !kursListe[suchIndex].equals(gesNName + "," + gesVName)) { 
                suchIndex++;                                                              
    } // end of while
    if(suchIndex==kursListe.length)
    {
    suchIndex = -1;
      }
               return suchIndex;
    }
  
  public void teinehmerAbmelden(String pVName, String pNName)
  {
     int index = teinehmerSuche2(pVName, pNName);
        System.out.println(index);
    if (index >= 0)
    {
      for (int i=index + 1; i< kursListe.length ; i++) {
         kursListe[i-1]= kursListe[i]  ;
        kursListe[i] = null;
      } // end of for
      this.teilnehmerZahl --;
                                            
      System.out.println("Abmeldung (1/2)") ;
                       
    }
    else
    {
       System.out.println("Abmeldung nicht möglich. Schüler wurde nicht gefunden!");
      }
  
    }
  
  public void sort()
  {
  int links = 0;
    int n = kursListe.length;
    while (links < n) { 
       int min = links;
      for (int i = links + 1; i<n ;i++ ) {
        int l= kursListe[i].compareTo(kursListe[min]) ;
          if (l<0 )
        {
        min = i;
          }
      } // end of for
      String merke1 = kursListe[min];
      String merke2 = kursListe[links];
      kursListe[min] = merke2;
      kursListe[links] = merke1;
    } // end of while
    }

  // Ende Methoden
} // end of Kurs
              
    
  
  
  

  
