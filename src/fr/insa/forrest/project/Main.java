package fr.insa.forrest.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	//  write your code here
        Atelier atelier = new Atelier();
        List<Machine> ensembleMachines1 = new ArrayList<>(3);
        List<Machine> ensembleMachines2 = new ArrayList<>(3);
        List<Machine> ensembleMachines3 = new ArrayList<>(3);
        List<Produit> bouteilles = new ArrayList<>(3);
        List<Produit> stylos = new ArrayList<>(3);

        ensembleMachines1.add(new Machine(4565,"Broyeuse1",12,12,7.3,4));
        ensembleMachines1.add(new Machine(4568,"Catalyseuse1",3,3,9.6,4));
        ensembleMachines1.add(new Machine(9858,"Extincteur1",2,6,12,4));
        ensembleMachines2.add(new Machine(4565,"Broyeuse2",12,12,7.3,4));
        ensembleMachines2.add(new Machine(4568,"Catalyseuse2",3,3,9.6,4));
        ensembleMachines2.add(new Machine(9858,"Extincteur2",2,6,12,4));
        ensembleMachines3.add(new Machine(4565,"Broyeuse3",12,12,7.3,4));
        ensembleMachines3.add(new Machine(4568,"Catalyseuse3",3,3,9.6,4));
        ensembleMachines3.add(new Machine(9858,"Extincteur3",2,6,12,4));
        bouteilles.add(new Produit(1234,"Whisky"));
        bouteilles.add(new Produit(4321,"Rhum"));
        stylos.add(new Produit(3421,"Critérium"));
        stylos.add(new Produit(3456,"Crayon à papier"));
        stylos.add(new Produit(8988,"Stylo à plume"));

        atelier.addPoste(1234, "Découpage",ensembleMachines1);
        atelier.addPoste(5678, "Assemblage",ensembleMachines2);
        atelier.addPoste(4321, "Collage",ensembleMachines3);
        atelier.addGamme("Stylos", stylos);
        atelier.addGamme("Bouteilles",bouteilles);

        System.out.println(atelier.afficheInstance());
    }
}
