package emplacement;

import joueur.Joueur;
import plateau.PlateauDeJeu;

public class Gare extends Achetable {

    public Gare() {
        super();
    }

    public Gare(int numCase, String nomCase, int prix) {
        this.numCase = numCase;
        this.nomCase = nomCase;
        this.prix = prix;
    }

    public Gare(int numCase, String nomCase, int prix, Joueur proprietaire) {
        this.numCase = numCase;
        this.nomCase = nomCase;
        this.prix = prix;
        this.proprietaire = proprietaire;
    }

    public int loyer() {
        if (this.getProprietaire() == null) {
            return 0;
        } else {
            return 2500 * PlateauDeJeu.nbGares(this.getProprietaire());
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}