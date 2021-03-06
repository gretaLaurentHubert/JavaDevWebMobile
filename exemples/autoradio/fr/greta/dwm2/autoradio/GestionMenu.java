package fr.greta.dwm2.autoradio;

import java.util.Scanner;

public class GestionMenu {
	private Scanner scanner = new Scanner(System.in);
	
	private static GestionMenu monInstance = null;
	private Autoradio autoradio;
	
	public void setAutoradio(Autoradio autoradio){
		this.autoradio = autoradio;
	}
	
	private boolean continuer = true;
        
	public void gererAutoradio(){
		while(continuer){
                    System.out.println("---- AUTORADIO ----");
			System.out.println(autoradio.getMenu());
			gererAppuiBouton();
		}
	}
	
	private void gererAppuiBouton(){
		String valeur = getValeur("Entrez votre choix:")
				.toUpperCase(); //On met en majuscule pour que 
		//les minuscules soient aussi prises en compte
		
		if(autoradio.estAllume()){
                    switch(valeur){
			case "A": autoradio.augmenterVolume(); break ;
			case "D": autoradio.diminuerVolume(); break ;
			case "O": autoradio.eteindre(); break;
			case "C": autoradio.setMode(Autoradio.LECTEUR_CD); break;
                        case "1":   
                        case "2":   
                        case "3":   
                        case "4": 
                            autoradio.gererValeur(valeur);
                                    
                    }
		}else{
			switch(valeur){
			case "O": autoradio.allumer(); break ;
			case "Q": continuer = false; break ;
			}
		}
		
	}
	
	public String getValeur(String message){
		System.out.println(message);
		return scanner.next();
	}
		

	public static GestionMenu getInstance(){
		if(monInstance == null) {
			monInstance = new GestionMenu();
		}
		return monInstance ;
	}
}

