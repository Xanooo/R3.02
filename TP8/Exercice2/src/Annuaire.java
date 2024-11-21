import java.util.HashMap;
import java.util.Map;

public class Annuaire {
    private Map<String, Integer> annuaire;
    public Annuaire() {
        annuaire = new HashMap<String, Integer>();
    }

    public Map<String, Integer> getAnnuaire() {
        return annuaire;
    }

    public void setAnnuaire(Map<String, Integer> annuaire) {
        this.annuaire = annuaire;
    }

    @Override
    public String toString() {
        return "Annuaire{" +
                "annuaire=" + annuaire +
                '}';
    }
}