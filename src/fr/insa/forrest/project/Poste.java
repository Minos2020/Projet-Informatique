package fr.insa.forrest.project;

import java.util.List;

public class Poste {
    private int refPoste;
    private String dPoste;
    private List<Machine> ensembleMachines;

    public Poste(int refPoste, String dPoste, List<Machine> ensembleMachines) {
        this.refPoste = refPoste;
        this.dPoste = dPoste;
        this.ensembleMachines = ensembleMachines;
    }

    public void addMachine(int refMachine, String dMachine, int abs, int ord, double coutHoraire, double t) {
        ensembleMachines.add(new Machine(refMachine,dMachine,abs,ord,coutHoraire,t));
    }

    public String affichePoste(){
        String str = dPoste+" ["+refPoste+"]\n";
        for (Machine elem : ensembleMachines){
            str = str.concat("\t\t"+elem.afficheMachine()+"\n");
        }
        return str;
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
