import plateau.PlateauDeJeu;

class Game {

    public static void main(String[] args) {
        System.out.println("NantralePoly demarre.");

        PlateauDeJeu plateauDeJeu = new PlateauDeJeu();
        plateauDeJeu.init();
        plateauDeJeu.affiche();

        System.out.println("Fin du programme.");
    }
}

