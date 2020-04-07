package fr.insa.forrest.project;

public class Operation {
    private String refOperation ;
    private String dOperation ;
    private Machine machine ;
    private double t ;

    public Operation(String refOperation, String dOperation, Machine machine, double t) {
        this.refOperation = refOperation;
        this.dOperation = dOperation;
        this.machine = machine;
        this.t = t;
    }
}
