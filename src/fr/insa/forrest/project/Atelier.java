package fr.insa.forrest.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atelier {
    private int abs, ord;
    private String nomAtelier = "Atelier";
    private List<Poste> ensemblePostes;
    private List<Gamme> ensembleGammes;

    public Atelier() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle est la largeur de votre atelier ?");
        this.abs = sc.nextInt();
        System.out.println("Quelle est la hauteur de votre atelier ?");
        this.ord = sc.nextInt();
        this.ensemblePostes = new ArrayList<>(5);
        this.ensembleGammes = new ArrayList<>(5);
    }
    public String afficheInstance(){
        String str = "Nom Atelier : "+this.nomAtelier+"\n"
                        +"Largeur : "+this.abs+"\n"
                            +"Longueur : "+this.ord+"\nPostes :\n";
        for (Poste elem : this.ensemblePostes){
            str = str.concat("\t"+elem.affichePoste())+"\n";
        }
        str = str+"\nGammes :\n";
        for (Gamme elem : this.ensembleGammes){
            str = str.concat("\t"+elem.afficheGamme())+"\n";
        }
        return str;
    }
    public void addPoste(int refPoste, String dPoste, List<Machine> ensembleMachines){
        this.ensemblePostes.add(new Poste(refPoste, dPoste, ensembleMachines));
    }
    public void addGamme (String refGamme, List<Produit> ensembleProduits){
        this.ensembleGammes.add(new Gamme(refGamme, ensembleProduits));
    }
}
