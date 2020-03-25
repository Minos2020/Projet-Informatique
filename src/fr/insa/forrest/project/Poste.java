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

    public void addMachine() {
        System.out.println("Quelle est la référence de votre machine ?");
        Scanner sc = new Scanner (System.in);
        int refMachine = sc.nextInt();
        System.out.println("Quelle est la désignation de votre machine ?");
        String dMachine = sc.next();
        ensembleMachines.add(new Machine(refMachine,dMachine, 2, 2, 10, 120));
    }

}
