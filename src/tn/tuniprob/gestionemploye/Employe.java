package tn.tuniprob.gestionemploye;

public abstract class Employe {

    int identifiant;
    String nom;
    String adressse;
    int nbHeures;


    public Employe(int id, String nom, String adresse, int nbHeures) {
        this.identifiant = id;
        this.adressse = adresse;
        this.nom = nom;
        this.nbHeures = nbHeures;

    }

    @Override
    public String toString() {
        return "identifiant :" + identifiant + " | nom :" + nom + " | Adresse : " + adressse + " | nb heures :" + nbHeures;
    }

    public abstract double calculSalaire();

    @Override
    public boolean equals(Object o) {
        if (o instanceof Employe) {
            if (this.identifiant == ((Employe) o).identifiant && this.nom == ((Employe) o).nom)
                return true;
            else return false;

        } else
            return false;
    }


}
