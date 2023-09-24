package model;

public class Etudiant {

	String nom;
	int age;
	String adresse;
	double moyenne;
	
	void info(){
		System.out.println("Nom : "+this.nom+" Age : "+this.age+" Adresse : "+this.adresse+" Moyenne : "+this.moyenne);
	}

	public Etudiant(String nom, int age, String adresse, double moyenne) {
		this.nom = nom;
		this.age = age;
		this.adresse = adresse;
		this.moyenne = moyenne;
	}
	

	public Etudiant() {
		
	}
		
}
