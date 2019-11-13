package simpledraw;

/*
Enoncé de l'exercice :

Refactoriser ce programme de manière à utiliser :

Le Design Pattern Composite :
	Permettre l'implémentation du grouper / dégrouper :
		Manipuler (déplacer / supprimer) un groupe de formes
		comme une forme unique.
Le Design Pattern MVC
	Permettre de visualiser le dessin de différentes manières
		ex: niveaux de zoom différents dans différentes fenêtres
		ex: une vue qui affiche: "Il y 3 cercles et 2 lignes dans le dessin

Le Design Pattern Visitor
	Permettre (par exemple) la sauvegarde du dessin en XML, JSON...

La seule fonctionnalité à rajouter est le grouper / dégrouper

Rendu attendu :
	Modèle UML mis à jour mettant en évidence les design patterns utilisés
	Implémentation sous la forme d'un projet NetBeans
	Explications sur l'usage des design patterns
		Comment ils permettraient d'ajoute des nouvelles vues, d'implémenter la sauvegarde...

*/
public class Main {
	/**Construct the application*/
	public Main() {
		MainFrame frame = new MainFrame();
		frame.validate();
		frame.setVisible(true);
		System.out.println(this.getClass().equals(super.getClass()));

	}

	/**Main method*/
	public static void main(String[] args) {
		new Main();
	}
}
