package fr.greta.dwm2.date;

import java.util.Scanner;

public class ValiditeDate {
    Date date = null;
    
    
    public int demanderChoixModifDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisir une action parmi:");
        System.out.println("1: changer le jour");
        System.out.println("2: changer le mois");
        System.out.println("3: changer l'année");
        System.out.println("0: revenir au menu précédent");
        System.out.println("Entrez votre choix:");
        return scanner.nextInt();
    }

    
    public int saisirValeur(String type){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir la valeur de "+type+" : ");
        return scanner.nextInt();
    }
    
    private Date saisirNouvelleDate(){
        Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le jour:");
        int jour = scanner.nextInt();
        date.setJour(jour);
        System.out.println("Entrez le mois:");
        int mois = scanner.nextInt();
        date.setMois(mois);
        System.out.println("Entrez l'année:");
        date.setAnnee(scanner.nextInt());
        return date;
    }
    public int demanderChoixPrincipal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisir une action parmi:");
        System.out.println("1: saisir une nouvelle date");
        System.out.println("2: indiquer la validité de la date courante");
        System.out.println("3: modifier la date courante");
        System.out.println("4: supprimer la date courante");
        System.out.println("0: quitter le programme");
        System.out.println("Entrez votre choix:");
        return scanner.nextInt();
    }
    
    public static void main(String[] args) {
        int choix = -1;
        ValiditeDate vd = new ValiditeDate();
        
        while (choix != 0){
            //Saisie de la date par l'utilisateur
            choix = vd.demanderChoixPrincipal();
            switch(choix){
                case 1:
                    vd.date = vd.saisirNouvelleDate();
                    break;
                case 2:
                    if(vd.date.estValide()){
                        System.out.println(
                                vd.date.getRepresentation()+
                                        " est valide");
                    }
                    else {
                        System.out.println(
                                vd.date.getRepresentation()+
                                        " n'est pas valide");
                    }
                    break;
                case 3:
                    //vd.modifierDate();
                    break;
                case 4: 
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
