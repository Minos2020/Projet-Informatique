package fr.insa.forrest.project;

import java.util.ArrayList;
import java.util.List;

public class Gamme {
    private String dGamme;
    private List<Operation> listeOperation;

    public Gamme(String dGamme) {
        this.dGamme = dGamme;
        this.listeOperation = new ArrayList<>(5);
    }

    public double coutGamme (){
        double coutGamme = 0;
        for (Operation elem : listeOperation){
            coutGamme += elem.getMachine().getCoutHoraire()*(elem.getT()/3600);
        }
        return coutGamme;
    }
    public double dureeGamme (){
        double dureeGamme = 0;
        for (Operation elem : listeOperation){
            dureeGamme += elem.getT();
        }
        return dureeGamme;
    }
}
