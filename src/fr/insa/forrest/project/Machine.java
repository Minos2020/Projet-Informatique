package fr.insa.forrest.project;

public class Machine {
    int refMachine, abs, ord;
    String dMachine;
    double coutHoraire, t;

    public Machine(int refMachine, String dMachine, int abs, int ord, double coutHoraire, double t) {
        this.refMachine = refMachine;
        this.dMachine = dMachine;
        this.abs = abs;
        this.ord = ord;
        this.coutHoraire = coutHoraire;
        this.t = t;
    }
}
