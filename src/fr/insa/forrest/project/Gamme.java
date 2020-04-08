package fr.insa.forrest.project;

import java.util.List;

public class Gamme {
    String dGamme;
    List<Produit> ensembleProduits;

    public Gamme(String refGamme, List<Produit> ensembleProduits) {
        this.dGamme = refGamme;
        this.ensembleProduits = ensembleProduits;
    }

    public String afficheGamme(){
        String str = dGamme+"\n";
        for (Produit elem : ensembleProduits){
            str = str.concat("\t\t"+elem.afficheProduit()+"\n");
        }
        return str;
    }


    @Override
    public String toString() {
        return "Gamme{" +
                "dGamme='" + dGamme + '\'' +
                ", ensembleProduits=" + ensembleProduits +
                '}';
    }

    public void addProduit (int codeProduit, String dProduit){
        this.ensembleProduits.add(new Produit(codeProduit, dProduit));
    }

    public void suppProduit (Produit produit){
        ensembleProduits.remove(produit);
    }


}
