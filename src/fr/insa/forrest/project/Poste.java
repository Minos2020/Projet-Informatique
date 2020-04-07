package fr.insa.forrest.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Poste {
    int refPoste;
    String dPoste;
    List<Machine> ensembleMachines = new ArrayList<>(5);

    public Poste(int refPoste, String dPoste, List<Machine> ensembleMachines) {
        this.refPoste = refPoste;
        this.dPoste = dPoste;
        this.ensembleMachines = ensembleMachines;
    }

    public void addMachine(int refMachine, String dMachine, int abs, int ord, double coutHoraire, double t) {
        ensembleMachines.add(new Machine(refMachine,dMachine,abs,ord,coutHoraire,t));
    }

    @Override
    public String toString() {
        return "Poste{" +
                "refPoste=" + refPoste +
                ", dPoste='" + dPoste + '\'' +
                ", ensembleMachines=" + ensembleMachines +
                '}';
    }
}
