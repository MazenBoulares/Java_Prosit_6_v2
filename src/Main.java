
import tn.tuniprob.gestionemploye.Caissier;
import tn.tuniprob.gestionemploye.Responsable;
import tn.tuniprob.gestionemploye.Vendeur;
import tn.tuniprob.gestionmagasin.Magasin;
import tn.tuniprob.gestionmagasin.MagasinclassException;
import tn.tuniprob.gestionmagasin.PrixNegatifException;
import tn.tuniprob.gestionproduit.Produit;

public class Main {

    public static void main(String[] args) {


        // Prosit 4 : ********************************************************


        Magasin g2 = new Magasin(2, "Carrefour", "Centre-Ville");
        Magasin g3 = new Magasin(3, "Monoprix", "Menzah 6");


//Créer et ajouter quelques produits pour chaque magasin
        Produit p1 = new Produit(1021, "Lait", "Delice", 1.200f);

        Produit p2 = new Produit(2510, "Yaourt", "Vitalait", 1.200f);

        Produit p3 = new Produit(3250, "Tomate", "Sicam", 1.200f);

        Produit p4 = new Produit(5489, "7lib", "delcie", 900f);

        p1.afficher();
        try {

            g2.ajouterProduit(p1);

            g2.ajouterProduit(p2);


            g3.ajouterProduit(p3);

            g3.ajouterProduit(p4);

        } catch (MagasinclassException e) {
            e.printStackTrace();
        } catch (PrixNegatifException e){
            e.printStackTrace();
        }




    }


}






