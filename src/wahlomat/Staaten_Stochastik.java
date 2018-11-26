/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wahlomat;

/**
 *
 * @author hvedder
 */
public class Staaten_Stochastik {
    
    private String strStateName;            // Name des Bundesstaates
    private int iWahlber;                   // Wahlberechtigte Bürger eines Bundesstaates
    private String strOrientation;          // Orientierung des Bundesstaates (R = Rep, D = Dem)
    private double dblVoterTurnOut;         // Wahlbeteiligung
    private int iVoter;                     // Aktive Wähler
    private int iDem;                       // Anzahl der Stimmen für die Demokraten
    private int iRep;                       // Anzahl der Stimmen für die Republikaner
    private double dblDemErginProz;         // Verhältnis der Stimmen für die Demokraten in Prozent
    private double dblRepErginProz;         // Verhältnis der Stimmen für die Republikaner in Prozent
    private String strGouverneur;           // Parteikürzel des Gewinners der den Gouverneur des Bundesstaates stellt
    
   Staaten_Stochastik(){
    strStateName = "";
    strOrientation = "";
    iWahlber = 0;
    dblVoterTurnOut = 0.0;
    iVoter = 0;
    iDem = 0;
    iRep = 0;
    dblDemErginProz = 0.0;
    dblRepErginProz = 0.0;
    strGouverneur = "";
   } 
    
   Staaten_Stochastik(String n, String o, int b, double to, int v, int d, int r, double d_e, double r_e, String g){
    strStateName = n;
    strOrientation = o;
    iWahlber = b;
    dblVoterTurnOut = to;
    iVoter = v;
    iDem = d;
    iRep = r;
    dblDemErginProz = d_e;
    dblRepErginProz = r_e;
    strGouverneur = g;
   } 
    

   // Methoden um in die gekapselten Daten auslesen oder beschreiben zu können.
   // in der c-Welt mit einem Property vergleichbar
   // der Einfachheit halber wurde auf eine Bedingung beim schreiben verzichtet

   public void StateName(String strName)
   {
       strStateName = strName;
   }
   
   
   public String StateName()
   {
       return strStateName;
   }
   
   public void Orientation(String strOrient){
       strOrientation = strOrient;
   }
   
   public String Orientation(){
       return strOrientation;
   }
   
   public void Wahlber(int iBerechtigte)
   {
       iWahlber = iBerechtigte;
   }
   
   
   public int Wahlber()
   {
       return iWahlber;
   }
   
   
   public void VoterTurnOut(double dblBeteiligung)
   {
       dblVoterTurnOut = dblBeteiligung;
   }
   
   
   public double VoterTurnOut()
   {
       return dblVoterTurnOut;
   }
   
   
   
   public void Voter(int iWaehler)
   {
       iVoter = iWaehler;
   }
   
   
   public int Voter()
   {
       return iVoter;
   }
   
   
   public void Dem(int iDemokraten)
   {
       iDem = iDemokraten;
   }
   
   
   public int Dem()
   {
       return iDem;
   }
   
   
   public void Rep(int iRepublikaner)
   {
       iRep = iRepublikaner;
   }
   
   public int Rep()
   {
       return iRep;
   }
   
   
   public void DemErginProz(double dblDemProzent)
   {
       dblDemErginProz = dblDemProzent;
   }
   
   
   public double DemErginProz()
   {
       return dblDemErginProz;
   }
   
   
   public void RepErginProz(double dblRepProzent)
   {
       dblRepErginProz = dblRepProzent;
   }
   
   
   public double RepErginProz()
   {
       return dblRepErginProz;
   }
   
   
   
   public void Gouverneur(String strGou)
   {
       strGouverneur = strGou;
   }
   
   public String Gouverneur()
   {
       return strGouverneur;
   }
}
