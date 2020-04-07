package fr.insa.forrest.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	//  write your code here
        int bla;
        bla=Lire.i();
        Atelier atelier = new Atelier();
        List<Machine> ensembleMachines = new ArrayList<>(3);
        atelier.addPoste(1234, "Découpage",ensembleMachines);
        atelier.addPoste(5678, "Assemblage",ensembleMachines);
        atelier.addPoste(4321, "Collage",ensembleMachines);
        atelier.afficheInstance();
    }
}
