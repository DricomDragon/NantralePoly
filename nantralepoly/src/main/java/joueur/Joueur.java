package joueur;

import emplacement.Achetable;
import emplacement.Case;

public class Joueur {

    public String nom;
    public int fortune;
    public Case position;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getFortune() {
        return fortune;
    }

    public void setFortune(int fortune) {
        this.fortune = fortune;
    }

    public Case getPosition() {
        return position;
    }

    public void setPosition(Case position) {
        this.position = position;
    }

    /**
     * j1.paiement(j2) le joueur j2 tombe sur une case dont j1 est le
     * propriétaire l'argent va donc de j2 vers j1
     */
    public void paiement(Joueur j) {
        if (getPosition() instanceof Achetable) {
            int somme = Math.min(((Achetable) getPosition()).loyer(), j.getFortune()); // pour gérer le cas où le joueur n'a pas assez d'argent pour payer le loyer
            this.setFortune(this.getFortune() + somme);
            j.setFortune(j.getFortune() - somme);
        }
    }
}