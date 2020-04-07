
import fr.insa.forrest.project.Lire;
import fr.insa.forrest.project.Produit;

import java.util.ArrayList;
import java.util.List;

import static fr.insa.forrest.project.Lire.c;

public class Gamme {
    String refGamme;
    List<Produit> ensembleProduits;

    public Gamme(String refGamme, List<Produit> ensembleProduits) {
        this.refGamme = refGamme;
        this.ensembleProduits = ensembleProduits;
    }


    public void modifierGamme(String refGamme, List<Produit> ensembleProduits) {
        System.out.println("Veuillez entrer le reference de gamme a modifier");
        String n=Lire.S();

        if(n!= refGamme) {
            System.out.println("Veuillez rentrer un reference de gamme qui existe");
            n = Lire.S();
        }

        if(n==refGamme) {
            System.out.println("1- modifier le reference de gamme");
            System.out.println("2- modifier la liste de produits");
            System.out.println("3- modifier le reference de gamme et la liste de produits");

            int x = Lire.i();


            if ((x!=1)&&(x!=2)&&(x!=3)){
                System.out.println("Veuillez choisir 1 ou 2");
                x=Lire.i();
            }

            if(x==1) {
                System.out.println("Veuillez rentrer le nouveau reference de gamme");
                String nouveauref = Lire.S();
                refGamme= nouveauref;
            }

            if(x==2) {
                System.out.println("Veuillez rentrer la nouvelle liste de produits");
                ArrayList<Produit> nouvelle_liste = new ArrayList<>(3);
                ensembleProduits= nouvelle_liste;
            }

            if(x==3) {
                System.out.println("Veuillez rentrer le nouveau reference de gamme");
                String nouveauref = Lire.S();
                refGamme= nouveauref;

                System.out.println("Veuillez rentrer la nouvelle liste de produits");
                ArrayList<Produit> nouvelle_liste = new ArrayList<>(3);
                ensembleProduits= nouvelle_liste;
            }

        }



    public void supprimerGamme(String refGamme){
        System.out.println("Veuillez entrer le reference de gamme a supprimer");
        String n=Lire.S();

        if(n==refGamme){
            this.refGamme
        }

    }


    public void afficheGamme(){
        System.out.println("reference de gamme '"+this.refGamme+"' liste de produits "+this.ensembleProduits);
    }


}
