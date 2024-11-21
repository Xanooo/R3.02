public class Amateur extends Participant{
    public Amateur(String nom, int score){
        super(nom, score);
    }

    @Override
    public String toString() {
        return "Amateur{" +
                "nom='" + nom + '\'' +
                ", score=" + score +
                '}';
    }
}
