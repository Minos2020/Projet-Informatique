package fr.insa.forrest.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	//  write your code here
        int refPoste;
        String dPoste;
        System.out.println("Quelle est la référence de votre poste ?");
        refPoste = sc.nextInt();
        System.out.println("Quelle est la désignation de votre poste ?");
        dPoste = sc.next();
        List<Machine> ensembleMachines = new ArrayList<>(5);
        Poste poste1 = new Poste(refPoste, dPoste,ensembleMachines);
        poste1.addMachine();
        List<Poste> ensemblePostes = new ArrayList<>(5);
        Atelier atelier1 = new Atelier(30,20, ensemblePostes);
        atelier1.afficheInstance();
        System.out.println(atelier1.toString());
    }
}
