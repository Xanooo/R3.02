public class Competiteur extends Participant implements Comparable<Competiteur> {
    public Competiteur(String nom, int score){
        super(nom, score);
    }

    @Override
    public int compareTo(Competiteur o) {
        return Integer.compare(this.getScore(), o.getScore());
    }

    @Override
    public String toString() {
        return "Competiteur{" +
                "score=" + score +
                ", nom='" + nom + '\'' +
                '}';
    }
}
