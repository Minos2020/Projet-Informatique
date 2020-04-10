package fr.insa.forrest.project;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    private int codeProduit;
    private String dProduit;
    private List<Operation> listeOperation;

    public Produit(int codeProduit, String dProduit) {
        this.codeProduit = codeProduit;
        this.dProduit = dProduit;
        this.listeOperation = new ArrayList<>();
    }

    public String afficheProduit(){
        return dProduit+" ["+codeProduit+"]";
    }

    public double coutProduit(){
        double coutProduit = 0;
        for (Operation elem :listeOperation){
            coutProduit += elem.getMachine().getCoutHoraire()*(elem.getT()/3600);
        }
        return coutProduit;
    }

    public void setListeOperation(List<Operation> listeOperation) {
        this.listeOperation = listeOperation;
    }

    public String getdProduit() {
        return dProduit;
    }
}
