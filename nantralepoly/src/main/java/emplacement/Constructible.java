package emplacement;

import joueur.Joueur;

public class Constructible extends Achetable {
    private int loyerMaison;
    private int loyerHotel;
    private int nbMaison;

    public Constructible() {
    }

    public Constructible(int numCase, String nomCase, int prix, Joueur proprietaire, int loyerMaison, int loyerHotel) {
        super(numCase, nomCase, prix, proprietaire);
        this.loyerMaison = loyerMaison;
        this.loyerHotel = loyerHotel;
        this.nbMaison = 0;
    }

    public Constructible(int numCase, String nomCase, int prix, Joueur proprietaire, int loyerMaison, int loyerHotel, int nbMaison) {
        super(numCase, nomCase, prix, proprietaire);
        this.loyerMaison = loyerMaison;
        this.loyerHotel = loyerHotel;
        this.nbMaison = nbMaison;
    }

    public int getLoyerMaison() {
        return loyerMaison;
    }

    public int getLoyerHotel() {
        return loyerHotel;
    }

    public int getNbMaison() {
        return nbMaison;
    }

    public void setLoyerMaison(int loyerMaison) {
        this.loyerMaison = loyerMaison;
    }

    public void setLoyerHotel(int loyerHotel) {
        this.loyerHotel = loyerHotel;
    }

    public void setNbMaison(int nbMaison) {
        this.nbMaison = nbMaison;
    }

    public void reset(){
        super.reset();
        this.setNbMaison(0);
    }

    public int loyer(){
        int temp = (int) (this.getPrix()*0.05);
        if (this.getNbMaison() == 5) {
            return temp + this.getLoyerHotel();
        }
        else {
            return temp + this.getLoyerMaison() * this.getNbMaison();
        }
    }

    public void construire() {
        int somme = (int)(this.getPrix() * 0.1); // Le prix d'une maison correspond à 10% du prix du terrain
        this.getProprietaire().setFortune(this.getProprietaire().getFortune() - somme);
        this.setNbMaison(this.getNbMaison() + 1);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
