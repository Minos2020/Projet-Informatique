package fr.insa.forrest.project;

public class Operation {
    private int refOperation ;
    private String dOperation ;
    private Machine machine ;
    private double t ;

    public Operation(int refOperation, String dOperation, Machine machine, double t) {
        this.refOperation = refOperation;
        this.dOperation = dOperation;
        this.machine = machine;
        this.t = t;
    }

    public Machine getMachine() {
        return machine;
    }

    public double getT() {
        return t;
    }
}
