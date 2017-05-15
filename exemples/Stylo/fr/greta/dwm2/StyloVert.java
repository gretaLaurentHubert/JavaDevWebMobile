package fr.greta.dwm2;

public class StyloVert extends Stylo {
    
    public void ecrire(String msg){
        super.ecrire(
                "ECRIRE_EN_VERT{"
                        + msg + "}");
    }
    
    
}
