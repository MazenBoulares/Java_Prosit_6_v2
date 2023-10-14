package tn.tuniprob.gestionemploye;

public class Caissier extends Employe{
private int numeroDeCaisse;
    public Caissier (int id, String nom, String adresse, int nbHeures, int numeroDeCaisse) {

        super(id,adresse,nom,nbHeures);
        this.numeroDeCaisse=numeroDeCaisse;

    }


    @Override
    public String toString(){
        return super.toString()+" | num de caisse :"+numeroDeCaisse+" salaire ="+calculSalaire();

                //
    }


    @Override
    public double calculSalaire(){
        if(this.nbHeures>=180){
            return this.nbHeures*(5+(5*0.15));

        }
        return this.nbHeures*5;
    }
}
