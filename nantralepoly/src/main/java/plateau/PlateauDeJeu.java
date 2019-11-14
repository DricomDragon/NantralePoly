package plateau;

import emplacement.Case;
import emplacement.Constructible;
import emplacement.Gare;
import emplacement.NonAchetable;
import joueur.Joueur;

import java.util.ArrayList;

/**
 *
 * @author adrie
 */
public class PlateauDeJeu {

    private ArrayList<Case> plateau;

    public void init(){
        NonAchetable Depart = new NonAchetable();
        Depart.setNomCase("Départ");
        Depart.setNumCase(0);
        plateau = new ArrayList<Case>();
        this.plateau.add(Depart);

        Constructible BoulevardDeBelleville = new Constructible();
        BoulevardDeBelleville.setNumCase(1);
        BoulevardDeBelleville.setNomCase("Boulevard De Belleville");
        BoulevardDeBelleville.setPrix(1400);
        BoulevardDeBelleville.setNombreMaison(0);
        BoulevardDeBelleville.setNombreHotel(0);
        BoulevardDeBelleville.setPrixMaison(1000);
        BoulevardDeBelleville.setPrixHotel(1000);
        this.plateau.add(BoulevardDeBelleville);

        NonAchetable CaisseDeCommunaute1 = new NonAchetable();
        CaisseDeCommunaute1.setNomCase("Caisse de Communauté");
        CaisseDeCommunaute1.setNumCase(2);
        this.plateau.add(CaisseDeCommunaute1);

        Constructible RueLecourbe = new Constructible();
        RueLecourbe.setNumCase(3);
        RueLecourbe.setNomCase("Rue Lecourbe");
        RueLecourbe.setPrix(1500);
        RueLecourbe.setNombreMaison(0);
        RueLecourbe.setNombreHotel(0);
        RueLecourbe.setPrixMaison(1100);
        RueLecourbe.setPrixHotel(1100);
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
        RueDeVaugirard.setNombreMaison(0);
        RueDeVaugirard.setNombreHotel(0);
        RueDeVaugirard.setPrixMaison(1200);
        RueDeVaugirard.setPrixHotel(1200);
        this.plateau.add(RueDeVaugirard);

        NonAchetable Chance1 = new NonAchetable();
        Chance1.setNomCase("Chance");
        Chance1.setNumCase(7);
        this.plateau.add(Chance1);

        Constructible RueDeCourcelle = new Constructible();
        RueDeCourcelle.setNumCase(8);
        RueDeCourcelle.setNomCase("Rue De Courcelle");
        RueDeCourcelle.setPrix(1700);
        RueDeCourcelle.setNombreMaison(0);
        RueDeCourcelle.setNombreHotel(0);
        RueDeCourcelle.setPrixMaison(1300);
        RueDeCourcelle.setPrixHotel(1300);
        this.plateau.add(RueDeCourcelle);

        Constructible AvenueDeLaRepublique = new Constructible();
        AvenueDeLaRepublique.setNumCase(9);
        AvenueDeLaRepublique.setNomCase("Avenue De La Republique");
        AvenueDeLaRepublique.setPrix(1800);
        AvenueDeLaRepublique.setNombreMaison(0);
        AvenueDeLaRepublique.setNombreHotel(0);
        AvenueDeLaRepublique.setPrixMaison(1400);
        AvenueDeLaRepublique.setPrixHotel(1400);
        this.plateau.add(AvenueDeLaRepublique);

        NonAchetable Prison = new NonAchetable();
        Prison.setNomCase("Prison");
        Prison.setNumCase(10);
        this.plateau.add(Prison);

        Constructible BoulevardDeLaVilette = new Constructible();
        BoulevardDeLaVilette.setNumCase(11);
        BoulevardDeLaVilette.setNomCase("Boulevard De La Vilette");
        BoulevardDeLaVilette.setPrix(1900);
        BoulevardDeLaVilette.setNombreMaison(0);
        BoulevardDeLaVilette.setNombreHotel(0);
        BoulevardDeLaVilette.setPrixMaison(1400);
        BoulevardDeLaVilette.setPrixHotel(1400);
        this.plateau.add(BoulevardDeLaVilette);

        NonAchetable Electricite = new NonAchetable();
        Electricite.setNomCase("Electricite");
        Electricite.setNumCase(12);
        this.plateau.add(Electricite);

        Constructible AvenueDeNeuilly = new Constructible();
        AvenueDeNeuilly.setNumCase(13);
        AvenueDeNeuilly.setNomCase("Avenue De Neuilly");
        AvenueDeNeuilly.setPrix(2000);
        AvenueDeNeuilly.setNombreMaison(0);
        AvenueDeNeuilly.setNombreHotel(0);
        AvenueDeNeuilly.setPrixMaison(1500);
        AvenueDeNeuilly.setPrixHotel(1500);
        this.plateau.add(AvenueDeNeuilly);

        Constructible RueDeParadis = new Constructible();
        RueDeParadis.setNumCase(14);
        RueDeParadis.setNomCase("Rue De Paradis");
        RueDeParadis.setPrix(2100);
        RueDeParadis.setNombreMaison(0);
        RueDeParadis.setNombreHotel(0);
        RueDeParadis.setPrixMaison(1600);
        RueDeParadis.setPrixHotel(1600);
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
        AvenueMozart.setNombreMaison(0);
        AvenueMozart.setNombreHotel(0);
        RueDeParadis.setPrixMaison(1700);
        RueDeParadis.setPrixHotel(1700);
        this.plateau.add(AvenueMozart);

        NonAchetable CaisseDeCommunaute2 = new NonAchetable();
        CaisseDeCommunaute2.setNomCase("Caisse de Communauté");
        CaisseDeCommunaute2.setNumCase(17);
        this.plateau.add(CaisseDeCommunaute2);

        Constructible BoulevardSaintMichel = new Constructible();
        BoulevardSaintMichel.setNumCase(18);
        BoulevardSaintMichel.setNomCase("Boulevard Saint Michel");
        BoulevardSaintMichel.setPrix(2200);
        BoulevardSaintMichel.setNombreMaison(0);
        BoulevardSaintMichel.setNombreHotel(0);
        BoulevardSaintMichel.setPrixMaison(1800);
        BoulevardSaintMichel.setPrixHotel(1800);
        this.plateau.add(BoulevardSaintMichel);

        Constructible PlacePigalle = new Constructible();
        PlacePigalle.setNumCase(19);
        PlacePigalle.setNomCase("Place Pigalle");
        PlacePigalle.setPrix(2300);
        PlacePigalle.setNombreMaison(0);
        PlacePigalle.setNombreHotel(0);
        PlacePigalle.setPrixMaison(1900);
        PlacePigalle.setPrixHotel(1900);
        this.plateau.add(PlacePigalle);

        NonAchetable ParcGratuit = new NonAchetable();
        ParcGratuit.setNomCase("Parc Gratuit");
        ParcGratuit.setNumCase(20);
        this.plateau.add(ParcGratuit);

        Constructible AvenueMatignon = new Constructible();
        AvenueMatignon.setNumCase(21);
        AvenueMatignon.setNomCase("Avenue Matignon");
        AvenueMatignon.setPrix(2400);
        AvenueMatignon.setNombreMaison(0);
        AvenueMatignon.setNombreHotel(0);
        AvenueMatignon.setPrixMaison(2000);
        AvenueMatignon.setPrixHotel(2000);
        this.plateau.add(AvenueMatignon);

        NonAchetable Chance2 = new NonAchetable();
        Chance2.setNomCase("Chance");
        Chance2.setNumCase(22);
        this.plateau.add(Chance2);

        Constructible BoulevardMalesherbes = new Constructible();
        BoulevardMalesherbes.setNumCase(23);
        BoulevardMalesherbes.setNomCase("Boulevard Malesherbes");
        BoulevardMalesherbes.setPrix(2500);
        BoulevardMalesherbes.setNombreMaison(0);
        BoulevardMalesherbes.setNombreHotel(0);
        BoulevardMalesherbes.setPrixMaison(2100);
        BoulevardMalesherbes.setPrixHotel(2100);
        this.plateau.add(BoulevardMalesherbes);

        Constructible AvenueHenryMartin = new Constructible();
        AvenueHenryMartin.setNumCase(24);
        AvenueHenryMartin.setNomCase("Avenue Henry Martin");
        AvenueHenryMartin.setPrix(2600);
        AvenueHenryMartin.setNombreMaison(0);
        AvenueHenryMartin.setNombreHotel(0);
        AvenueHenryMartin.setPrixMaison(2200);
        AvenueHenryMartin.setPrixHotel(2200);
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
        FaubourgSaintHonore.setNombreMaison(0);
        FaubourgSaintHonore.setNombreHotel(0);
        FaubourgSaintHonore.setPrixMaison(2300);
        FaubourgSaintHonore.setPrixHotel(2300);
        this.plateau.add(FaubourgSaintHonore);

        Constructible PlaceDeLaBourse = new Constructible();
        PlaceDeLaBourse.setNumCase(27);
        PlaceDeLaBourse.setNomCase("Place De La Bourse");
        PlaceDeLaBourse.setPrix(2800);
        PlaceDeLaBourse.setNombreMaison(0);
        PlaceDeLaBourse.setNombreHotel(0);
        PlaceDeLaBourse.setPrixMaison(2400);
        PlaceDeLaBourse.setPrixHotel(2400);
        this.plateau.add(PlaceDeLaBourse);

        NonAchetable DistributionDesEaux = new NonAchetable();
        DistributionDesEaux.setNomCase("Distribution Des Eaux");
        DistributionDesEaux.setNumCase(28);
        this.plateau.add(DistributionDesEaux);

        Constructible RueDeLaFayette = new Constructible();
        RueDeLaFayette.setNumCase(29);
        RueDeLaFayette.setNomCase("Rue De La Fayette");
        RueDeLaFayette.setPrix(2900);
        RueDeLaFayette.setNombreMaison(0);
        RueDeLaFayette.setNombreHotel(0);
        RueDeLaFayette.setPrixMaison(2500);
        RueDeLaFayette.setPrixHotel(2500);
        this.plateau.add(RueDeLaFayette);

        NonAchetable AllezEnPrison = new NonAchetable();
        AllezEnPrison.setNomCase("Allez En Prison");
        AllezEnPrison.setNumCase(30);
        this.plateau.add(AllezEnPrison);

        Constructible AvenueDeBreteuil = new Constructible();
        AvenueDeBreteuil.setNumCase(31);
        AvenueDeBreteuil.setNomCase("Avenue De Breteuil");
        AvenueDeBreteuil.setPrix(3000);
        AvenueDeBreteuil.setNombreMaison(0);
        AvenueDeBreteuil.setNombreHotel(0);
        AvenueDeBreteuil.setPrixMaison(2600);
        AvenueDeBreteuil.setPrixHotel(2600);
        this.plateau.add(AvenueDeBreteuil);

        Constructible AvenueFoch = new Constructible();
        AvenueFoch.setNumCase(32);
        AvenueFoch.setNomCase("Avenue Foch");
        AvenueFoch.setPrix(3100);
        AvenueFoch.setNombreMaison(0);
        AvenueFoch.setNombreHotel(0);
        AvenueFoch.setPrixMaison(2700);
        AvenueFoch.setPrixHotel(2700);
        this.plateau.add(AvenueFoch);

        NonAchetable CaisseDeCommunaute3 = new NonAchetable();
        CaisseDeCommunaute3.setNomCase("Caisse de Communauté");
        CaisseDeCommunaute3.setNumCase(33);
        this.plateau.add(CaisseDeCommunaute3);

        Constructible BoulevardDesCapucines = new Constructible();
        BoulevardDesCapucines.setNumCase(34);
        BoulevardDesCapucines.setNomCase("Boulevard Des Capucines");
        BoulevardDesCapucines.setPrix(3200);
        BoulevardDesCapucines.setNombreMaison(0);
        BoulevardDesCapucines.setNombreHotel(0);
        BoulevardDesCapucines.setPrixMaison(2800);
        BoulevardDesCapucines.setPrixHotel(2800);
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
        AvenueDesChampsElysee.setNombreMaison(0);
        AvenueDesChampsElysee.setNombreHotel(0);
        AvenueDesChampsElysee.setPrixMaison(2900);
        AvenueDesChampsElysee.setPrixHotel(2900);
        this.plateau.add(AvenueDesChampsElysee);

        NonAchetable TaxeDeLuxe = new NonAchetable();
        TaxeDeLuxe.setNomCase("Taxe De Luxe");
        TaxeDeLuxe.setNumCase(38);
        this.plateau.add(TaxeDeLuxe);

        Constructible RueDeLaPaix = new Constructible();
        RueDeLaPaix.setNumCase(39);
        RueDeLaPaix.setNomCase("Rue De La Paix");
        RueDeLaPaix.setPrix(3400);
        RueDeLaPaix.setNombreMaison(0);
        RueDeLaPaix.setNombreHotel(0);
        RueDeLaPaix.setPrixMaison(3000);
        RueDeLaPaix.setPrixHotel(3000);
        this.plateau.add(RueDeLaPaix);

    }

    public static int nbGares(Joueur proprietaire) {
        return 0;
    }
}