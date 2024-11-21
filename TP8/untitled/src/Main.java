public class Main {
    public static void main(String[] args) {
        Competition competition = new Competition();
        Amateur amateur = new Amateur("Cyril", 9);
        Amateur amateur1 = new Amateur("Theo", 0);
        competition.addAmateur(amateur);
        competition.addAmateur(amateur1);
        System.out.println(competition.getSetAmateur());
        System.out.println(competition.sizeAmateur());
        System.out.println(competition.isInCompetitionAmateur(amateur));
        competition.afficherAmateur();
        Competiteur competiteur = new Competiteur("Theo", 1);
        Competiteur competiteur1 = new Competiteur("Cyril", 13);
        competition.addCompetiteur(competiteur);
        competition.addCompetiteur(competiteur1);
        System.out.println(competition.getSetCompetiteur());
        Competiteur competiteur2 = new Competiteur("Theo", 2);
        competition.addCompetiteur(competiteur2);
        System.out.println(competition.getSetCompetiteur());
    }
}
