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
        List<Produit> piecesMetaliques = new ArrayList<>(3);
        List<Operation> operationList = new ArrayList<>(3);

        Machine machine1 = new Machine(4565,"Découpeuse1",12,12,7.3,4);
        Machine machine2 = new Machine(4568,"Découpeuse2",3,3,9.6,4);
        Machine machine3 = new Machine(7567,"Perceuse",12,12,7.3,4);
        Machine machine4 = new Machine(4565,"Visseuse1",12,12,7.3,4);
        Machine machine5 = new Machine(4568,"Visseuse2",3,3,9.6,4);
        Machine machine6 = new Machine(9858,"Ecarteur",2,6,12,4);
        Machine machine7 = new Machine(4565,"Soudeuse",12,12,25,4);
        Machine machine8 = new Machine(4568,"Soudeuse2",3,3,9.6,4);
        Machine machine9 = new Machine(9858,"Catalyseur",2,6,12,4);
        Operation op1 = new Operation(6567,"Découpage",machine1,350);
        Operation op2 = new Operation(4569,"Perçage",machine4,110);
        Operation op3 = new Operation(9786,"Soudure",machine7,160);
        Operation op4 = new Operation(2357,"Catalyse",machine9,1200);
        Produit bouteille1 = new Produit(1234,"Whisky");
        Produit bouteille2 = new Produit(4321,"Rhum");
        Produit stylo1 = new Produit(3421,"Critérium");
        Produit stylo2 = new Produit(3456,"Crayon à papier");
        Produit stylo3 = new Produit(8988,"Stylo à plume");
        Produit piece1 = new Produit(2345,"Pièce 1");
        Produit piece2 = new Produit(7843,"Pièce 2");

        ensembleMachines1.add(machine1);
        ensembleMachines1.add(machine2);
        ensembleMachines1.add(machine3);
        ensembleMachines2.add(machine4);
        ensembleMachines2.add(machine5);
        ensembleMachines2.add(machine6);
        ensembleMachines3.add(machine7);
        ensembleMachines3.add(machine8);
        ensembleMachines3.add(machine9);
        bouteilles.add(bouteille1);
        bouteilles.add(bouteille2);
        stylos.add(stylo1);
        stylos.add(stylo2);
        stylos.add(stylo3);
        operationList.add(op1);
        operationList.add(op2);
        operationList.add(op3);
        operationList.add(op4);
        piecesMetaliques.add(piece1);
        piecesMetaliques.add(piece2);
        piece1.setListeOperation(operationList);


        atelier.addPoste(1234, "Découpage",ensembleMachines1);
        atelier.addPoste(5678, "Assemblage",ensembleMachines2);
        atelier.addPoste(4321, "Collage",ensembleMachines3);
        atelier.addGamme("Stylos", stylos);
        atelier.addGamme("Bouteilles",bouteilles);
        atelier.addGamme("Pièces Métalliques", piecesMetaliques);

        System.out.println(atelier.afficheInstance());
        System.out.println(piece1.getdProduit()+" coûte "+piece1.coutProduit()+" à produire.");
    }
}
