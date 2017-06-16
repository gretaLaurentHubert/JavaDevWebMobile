package fr.greta.dwm2.date;

import java.util.Scanner;

public class ValiditeDate {
    public static final int MENU_PRINCIPAL_SAISIR = 1;
    public static final int MENU_PRINCIPAL_AFFICHER_VALIDITE = 2;
    public static final int MENU_PRINCIPAL_MODIFIER = 3;
    public static final int MENU_PRINCIPAL_SUPPRIMER = 4;
    public static final int MENU_PRINCIPAL_QUITTER = 0;
    
    Date date = null;
    
    public int demanderChoixPrincipal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisir une action parmi:");
        System.out.println(MENU_PRINCIPAL_SAISIR + ": saisir une nouvelle date");
        System.out.println(MENU_PRINCIPAL_AFFICHER_VALIDITE + ": indiquer la validité de la date courante");
        System.out.println(MENU_PRINCIPAL_MODIFIER + ": modifier la date courante");
        System.out.println(MENU_PRINCIPAL_SUPPRIMER + ": supprimer la date courante");
        System.out.println(MENU_PRINCIPAL_QUITTER + ": quitter le programme");
        System.out.println("Entrez votre choix:");
        return scanner.nextInt();
    }
    
    public int demanderChoixModifDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisir une action parmi:");
        System.out.println(MENU_DATE_JOUR + ": changer le jour");
        System.out.println(MENU_DATE_MOIS + ": changer le mois");
        System.out.println(MENU_DATE_ANNEE + ": changer l'année");
        System.out.println(MENU_DATE_QUITTER + ": revenir au menu précédent");
        System.out.println("Entrez votre choix:");
        return scanner.nextInt();
    }
    
    public static final int MENU_DATE_JOUR = 1;
    public static final int MENU_DATE_MOIS = 2;
    public static final int MENU_DATE_ANNEE = 3;
    public static final int MENU_DATE_QUITTER = 0;
    
    private void modifierDate(){
        int choix = -1;
        while(choix != MENU_DATE_QUITTER){
            choix = demanderChoixModifDate();
            switch(choix){
                case MENU_DATE_JOUR: date.setJour(saisirValeur("jour"));
                    break;
                case MENU_DATE_MOIS: date.setMois(saisirValeur("mois"));
                    break;
                case MENU_DATE_ANNEE: date.setAnnee(saisirValeur("année"));
                    break;
            }
        }
    }
    
    public int saisirValeur(String type){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir la valeur de "+type+" : ");
        return scanner.nextInt();
    }
    
    private Date saisirNouvelleDate(){
        Date date = new Date();
        
        date.setJour(saisirValeur("jour"));
        date.setMois(saisirValeur("mois"));
        date.setAnnee(saisirValeur("année"));
        
        return date;
    }
    
    private void afficheValiditeDate(){
        if(date.estValide()){
            System.out.println(
                    date + " est valide");
                    //date.getRepresentation() + " est valide");
        }
        else {
            System.out.println(
                date + " n'est pas valide");
                //date.getRepresentation()+ " n'est pas valide");
        }
        
    }
    
    public static void main(String[] args) {
        int choix = -1;
        //Variable vd: de type ValiditeDate
        ValiditeDate vd = new ValiditeDate();
        
        while (choix != MENU_PRINCIPAL_QUITTER){
            //Saisie de la date par l'utilisateur
            choix = vd.demanderChoixPrincipal();
            switch(choix){
                case MENU_PRINCIPAL_SAISIR:
                    vd.date = vd.saisirNouvelleDate();
                    break;
                case MENU_PRINCIPAL_AFFICHER_VALIDITE:
                    vd.afficheValiditeDate();
                    break;
                case MENU_PRINCIPAL_MODIFIER:
                    vd.modifierDate();
                    break;
                case MENU_PRINCIPAL_SUPPRIMER: 
                    vd.date = null;
                    break;
            }
        }
    }
    
    private static void test(){
        Date date = new Date();
        
        date.setJour(2);
        date.setMois(2);
        date.setAnnee(2016);
        System.out.println(
                date.getRepresentation()
                        +" "+ date.estValide());
        date.setJour(29);
        System.out.println(date.getRepresentation()+ " "+ date.estValide());
        date.setAnnee(2017);
        System.out.println(date.getRepresentation()+ " "+ date.estValide());
        date.setJour(30);
        System.out.println(date.getRepresentation()+ " "+ date.estValide());
        date.setMois(3);
        System.out.println(date.getRepresentation()+ " "+ date.estValide());
        
        
    }
}
