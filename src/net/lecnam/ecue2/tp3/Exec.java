package net.lecnam.ecue2.tp3;

public class Exec  {

    public static void main(String[] args) {
        Point p1 = new Point(1,2);

        /*Utilisation de la méthode translate*/
        p1.translate(4,3);

        /*Affichage true ou false de l'égalité des coordonnées*/
        System.out.println(p1.equals(p1));

        /*Utiliser la méthode toString pour afficher le point*/
        System.out.println(p1.toString());

        Point p2 = new Point(5,5);

        /*Utiliser la méthode retourneDistance pour afficher la distance entre 2 points*/
        System.out.println("la distance est de : " + p1.retourneDistance(p2));

        Rectangle r1 = new Rectangle(p1, 5, 3);

    }

}
