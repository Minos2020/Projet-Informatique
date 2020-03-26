package fr.insa.forrest.project;

import java.util.ArrayList;
import java.util.List;

public class Atelier {
    int abs, ord;
    String nomAtelier = "Atelier";
    List<Poste> ensemblePostes = new ArrayList<>(5);

    public Atelier(int abs, int ord, List<Poste> ensemblePostes) {
        this.abs = abs;
        this.ord = ord;
        this.ensemblePostes = ensemblePostes;
    }
    public void afficheInstance(){
        System.out.println(this.nomAtelier+" a pour coordonnées : "+this.abs+";"+this.ord);
        for (Poste elem : this.ensemblePostes){
            System.out.println(elem);
        }
    }

    @Override
    public String toString() {
        return "Atelier{" +
                "abs=" + abs +
                ", ord=" + ord +
                ", nomAtelier='" + nomAtelier + '\'' +
                ", ensemblePostes=" + ensemblePostes +
                '}';
    }
}
