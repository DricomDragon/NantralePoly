package Case;

public abstract class Achetable extends Case{
    int prix;
    Joueur proprietaire;

    public Achetable(){
    }

    public Achetable(int numCase, String nomCase, int prix, Joueur proprietaire) {
        super(numCase, nomCase);
        this.prix = prix;
        this.proprietaire = proprietaire;
    }

    public Achetable(Achetable achetable){
        super(achetable);
        this.nomCase = achetable.getNomCase();
        this.proprietaire = achetable.getProprietaire();
    }


    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public abstract void acheter(Joueur joueur){
        this.setProprietaire(joueur);
    }

    public abstract int loyer(Joueur joueur);

    public String toString(){
        String s = super.toString();
        if(this.getProprietaire() == null){
            return s + "(coût : " + this.getPrix() + "€) - sans propriétaire";
        }
        else{
            return s + "(coût : " + this.getPrix() + "€) - propriétaire : " + this.getProprietaire().getNom() + ", ";
        }

    }

    public void reset(){
        this.setProprietaire(null);
    }
}