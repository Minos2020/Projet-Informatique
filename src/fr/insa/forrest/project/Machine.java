package fr.insa.forrest.project;

public class Machine {
    private int refMachine, abs, ord;
    private String dMachine;
    private double coutHoraire;

    public Machine(int refMachine, String dMachine, int abs, int ord, double coutHoraire) {
        this.refMachine = refMachine;
        this.dMachine = dMachine;
        this.abs = abs;
        this.ord = ord;
        this.coutHoraire = coutHoraire;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "refMachine=" + refMachine +
                ", abs=" + abs +
                ", ord=" + ord +
                ", dMachine='" + dMachine + '\'' +
                ", coutHoraire=" + coutHoraire +
                '}';
    }

    public double getCoutHoraire() {
        return coutHoraire;
    }
}
