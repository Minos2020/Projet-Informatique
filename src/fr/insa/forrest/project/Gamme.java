package fr.insa.forrest.project;

import java.util.List;

public class Gamme {
    String dGamme;
    List<Produit> ensembleProduits;

    public Gamme(String refGamme, List<Produit> ensembleProduits) {
        this.dGamme = refGamme;
        this.ensembleProduits = ensembleProduits;
    }

    public void addProduit (int codeProduit, String dProduit){
        this.ensembleProduits.add(new Produit(codeProduit, dProduit));
    }

    public void suppProduit (Produit produit){ ensembleProduits.remove(produit);
    }


}
