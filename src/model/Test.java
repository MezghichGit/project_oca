package model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Etudiant e1 =  new Etudiant();
		//Etudiant e2 = new Etudiant("Hamza", 24,"Tunis", 16.5);
		
		//e1.info();
		//e2.info();
		
		Etudiant e1 =  new Etudiant();
		e1.info();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donner votre nom");
		String nom = sc.nextLine();
		
		e1.nom = nom;
		
		System.out.println("Donner votre age");
		int age = sc.nextInt();
		
		e1.age = age;
		sc.nextLine(); // pour absorber le caractère d'echappement
		
		
		System.out.println("Donner votre adresse");
		String adresse = sc.nextLine();
		e1.adresse = adresse;
		
		System.out.println("Donner votre moyenne");
		double moyenne = sc.nextDouble();
		e1.moyenne = moyenne;
		e1.info();
		
		
		//System.out.println("Vous êtes : "+ nom);

	}

}
