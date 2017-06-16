package fr.greta.dwm2.date;

public class Date {
    private int jour, mois, annee = 0;
    public void setJour(int jour){
        this.jour = jour;
    }
    public void setMois(int mois){
        this.mois = mois;
    }
    public void setAnnee(int annee){
        this.annee = annee;
    }
    
    public boolean estValide(){
        if(estMoisLong()){
            return jour <= 31;
        }
        else if(estMoisCourt()){
            return jour <= 30;
        }
        else if(estAnneeBissextile()){
            return jour <= 29;
        } 
        else {
            return jour <= 28;
        }
    }
    
    private int getJourMax(){
        switch(mois){
            case 2:
                if(estAnneeBissextile()){
                    return 29;
                }
                else {
                    return 28;
                }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4 | 6 | 9 | 11:
                return 30;
            default:
                return -1;
        }
    }
    
    private boolean estAnneeBissextile(){
        return (    annee % 4 == 0 &&
                    annee % 100 != 0) 
                || annee % 400 == 0;
    }
    /**
     * Mois de 30 jours
     * @return true si c'est un mois de 30j
     */
    private boolean estMoisCourt(){
        return mois == 4 
                || mois == 6 
                || mois == 9 
                || mois == 11;
    }
    private boolean estMoisLong(){
        return mois == 1  //janvier
                || mois == 3  // mars
                || mois == 5  // mai
                || mois == 7  // Juillet
                || mois == 8  //aout 
                || mois == 10 
                || mois == 12;
    }
    
    public String toString(){
        return getRepresentation();
    }
    
    public String getRepresentation(){
        return jour + "/" + mois + "/" + annee;
    }
}
