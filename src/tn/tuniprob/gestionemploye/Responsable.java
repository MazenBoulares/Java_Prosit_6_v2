package tn.tuniprob.gestionemploye;

public class Responsable extends Employe{
    private float prime;
    public Responsable (int id, String nom, String adresse, int nbHeures,float prime) {

        super(id,adresse,nom,nbHeures);
        this.prime=prime;

    }


    @Override
    public String toString(){
        return super.toString()+" | prime :"+prime+" salaire ="+calculSalaire();


    }


    @Override
    public double calculSalaire(){
        if(this.nbHeures>=160){
            return this.nbHeures*(10+(10*0.2))+prime;

        }
        return this.nbHeures*10+prime;
    }


    public float getPrime() {
        return prime;
    }
}
