package fr.insa.forrest.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atelier {
    private int abs, ord;
    private String nomAtelier = "Atelier";
    private List<Poste> ensemblePostes = new ArrayList<>(5);

    public Atelier() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle est la largeur de votre atelier ?");
        this.abs = sc.nextInt();
        System.out.println("Quelle est la hauteur de votre atelier ?");
        this.ord = sc.nextInt();
    }
    public void afficheInstance(){
        System.out.println("Votre atelier '"+this.nomAtelier+"' mesure "+this.abs+" mètres de large et "+this.ord+" mètres de long.");
        for (Poste elem : this.ensemblePostes){
            System.out.println(elem.toString());
        }
    }
    public void addPoste(int refPoste, String dPoste, List<Machine> ensembleMachines){
        ensemblePostes.add(new Poste(refPoste, dPoste, ensembleMachines));
    }
}
