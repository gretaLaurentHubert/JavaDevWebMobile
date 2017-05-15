package fr.greta.dwm2;

public class StyloRouge extends Stylo {
    
    public void ecrire(String msg){
        super.ecrire(
                "ECRIRE_EN_ROUGE{"
                        + msg + "}");
    }
    
    
}
