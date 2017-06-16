package fr.greta.dwm2.autoradio;

public class Autoradio implements LectureCD{
	public static final String LECTEUR_CD = "Lecteur CD";
	
	private boolean allume = false;
	private String mode = LECTEUR_CD;
	
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public void allumer(){
		allume = true;
	}
	
	public void eteindre(){
		allume = false;
	}
	
	public void augmenterVolume(){
		System.out.println("Augmenter Volume");
	}
	public void diminuerVolume(){
		System.out.println("Diminuer Volume");
	}
	
	public boolean estAllume(){
		return allume;
	}
	
	public String getMenuCD(){
		return    "1. lire CD\n" 
				+ "2. pause CD\n"
				+ "3. morceau CD suivant\n"
				+ "4. morceau CD précédent\n" ;
	}
	
	public String getMenuTunerRadio(){
		return    "1. chercher Frequence Haut\n" 
				+ "2. chercher Frequence Bas\n"
				+ "3. diminuer Frequence\n"
				+ "4. augmenter Frequence\n" ;
	}
	
	public String getMenu(){
		String menuPrincipal = "";
		if(allume){
			switch(mode){
			case LECTEUR_CD:
				System.out.println(getMenuCD());
			}
			
			menuPrincipal +=  "A. Augmenter le volume\n" 
					+ "D. Diminuer le volume\n";
			if(this instanceof LectureCD){
				menuPrincipal += "C. mode CD\n";
			}
			menuPrincipal += "O. éteindre\n";
		}
		else{
			menuPrincipal += "O. allumer\n"
					+ "Q. quitter\n";
		}
		return menuPrincipal;
	}

	@Override
	public void lire() {
		System.out.println("Bouton Lecture CD appuyé");
	}

	@Override
	public void pause() {
		System.out.println("Bouton Pause CD appuyé");
	}

	@Override
	public void prochainePiste() {
		System.out.println("Bouton prochaine piste CD appuyé");
	}

	@Override
	public void pistePrecedente() {
		System.out.println("Bouton piste précédente CD appuyé");
	}

	@Override
	public void ejecter() {
		System.out.println("Bouton éjecter CD appuyé");
	}
}
