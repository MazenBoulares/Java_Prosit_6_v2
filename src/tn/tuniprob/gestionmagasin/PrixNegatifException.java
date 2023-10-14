package tn.tuniprob.gestionmagasin;

public class PrixNegatifException extends Exception {
    public PrixNegatifException(String errorMessage){
        super(errorMessage);
    }
}
