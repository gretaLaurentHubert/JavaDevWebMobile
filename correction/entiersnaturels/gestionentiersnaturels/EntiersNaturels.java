package gestionentiersnaturels;

import java.util.Scanner;

public class EntiersNaturels {
    private Scanner scanner = new Scanner(System.in);
    private GestionEntiersNaturels gen = new GestionEntiersNaturels();
    
    public static final int CHOIX_SAISIR_ENTIER = 1;
    public static final int CHOIX_SUPPRIMER_DERNIER = 2;
    public static final int CHOIX_VIDER_TABLEAU = 3;
    public static final int CHOIX_AFFICHER_TABLEAU = 4;
    
    public void afficherMenu(){
        System.out.println("Gestion d'un tableau d'entiers");
        System.out.println(CHOIX_SAISIR_ENTIER 
                + ". Saisir un entier");
        System.out.println(CHOIX_SUPPRIMER_DERNIER 
                + ". supprimer la dernière valeur");
        System.out.println(CHOIX_VIDER_TABLEAU 
                + ". afficher le périmètre d'une forme");
        System.out.println(CHOIX_AFFICHER_TABLEAU 
                + ". afficher les valeurs");
        System.out.println("0. quitter le programme");
    }
    
    public void gererProgramme(){
        int choix = -1;
        
        while(choix != 0){
            afficherMenu();
            choix = getValeur("Entrez votre choix:");
            switch(choix){
                case CHOIX_SAISIR_ENTIER:
                    int valeur = getValeur("Entrer valeur entier");
                    gen.ajouter(valeur);
                    break;
                case CHOIX_SUPPRIMER_DERNIER:
                    gen.supprimerDernier();
                    break;
                case CHOIX_VIDER_TABLEAU:
                    gen.viderTableau();
                    break;
                case CHOIX_AFFICHER_TABLEAU:
                    gen.afficherTableau();
                    break;
                    
            }
        }
    }
    
    public int getValeur(String message){
        System.out.println(message);
        return scanner.nextInt();
    }
    
    public static void main(String[] args) {
        new EntiersNaturels().gererProgramme();
    }
}
