package fr.insa.forrest.project;

public class Machine {
    private int refMachine, abs, ord;
    private String dMachine;
    private double coutHoraire;

    public Machine(int refMachine, String dMachine, int abs, int ord, double coutHoraire, double t) {
        this.refMachine = refMachine;
        this.dMachine = dMachine;
        this.abs = abs;
        this.ord = ord;
        this.coutHoraire = coutHoraire;
    }

    public double getCoutHoraire() {
        return coutHoraire;
    }
}
