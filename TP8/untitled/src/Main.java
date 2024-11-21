public class Main {
    public static void main(String[] args) {
        Competition competition = new Competition();
        Amateur amateur = new Amateur("T", "Cyril", "Marseille", 19);
        competition.addAmateur(amateur);
        competition.listeCompetition();
    }
}
