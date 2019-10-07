/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 05.09.2019
 * @author 
 */

public class Teilnehmer extends Personen {
  
  // Anfang Attribute
  private int anzKurse;
  private Kurs [] meineKurse;
  
  // Ende Attribute
  
  public Teilnehmer(String pNName, String pVName, int pALter) {
    super(pNName, pVName, pALter) ;
    this.anzKurse = 0;
    this.meineKurse= new Kurs [5];
  }

  // Anfang Methoden
  public int getAnzKurse() {
    return anzKurse;
  }

  public void setAnzKurse(int pAnzKurse) {
    // TODO hier Quelltext einfügen
    
  }

     public String getVName(){
       
   return this.vName; 
   }
  
  public String getNName()
  {
     return this.nName;
    
    }
  
  public boolean belegt(int pKursSlot)
  {
    boolean moeglich2;
     if (meineKurse [pKursSlot] == null )
    {
       moeglich2 = false;
      }
    else
    {
       moeglich2= true;
      }
    return moeglich2;
    
    
    }
  
  
  
  public void kursBelegen1(Kurs pKurs, int pKursSlot)
  {
      //Abfrage ob Kursslot belegt ist fehlt
    
   if (!this.belegt(pKursSlot))
   {
               
    if(pKurs.teilnahmeMoeglich())
    {
      System.out.println("Sie werden angemeldet.");
       meineKurse [pKursSlot]= pKurs;
      anzKurse++;
        pKurs.teilnehmerHinzufügen(this.getNName(), this.getVName());
      
      }
       else
    {
       System.out.println("Sie können nicht angemeldet werden!");
      }
   }
     else
      {
        
    
      System.out.println ( "Dieser Kursslot ist bereits belget! Zum überschreiben bitte überschreiben auswählen. Wenn sie einen weiteren Kurs anlegen wollen, dann wählen sie bitte einen anderen Kursslot aus!");
     }
    }
  
  public int sucheKurs(Kurs pKurs)
  {
      int suchIndex = 0;
    while (suchIndex < meineKurse.length && !meineKurse[suchIndex].equals(pKurs) ) { 
                     suchIndex ++;
    } // end of while
    
    if (suchIndex == meineKurse.length) {
                     suchIndex = -1;
      System.out.println("Kurs konnte nicht gefunden werden!")    ;
    } 
    System.out.println(suchIndex);
    return suchIndex;
    
    }
  
  public void teilnehmerAbmeldenKurs(Kurs pKurs, int pIndex)
  {
   String lVorname = getVName();
   String lNachname = getNName();
  
    pKurs.teinehmerAbmelden(lVorname, lNachname);
    
    int index = pIndex;
    Kurs abmeldenVon = meineKurse[index];
    for (int i = index + 1;index < meineKurse.length; i++ ) {
      this.meineKurse[i-1] = this.meineKurse[i];
      meineKurse[i] = null;
    } // end of for
  
    System.out.println("Abmeldung abgeschlossen (2/2). Sie wurden von dem Kurs '" + abmeldenVon + "' abgemeldet.");
    
    
  }

  // Ende Methoden
} 
