package fr.insa.forrest.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Atelier {
    private int abs, ord;
    private String nomAtelier = "Atelier";
    private List<Poste> ensemblePostes;
    private List<Operateur> touslesOp;

   public Atelier() {
       this.ensemblePostes = new ArrayList<>(5);
       this.touslesOp = new ArrayList<>(5);
       String ligne;
       File fichier = new File ("C:/Users/malof/OneDrive/Bureau/Projet_Info_S2/Fichiers/Sources.txt");
       try {
           BufferedReader lecteur = new BufferedReader(new FileReader(fichier));
           while ((ligne = lecteur.readLine())!=null) {
               if (ligne.startsWith("Atelier")){
                   StringTokenizer sAtelier = new StringTokenizer(ligne.substring(ligne.indexOf("=")+1), ",");
                   this.nomAtelier = sAtelier.nextToken();
                   this.abs = Integer.parseInt(sAtelier.nextToken());
                   this.ord = Integer.parseInt(sAtelier.nextToken());
               }
               if (ligne.startsWith("Poste")) {
                   StringTokenizer sPoste = new StringTokenizer(ligne.substring(ligne.indexOf("=")+1), ",");
                   String dPoste = sPoste.nextToken();
                   int refPoste = Integer.parseInt(sPoste.nextToken());
                   Poste poste = new Poste(refPoste, dPoste, new ArrayList<>());
                   addPoste(poste);
                   while (sPoste.hasMoreTokens()) {
                       StringTokenizer sMachine = new StringTokenizer(sPoste.nextToken(), "_");
                       String dMachine = sMachine.nextToken();
                       int refMachine = Integer.parseInt(sMachine.nextToken());
                       int abs = Integer.parseInt(sMachine.nextToken());
                       int ord = Integer.parseInt(sMachine.nextToken());
                       double coutHoraire = Double.parseDouble(sMachine.nextToken());
                       Machine machine = new Machine(refMachine, dMachine, abs, ord, coutHoraire);
                       poste.addMachine(machine);
                   }
                   if (ligne.startsWith("Produit")){
                       StringTokenizer sProduit = new StringTokenizer(ligne.substring(ligne.indexOf("=")+1), ",");
                   }
               }
           }
           System.out.println(toString());
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

    public void addPoste(int refPoste, String dPoste, List<Machine> ensembleMachines){
        this.ensemblePostes.add(new Poste(refPoste, dPoste, ensembleMachines));
    }
    public void addPoste(Poste poste){
        ensemblePostes.add(poste);
    }

    @Override
    public String toString() {
        return "Atelier{" +
                "abs=" + abs +
                ", ord=" + ord +
                ", nomAtelier='" + nomAtelier + '\'' +
                ", ensemblePostes=" + ensemblePostes +
                ", touslesOp=" + touslesOp +
                '}';
    }
}
