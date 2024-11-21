import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Competition {
    private Set<Amateur> set;
    public Competition() {
        set = new HashSet<>();
    }

    public Set<Amateur> getSet() {
        return set;
    }

    public void setSet(Set<Amateur> set) {
        this.set = set;
    }

    public void addAmateur(Amateur amateur){
        set.add(amateur);
    }

    public boolean isInCompetition(Amateur amateur){
        return set.contains(amateur);
    }

    public String listeCompetition(){
        return set.toString();
    }


}
