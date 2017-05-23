package palindrome;

public class Palindrome {

    public static void main(String[] args) {
        String valeur = "kayak";
        Palindrome palindrome = new Palindrome();
        
        System.out.println(palindrome.estPalindrome(valeur));
        System.out.println(palindrome.estPalindrome("kay yak"));
        System.out.println(palindrome.estPalindrome("ka y, tak"));
        System.out.println(palindrome.estPalindrome("a, z ? erty treza"));
    }
    
    /**
     * Ne va garder que les minuscules et les lettres
     * @param chaine
     * @return 
     */
    public String nettoieChaine(String chaine){
        String chaineEnMinuscules = chaine.toLowerCase();
        String minuscules = "azertyuiopqsdfghjklmwxcvbn";
        
        String chaineNettoyee = "";
        
        for (int i = 0; i < chaineEnMinuscules.length(); i++) {
            char caractere = chaineEnMinuscules.charAt(i);
            if(minuscules.indexOf(caractere) != -1 ){ // >= 0
                chaineNettoyee = chaineNettoyee + caractere;
            }
        }
        return chaineNettoyee ;
    }
    
    public boolean estPalindrome(String chaine){
        chaine = nettoieChaine(chaine);
        int longueur = chaine.length();  //Stocker la longueur
                
        int dernierIndex = longueur - 1; //La valeur du dernier index
        
        int ii = 0; //Index inversé
        int indexMoitie = longueur / 2 ;
        for (int io = 0; io < indexMoitie ; io++) { // Pour toutes les valeur de io
                    //En partant de 0
                          // Jusqu'à ce que io soit égal à longueur
                                        //J'incrémente io de 1
            ii = dernierIndex - io; // index inversé = chaine.length() - 1 - io
            
            if(chaine.charAt(ii) != chaine.charAt(io)){ // les caractères sont différents ?
                return false; //alors je retourne false
            }
        }
        return true; //Ma chaine est un palindrome
    }
    
}
