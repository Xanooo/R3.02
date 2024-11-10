import java.util.List;

public class Main {
    public static void main(String[] args) {
        Noeud<String> html = new Noeud<>("html");
        Noeud<String> head = new Noeud<>("head");
        Noeud<String> body = new Noeud<>("body");
        Arbre<String> arbreHTML = new Arbre<>(html);
        Arbre<String> arbreHead = new Arbre<>(head);
        Arbre<String> arbreBody = new Arbre<>(body);
        Noeud<String> title = new Noeud<>("title");
        Noeud<String> contenuTitre = new Noeud<>("Page test");

        Noeud<String> h1 = new Noeud<>("h1");
        Noeud<String> contenuH1 = new Noeud<>("Titre niveau 1");
        Noeud<String> p = new Noeud<>("p");
        Noeud<String> contenuP = new Noeud<>("Ceci est un paragraphe");


        head.addChildren(title);
        title.addChildren(contenuTitre);
        body.addChildren(h1);
        h1.addChildren(contenuH1);
        body.addChildren(p);
        p.addChildren(contenuP);

        arbreHTML.addChildren(arbreHead);
        arbreHTML.addChildren(arbreBody);

        System.out.println(arbreHTML.toString());

        Noeud<String> minus = new Noeud<>("-");
        Noeud<String> times = new Noeud<>("*");
        Noeud<String> minus2 = new Noeud<>("-");
        Noeud<String> plus = new Noeud<>("+");

        Arbre<String> arbreMinus = new Arbre<>(minus);
        Arbre<String> arbreTimes = new Arbre<>(times);
        Arbre<String> arbreMinus2 = new Arbre<>(minus2);
        Arbre<String> arbrePlus = new Arbre<>(plus);

        Noeud<String> cinq = new Noeud<>("5");
        Noeud<String> deux = new Noeud<>("2");
        times.addChildren(cinq);
        times.addChildren(plus);




    }

    /*
    Exercice 1
    Q1 : On peut utiliser un arbre afin de structurer une hierarchie d'entreprise
    avec un patron ainsi que ses employés. Egalement, nous pouvons s'en servir dans un arbre
    généalogique, avec grands-parents et petits-enfants dans un arbre.

    Q3 : Il exste trois parcours différent : préfixe, postfixe et suffixe.

    Q4 : La méthode de parcours qui passe par la racine est le parcours préfixe.

    Exercice 2

    Q1 : Oui, le code est réutilisable avec JSON.

    Q2 : 2 3 + 5 * 3 4 + 1 * 3 * 9 - -


*/









}
