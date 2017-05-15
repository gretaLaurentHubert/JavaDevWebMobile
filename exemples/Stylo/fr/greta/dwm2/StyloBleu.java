package fr.greta.dwm2;

public class StyloBleu extends Stylo {
    
    public void ecrire(String msg){
        super.ecrire(
                "ECRIRE_EN_BLEU{"
                        + msg + "}");
    }
    
    
}
