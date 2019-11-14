package plateau;

import emplacement.*;
import joueur.Joueur;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * @author adrie
 */
public class PlateauDeJeu {

    private static ArrayList<Case> plateau;
    private LinkedList<Joueur> joueurs;

    public void init() {
        NonAchetable Depart = new NonAchetable();
        Depart.setNomCase("Départ");
        Depart.setNumCase(0);
        plateau = new ArrayList<Case>();
        this.plateau.add(Depart);
        joueurs = new LinkedList<Joueur>();

        Constructible BoulevardDeBelleville = new Constructible();
        BoulevardDeBelleville.setNumCase(1);
        BoulevardDeBelleville.setNomCase("Boulevard De Belleville");
        BoulevardDeBelleville.setPrix(1400);
        BoulevardDeBelleville.setNbMaison(0);
        BoulevardDeBelleville.setLoyerMaison(1000);
        BoulevardDeBelleville.setLoyerHotel(1000);
        this.plateau.add(BoulevardDeBelleville);

        NonAchetable CaisseDeCommunaute1 = new NonAchetable();
        CaisseDeCommunaute1.setNomCase("Caisse de Communauté");
        CaisseDeCommunaute1.setNumCase(2);
        this.plateau.add(CaisseDeCommunaute1);

        Constructible RueLecourbe = new Constructible();
        RueLecourbe.setNumCase(3);
        RueLecourbe.setNomCase("Rue Lecourbe");
        RueLecourbe.setPrix(1500);
        RueLecourbe.setNbMaison(0);
        RueLecourbe.setLoyerMaison(1100);
        RueLecourbe.setLoyerHotel(1100);
        this.plateau.add(RueLecourbe);

        NonAchetable ImpotsSurLeRevenu = new NonAchetable();
        ImpotsSurLeRevenu.setNomCase("Impots Sur Le Revenu");
        ImpotsSurLeRevenu.setNumCase(4);
        this.plateau.add(ImpotsSurLeRevenu);

        Gare Montparnasse = new Gare();
        Montparnasse.setNomCase("Gare Montparnasse");
        Montparnasse.setNumCase(5);
        Montparnasse.setPrix(2500);
        this.plateau.add(Montparnasse);

        Constructible RueDeVaugirard = new Constructible();
        RueDeVaugirard.setNumCase(6);
        RueDeVaugirard.setNomCase("Rue De Vaugirard");
        RueDeVaugirard.setPrix(1600);
        RueDeVaugirard.setNbMaison(0);
        RueDeVaugirard.setLoyerMaison(1200);
        RueDeVaugirard.setLoyerHotel(1200);
        this.plateau.add(RueDeVaugirard);

        NonAchetable Chance1 = new NonAchetable();
        Chance1.setNomCase("Chance");
        Chance1.setNumCase(7);
        this.plateau.add(Chance1);

        Constructible RueDeCourcelle = new Constructible();
        RueDeCourcelle.setNumCase(8);
        RueDeCourcelle.setNomCase("Rue De Courcelle");
        RueDeCourcelle.setPrix(1700);
        RueDeCourcelle.setNbMaison(0);
        RueDeCourcelle.setLoyerMaison(1300);
        RueDeCourcelle.setLoyerHotel(1300);
        this.plateau.add(RueDeCourcelle);

        Constructible AvenueDeLaRepublique = new Constructible();
        AvenueDeLaRepublique.setNumCase(9);
        AvenueDeLaRepublique.setNomCase("Avenue De La Republique");
        AvenueDeLaRepublique.setPrix(1800);
        AvenueDeLaRepublique.setNbMaison(0);
        AvenueDeLaRepublique.setLoyerMaison(1400);
        AvenueDeLaRepublique.setLoyerHotel(1400);
        this.plateau.add(AvenueDeLaRepublique);

        NonAchetable Prison = new NonAchetable();
        Prison.setNomCase("Prison");
        Prison.setNumCase(10);
        this.plateau.add(Prison);

        Constructible BoulevardDeLaVilette = new Constructible();
        BoulevardDeLaVilette.setNumCase(11);
        BoulevardDeLaVilette.setNomCase("Boulevard De La Vilette");
        BoulevardDeLaVilette.setPrix(1900);
        BoulevardDeLaVilette.setNbMaison(0);
        BoulevardDeLaVilette.setLoyerMaison(1400);
        BoulevardDeLaVilette.setLoyerHotel(1400);
        this.plateau.add(BoulevardDeLaVilette);

        NonAchetable Electricite = new NonAchetable();
        Electricite.setNomCase("Electricite");
        Electricite.setNumCase(12);
        this.plateau.add(Electricite);

        Constructible AvenueDeNeuilly = new Constructible();
        AvenueDeNeuilly.setNumCase(13);
        AvenueDeNeuilly.setNomCase("Avenue De Neuilly");
        AvenueDeNeuilly.setPrix(2000);
        AvenueDeNeuilly.setNbMaison(0);
        AvenueDeNeuilly.setLoyerMaison(1500);
        AvenueDeNeuilly.setLoyerHotel(1500);
        this.plateau.add(AvenueDeNeuilly);

        Constructible RueDeParadis = new Constructible();
        RueDeParadis.setNumCase(14);
        RueDeParadis.setNomCase("Rue De Paradis");
        RueDeParadis.setPrix(2100);
        RueDeParadis.setNbMaison(0);
        RueDeParadis.setLoyerMaison(1600);
        RueDeParadis.setLoyerHotel(1600);
        this.plateau.add(RueDeParadis);

        Gare Lyon = new Gare();
        Lyon.setNomCase("Gare de Lyon");
        Lyon.setNumCase(15);
        Lyon.setPrix(2500);
        this.plateau.add(Lyon);

        Constructible AvenueMozart = new Constructible();
        AvenueMozart.setNumCase(16);
        AvenueMozart.setNomCase("Avenue Mozart");
        AvenueMozart.setPrix(2100);
        AvenueMozart.setNbMaison(0);
        RueDeParadis.setLoyerMaison(1700);
        RueDeParadis.setLoyerHotel(1700);
        this.plateau.add(AvenueMozart);

        NonAchetable CaisseDeCommunaute2 = new NonAchetable();
        CaisseDeCommunaute2.setNomCase("Caisse de Communauté");
        CaisseDeCommunaute2.setNumCase(17);
        this.plateau.add(CaisseDeCommunaute2);

        Constructible BoulevardSaintMichel = new Constructible();
        BoulevardSaintMichel.setNumCase(18);
        BoulevardSaintMichel.setNomCase("Boulevard Saint Michel");
        BoulevardSaintMichel.setPrix(2200);
        BoulevardSaintMichel.setNbMaison(0);
        BoulevardSaintMichel.setLoyerMaison(1800);
        BoulevardSaintMichel.setLoyerHotel(1800);
        this.plateau.add(BoulevardSaintMichel);

        Constructible PlacePigalle = new Constructible();
        PlacePigalle.setNumCase(19);
        PlacePigalle.setNomCase("Place Pigalle");
        PlacePigalle.setPrix(2300);
        PlacePigalle.setNbMaison(0);
        PlacePigalle.setLoyerMaison(1900);
        PlacePigalle.setLoyerHotel(1900);
        this.plateau.add(PlacePigalle);

        NonAchetable ParcGratuit = new NonAchetable();
        ParcGratuit.setNomCase("Parc Gratuit");
        ParcGratuit.setNumCase(20);
        this.plateau.add(ParcGratuit);

        Constructible AvenueMatignon = new Constructible();
        AvenueMatignon.setNumCase(21);
        AvenueMatignon.setNomCase("Avenue Matignon");
        AvenueMatignon.setPrix(2400);
        AvenueMatignon.setNbMaison(0);
        AvenueMatignon.setLoyerMaison(2000);
        AvenueMatignon.setLoyerHotel(2000);
        this.plateau.add(AvenueMatignon);

        NonAchetable Chance2 = new NonAchetable();
        Chance2.setNomCase("Chance");
        Chance2.setNumCase(22);
        this.plateau.add(Chance2);

        Constructible BoulevardMalesherbes = new Constructible();
        BoulevardMalesherbes.setNumCase(23);
        BoulevardMalesherbes.setNomCase("Boulevard Malesherbes");
        BoulevardMalesherbes.setPrix(2500);
        BoulevardMalesherbes.setNbMaison(0);
        BoulevardMalesherbes.setLoyerMaison(2100);
        BoulevardMalesherbes.setLoyerHotel(2100);
        this.plateau.add(BoulevardMalesherbes);

        Constructible AvenueHenryMartin = new Constructible();
        AvenueHenryMartin.setNumCase(24);
        AvenueHenryMartin.setNomCase("Avenue Henry Martin");
        AvenueHenryMartin.setPrix(2600);
        AvenueHenryMartin.setNbMaison(0);
        AvenueHenryMartin.setLoyerMaison(2200);
        AvenueHenryMartin.setLoyerHotel(2200);
        this.plateau.add(AvenueHenryMartin);

        Gare Nord = new Gare();
        Nord.setNomCase("Gare du Nord");
        Nord.setNumCase(25);
        Nord.setPrix(2500);
        this.plateau.add(Nord);

        Constructible FaubourgSaintHonore = new Constructible();
        FaubourgSaintHonore.setNumCase(26);
        FaubourgSaintHonore.setNomCase("Faubourg Saint Honoré");
        FaubourgSaintHonore.setPrix(2700);
        FaubourgSaintHonore.setNbMaison(0);
        FaubourgSaintHonore.setLoyerMaison(2300);
        FaubourgSaintHonore.setLoyerHotel(2300);
        this.plateau.add(FaubourgSaintHonore);

        Constructible PlaceDeLaBourse = new Constructible();
        PlaceDeLaBourse.setNumCase(27);
        PlaceDeLaBourse.setNomCase("Place De La Bourse");
        PlaceDeLaBourse.setPrix(2800);
        PlaceDeLaBourse.setNbMaison(0);
        PlaceDeLaBourse.setLoyerMaison(2400);
        PlaceDeLaBourse.setLoyerHotel(2400);
        this.plateau.add(PlaceDeLaBourse);

        NonAchetable DistributionDesEaux = new NonAchetable();
        DistributionDesEaux.setNomCase("Distribution Des Eaux");
        DistributionDesEaux.setNumCase(28);
        this.plateau.add(DistributionDesEaux);

        Constructible RueDeLaFayette = new Constructible();
        RueDeLaFayette.setNumCase(29);
        RueDeLaFayette.setNomCase("Rue De La Fayette");
        RueDeLaFayette.setPrix(2900);
        RueDeLaFayette.setNbMaison(0);
        RueDeLaFayette.setLoyerMaison(2500);
        RueDeLaFayette.setLoyerHotel(2500);
        this.plateau.add(RueDeLaFayette);

        NonAchetable AllezEnPrison = new NonAchetable();
        AllezEnPrison.setNomCase("Allez En Prison");
        AllezEnPrison.setNumCase(30);
        this.plateau.add(AllezEnPrison);

        Constructible AvenueDeBreteuil = new Constructible();
        AvenueDeBreteuil.setNumCase(31);
        AvenueDeBreteuil.setNomCase("Avenue De Breteuil");
        AvenueDeBreteuil.setPrix(3000);
        AvenueDeBreteuil.setNbMaison(0);
        AvenueDeBreteuil.setLoyerMaison(2600);
        AvenueDeBreteuil.setLoyerHotel(2600);
        this.plateau.add(AvenueDeBreteuil);

        Constructible AvenueFoch = new Constructible();
        AvenueFoch.setNumCase(32);
        AvenueFoch.setNomCase("Avenue Foch");
        AvenueFoch.setPrix(3100);
        AvenueFoch.setNbMaison(0);
        AvenueFoch.setLoyerMaison(2700);
        AvenueFoch.setLoyerHotel(2700);
        this.plateau.add(AvenueFoch);

        NonAchetable CaisseDeCommunaute3 = new NonAchetable();
        CaisseDeCommunaute3.setNomCase("Caisse de Communauté");
        CaisseDeCommunaute3.setNumCase(33);
        this.plateau.add(CaisseDeCommunaute3);

        Constructible BoulevardDesCapucines = new Constructible();
        BoulevardDesCapucines.setNumCase(34);
        BoulevardDesCapucines.setNomCase("Boulevard Des Capucines");
        BoulevardDesCapucines.setPrix(3200);
        BoulevardDesCapucines.setNbMaison(0);
        BoulevardDesCapucines.setLoyerMaison(2800);
        BoulevardDesCapucines.setLoyerHotel(2800);
        this.plateau.add(BoulevardDesCapucines);

        Gare SaintLazarre = new Gare();
        SaintLazarre.setNomCase("Gare Saint Lazarre");
        SaintLazarre.setNumCase(35);
        SaintLazarre.setPrix(2500);
        this.plateau.add(SaintLazarre);

        NonAchetable Chance3 = new NonAchetable();
        Chance3.setNomCase("Chance");
        Chance3.setNumCase(36);
        this.plateau.add(Chance3);

        Constructible AvenueDesChampsElysee = new Constructible();
        AvenueDesChampsElysee.setNumCase(37);
        AvenueDesChampsElysee.setNomCase("Avenue Des Champs Elysee");
        AvenueDesChampsElysee.setPrix(3300);
        AvenueDesChampsElysee.setNbMaison(0);
        AvenueDesChampsElysee.setLoyerMaison(2900);
        AvenueDesChampsElysee.setLoyerHotel(2900);
        this.plateau.add(AvenueDesChampsElysee);

        NonAchetable TaxeDeLuxe = new NonAchetable();
        TaxeDeLuxe.setNomCase("Taxe De Luxe");
        TaxeDeLuxe.setNumCase(38);
        this.plateau.add(TaxeDeLuxe);

        Constructible RueDeLaPaix = new Constructible();
        RueDeLaPaix.setNumCase(39);
        RueDeLaPaix.setNomCase("Rue De La Paix");
        RueDeLaPaix.setPrix(3400);
        RueDeLaPaix.setNbMaison(0);
        RueDeLaPaix.setLoyerMaison(3000);
        RueDeLaPaix.setLoyerHotel(3000);
        this.plateau.add(RueDeLaPaix);

    }

    public static int nbGares(Joueur j) {
        int taille = plateau.size();
        int nbGare = 0;
        for (int i = 0; i < taille; i++) {
            Case emplacement = plateau.get(i);
            if (
                    emplacement instanceof Gare) {
                if (
                        ((Gare) emplacement).getProprietaire() == j) {
                    nbGare += 1;
                }
            }
        }
        return nbGare;
    }

    public void affiche() {
        int taille = plateau.size();
        for (int i = 0; i < taille; i++) {
            System.out.println(plateau.get(i));
        }
    }

    public Case avance(int d, Case c) {
        return (plateau.get(c.getNumCase() + d));
    }

    private int lancerDe() {
        Random generateurAleatoire = new Random();
        return (generateurAleatoire.nextInt(6) + 1);
    }

    private void tourDeJeu() {
        int nbJoueurs = joueurs.size();
        for (int i = 0; i < nbJoueurs; i++) {
            Joueur j = joueurs.get(i);
            int nbAleatoire = lancerDe() + lancerDe();
            Case nouvelleCase = avance(nbAleatoire, j.getPosition());
            j.setPosition(nouvelleCase);
            if (nouvelleCase instanceof Achetable) {
                if (((Achetable) nouvelleCase).getProprietaire() == null) {
                    if (j.getFortune() >= ((Achetable) nouvelleCase).getPrix()) {
                        switch (nbAleatoire % 2) {
                            case 1: {
                                j.setFortune(j.getFortune() - ((Achetable) nouvelleCase).getPrix());
                                ((Achetable) nouvelleCase).setProprietaire(j);
                                break;
                            }
                            default: {
                                break;
                            }
                        }
                    }
                } else {
                    if (((Achetable) nouvelleCase).getProprietaire() == j) {
                        if (nouvelleCase instanceof Constructible) {
                            switch (nbAleatoire % 2) {
                                case 0: {
                                    if (j.getFortune() >= ((Constructible) nouvelleCase).getLoyerMaison()) {
                                        ((Constructible) nouvelleCase).construire();
                                    }
                                    break;
                                }
                                default:
                                    break;
                            }
                        }
                    } else {
                        j.setFortune(j.getFortune() - ((Achetable) nouvelleCase).loyer());
                        //TODO: Eliminer jouer s'il n'a plus d'argent, s'il reste un seul joueur ensuite, ce dernier gagne la partie.
                    }
                }
            }
        }
    }
}