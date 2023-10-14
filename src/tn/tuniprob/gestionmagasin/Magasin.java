package tn.tuniprob.gestionmagasin;

import tn.tuniprob.gestionemploye.Caissier;
import tn.tuniprob.gestionemploye.Responsable;
import tn.tuniprob.gestionemploye.Vendeur;
import tn.tuniprob.gestionproduit.Produit;
import tn.tuniprob.gestionemploye.Employe;

public class Magasin {
    private int id;


    private String lib;
    private String adress;

    private int capacity = 50;

    private Produit[] tab;

    private Employe[] tab2;

    private int nbEmploye = 0;

    //the number of products ( dans une seulke magasin)
    private int n;

    private static int nbProdGlobale;

    //constructor 1
    public Magasin(int id, String adress, int capacity) {
        tab = new Produit[2];

        tab2 = new Employe[100];

        this.n = 0;

        this.id = id;
        this.adress = adress;
        this.capacity = capacity;
    }

    //constructor2

    public Magasin(int id, String adress, String lib) {
        tab = new Produit[2];
        tab2 = new Employe[100];
        this.n = 0;

        this.lib = lib;

        this.id = id;
        this.adress = adress;

    }

/*
    public void ajouterProduit(Produit p) {
        if (this.n <= 50) {
            tab[n] = p;
            this.n = this.n + 1;
            System.out.println(this.n);
            this.nbProdGlobale = this.nbProdGlobale + 1;
        } else {
            System.out.println("la magasin a atteint sont capcité max ");
        }
    }
*/


    //recuperer nombre total de
    //tous les produits dans tous les magasins.
    public int getnbProdGlobale() {
        return this.nbProdGlobale;

    }


    // Prosit N°3

    /* 1) Créer une méthode qui permet de tester la conformité de produits, */

    //façon 2 : 2 parametres
    public boolean comparer(Produit p1, Produit p2) {

        if ((p1.getId() == p2.getId()) && (p1.getLib().equals(p2.getLib())) && (p1.getPrix() == p2.getPrix())) {

            return true;

        } else {

            return false;
        }
    }


    //2) Ajouter une autre méthode qui sert à chercher un produit dans un magasin

    public boolean recherche(Produit p) {

        if (n > 0) {


            int i = 0;

            System.out.println(this.comparer(tab[i], p));

            while ((i < n) && (this.comparer(tab[i], p) == false)) {


                i++;
            }


            //  if (tab[i].getId() == p.getId())


            if ((i < n) && this.comparer(tab[i], p) == true) {


                return true;
            } else
                return false;
        } else {


            return false;
        }
    }




    //4) Ajouter une méthode qui permet de supprimer un produit du magasin
    public void supprimerProduit(Produit p) {
        int i = 0;
        while ((i < n) && (!comparer(tab[i], p))) {
            i++;
        }
        //  l'element exist
        if (this.comparer(tab[i], p)) {

            //Creation d'un nouveau array
            Produit[] tab2 = new Produit[capacity - 1];

            int j = 0;
            for (int k = 0; i < n; i++) {

                if (!comparer(tab[k], p)) {

                    tab2[j] = tab[k];
                }
                j++;
            }
            //on a creerer un nouveau array qui contient tous les elements sauf le produit qu'on veut supprimer
            this.tab = tab2;
        }

    }


    //5) Créer une méthode qui retourne le magasin ayant un nombre supérieur de produits entre
    //deux magasins
    public int getN() {
        return this.n;

    }


    public Magasin comparerNbProd(Magasin m1) {
        if (this.n > m1.getN()) {
            return m1;

        } else
            return this;
    }


    //Prosit 4
    public void ajoutEmploye(Employe e) {
        this.nbEmploye++;
        System.out.println("nb_employe" + nbEmploye);
        tab2[nbEmploye - 1] = e;


    }


//prosit 5


    //afficher les caractéristiques du magasin
    public void afficherCaracter() {
        System.out.println(id + "   " + adress + "   " + capacity + "    " + lib);


        for (int i = 0; i < this.n; i++) {

            tab[i].afficher();

        }
        for (int i = 0; i < this.nbEmploye; i++) {

            System.out.println(tab2[i].toString());

        }
    }


    // Afficher les salaires de tous les employés dans un magasin
    public void afficherSalaire() {

        for (int i = 0; i < this.nbEmploye; i++) {

            System.out.println("salaire : " + tab2[i].calculSalaire());
        }
    }

    //-Afficher la prime que des responsable dans le magasin
    public void affichePrimeResponsable() {

        for (int i = 0; i < this.nbEmploye; i++) {

            if (tab2[i] instanceof Responsable) {

                System.out.println("le prime des responsables est: " + ((Responsable) tab2[i]).getPrime());
            }
        }
    }


    //Afficher le nombre des employés par type dans le magasin

    public void afficheParType() {

        int nbResp = 0;
        int nbCaissier = 0;
        int nbVendeur = 0;

        for (int i = 0; i < this.nbEmploye; i++) {

            if (tab2[i] instanceof Responsable) {

                nbResp++;
            }
            if (tab2[i] instanceof Caissier) {

                nbCaissier++;
            }

            if (tab2[i] instanceof Vendeur) {

                nbVendeur++;
            }
        }

        System.out.println("Nb des reponsables :" + nbResp + "| NB des caissiers : " + nbCaissier + " | NB de vendeurs : " + nbVendeur++);
    }


    //Ajouter la méthode public boolean equals(Object o) dans la classe Employe qui permet de comparer les employes selon l'identifiant et le nom.




// ******************** Prosit 6 ********************
    //3) Modifier la méthode afin d’ajouter un produit donné une seule fois
    public void ajouterProduit(Produit p) throws MagasinclassException, PrixNegatifException {
        if (this.n < 2 ) {

            if (this.recherche(p) == false) {



                if(p.getPrix()>0){
                    tab[n] = p;
                    this.n = this.n + 1;

                    this.nbProdGlobale = this.nbProdGlobale + 1;

                }
                else{
                    throw new PrixNegatifException("Le prix du produit ne peut pas etre negatif");
                }




            } else
                System.out.println("produit exist déja dans le magasin ! ");
       } else {
           throw new MagasinclassException("vous ne pouvez pas placer plus que 2 produits");
        }
    }
}



