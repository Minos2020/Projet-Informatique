package fr.insa.forrest.project;

public class Machine {
    int refMachine;
    String dMachine;
    double abs, ord, coutHoraire, t;

    public Machine(int refMachine, String dMachine, double abs, double ord, double coutHoraire, double t) {
        this.refMachine = refMachine;
        this.dMachine = dMachine;
        this.abs = abs;
        this.ord = ord;
        this.coutHoraire = coutHoraire;
        this.t = t;
    }
}
