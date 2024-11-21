import java.util.*;

public class Competition {
    private Set<Amateur> setAmateur;
    private Set<Competiteur> setCompetiteur;

    public Competition() {
        this.setAmateur = new HashSet<>();
        this.setCompetiteur = new TreeSet<>();
    }

    public Set<Amateur> getSetAmateur() {
        return setAmateur;
    }

    public Set<Competiteur> getSetCompetiteur() {
        return setCompetiteur;
    }

    public int sizeAmateur() {
        return setAmateur.size();
    }

    public int sizeCompetiteur() {
        return setCompetiteur.size();
    }

    public void setSetAmateur(Set<Amateur> set) {
        this.setAmateur = set;
    }

    public void setSetCompetiteur(Set<Competiteur> set) {
        this.setCompetiteur = set;
    }

    public void addAmateur(Amateur amateur){
        setAmateur.add(amateur);
        System.out.println(amateur.getNom() + " a été ajouté !");
    }

    public void addCompetiteur(Competiteur competiteur){
        setCompetiteur.add(competiteur);
        System.out.println(competiteur.getNom() + " a été ajouté !");
    }

    public boolean isInCompetitionAmateur(Amateur amateur){
        return setAmateur.contains(amateur);
    }

    public boolean isInCompetitionCompetiteur(Competiteur competiteur){
        return setCompetiteur.contains(competiteur);
    }

    public void afficherAmateur(){
        System.out.print("Liste des participants : ");
        for (Amateur amateur : setAmateur){
            System.out.print(amateur.getNom() + " ");
        }
    }

    public void afficherCompetiteur(){
        System.out.print("Liste des competiteurs : ");
        for (Competiteur competiteur : setCompetiteur){
            System.out.print(competiteur.getNom() + " ");
        }
    }
}
