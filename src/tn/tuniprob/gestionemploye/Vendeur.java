package tn.tuniprob.gestionemploye;

public class Vendeur extends Employe{

    private float tauxDeVente;

    public Vendeur (int id, String nom, String adresse, int nbHeures,float tauxDeVente) {

        super(id,adresse,nom,nbHeures);
        this.tauxDeVente=tauxDeVente;

    }


    @Override
    public String toString(){
        return super.toString()+" | taux de ventes :"+tauxDeVente+" salaire ="+calculSalaire();
    }



    @Override
    public double calculSalaire(){

        return 450*0.1*tauxDeVente;
    }
}
