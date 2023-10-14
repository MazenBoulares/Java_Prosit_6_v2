package tn.tuniprob.gestionproduit
        ;

import java.util.Date;

public class Produit {

    private int id;
    private String lib;
    private String marque;
    private float prix;

    private Date dateExp;

//savoir le nombre totale de tous les produits


    //Constructeur sans prix
    public Produit(int id, String lib, String marque) {

        this.id = id;

        this.lib = lib;
        this.marque = marque;


    }


    //Constructeur sans date
    public Produit(int id, String lib, String marque, Float prix) {
        if (prix >= 0) {

            this.id = id;

            this.lib = lib;
            this.marque = marque;

            this.prix = prix;
        } else {
            System.out.println(" prix doit etre postive");
        }

    }


    public Produit(int id, String lib, String marque, Date date) {

        this.id = id;

        this.lib = lib;
        this.marque = marque;
        this.prix = prix;


        this.dateExp = date;
    }


    public void afficher() {
        System.out.println(this.id + " " + this.lib + " " + this.marque + " " + this.prix);
    }


    //getters & setters pour prix


    public void setPrix(float prix) {
        this.prix = prix;
    }


    public void setDate(Date dateGiven) {
        this.dateExp = dateGiven;
    }


    @Override
    public String toString() {
        return "Produit [" + this.id + " " + this.lib + " " + this.marque + " " + this.prix + " " + this.dateExp + "]";
    }


    // Prosit N°3

    /* 1) Créer une méthode qui permet de tester la conformité de produits, */

    //façon 1 : 1 seule parametre

    // selon ma recherche, le best practise lorsque on utulise l'encapsulation et d'utuliser des getters and setters meme si on a accés au attributs de p1 dans la class produit

    public boolean comparer(Produit p1) {
        if ((this.id == p1.id) && (this.lib.equals(p1.lib)) && (this.prix == p1.prix)) {
            return true;

        } else
            return false;
    }


    // les getters & setters pour acceder au attributs des produits


    public int getId() {
        return id;
    }

    public String getLib() {
        return lib;
    }

    public float getPrix() {
        return prix;
    }




}
