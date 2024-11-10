import java.util.ArrayList;
import java.util.List;

public class Arbre<T> {
    private Noeud<T> root;

    public Arbre(Noeud<T> root) {
        this.root = root;
    }

    public Arbre() {
        this.root = null;
    }

    public void addChildren(Arbre<T> fils) {
        if (root == null) root = fils.root;
        else this.root.addChildren(fils.root);


    }

    public Noeud<T> getRoot() {
        return root;
    }



    public List<T> parcoursPrefixe(Noeud<T> noeud) {
        List<T> list = new ArrayList<>();

        // Ajouter la valeur du nœud courant
        list.add(noeud.getValue());

        // Vérifier si le nœud n'est pas une feuille
        if (!noeud.isLeaf()) {
            for (Noeud<T> child : noeud.getChildren()) {
                if (child != null) {
                    // Appel récursif sur l'enfant
                    list.addAll(parcoursPrefixe(child));
                }
            }
        }

        return list;
    }

    public String toString(){
        if (root == null) return "Arbre vide";
        return parcoursPrefixe(root).toString();
    }

}
