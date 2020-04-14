package fr.insa.forrest.project;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    private int refProduit;
    private List<Operation> listeOperation;
    private List<BesoinBrut> besoins;

    public Produit(int codeProduit, String dProduit) {
        this.refProduit = codeProduit;
        this.listeOperation = new ArrayList<>();
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

}
