package fr.insa.forrest.project;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    private String dProduit;
    private int refProduit;
    private List<Gamme> toutesLesGammes;
    private List<BesoinBrut> besoins;

    public Produit(int codeProduit, String dProduit) {
        this.refProduit = codeProduit;
        this.dProduit = dProduit;
        this.toutesLesGammes = new ArrayList<>();
    }
}
