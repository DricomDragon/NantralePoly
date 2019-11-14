package emplacement;

import joueur.Joueur;

public class Constructible extends Achetable {
    private int prixMaison;
    private int prixHotel;
    private int nombreMaison;
    private int nombreHotel;

    public Constructible() {
    }

    public Constructible(int numCase, String nomCase, int prix, Joueur proprietaire, int prixMaison, int prixHotel) {
        super(numCase, nomCase, prix, proprietaire);
        this.prixMaison = prixMaison;
        this.prixHotel = prixHotel;
        this.nombreMaison = 0;
        this.nombreHotel = 0;
    }

    public Constructible(int numCase, String nomCase, int prix, Joueur proprietaire, int prixMaison, int prixHotel, int nombreMaison, int nombreHotel) {
        super(numCase, nomCase, prix, proprietaire);
        this.prixMaison = prixMaison;
        this.prixHotel = prixHotel;
        this.nombreMaison = nombreMaison;
        this.nombreHotel = nombreHotel;
    }

    public int getPrixMaison() {
        return prixMaison;
    }

    public int getPrixHotel() {
        return prixHotel;
    }

    public int getNombreMaison() {
        return nombreMaison;
    }

    public int getNombreHotel() {
        return nombreHotel;
    }
    public void setPrixMaison(int prixMaison) {
        this.prixMaison = prixMaison;
    }

    public void setPrixHotel(int prixHotel) {
        this.prixHotel = prixHotel;
    }

    public void setNombreMaison(int nombreMaison) {
        this.nombreMaison = nombreMaison;
    }

    public void setNombreHotel(int nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public int loyer(){
        if (this.getProprietaire() == null) {
            return 0;
        }
        else {
            int temp = (int) (this.getPrix()*0.05);
            return temp + this.prixMaison * this.nombreMaison + this.nombreHotel * this.prixHotel;
        }
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
