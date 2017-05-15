package fr.greta.dwm2.formes;

import java.util.Scanner;

public class Carre extends Forme {
	private double cote;
	
	public Carre(String nom) {
		super("Carre", nom);
	}
	public Carre(String nom, double cote) {
		super("Carre", nom);
		this.cote = cote;
	}

	@Override
	public double getPerimetre() {
		return 4 * cote;
	}

	@Override
	public void saisirValeurs() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Longueur coté :");
		cote = in.nextDouble();
	}
}
