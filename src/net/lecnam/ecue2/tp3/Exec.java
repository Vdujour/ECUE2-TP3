package net.lecnam.ecue2.tp3;

public class Exec  {

    public static void main(String[] args) {
        Point p1 = new Point(0,0);

        /*Utilisation de la méthode translate*/
        p1.translate(1,1);

        Point p2 = new Point(1,2);

        /*Affichage true ou false de l'égalité des coordonnées*/
        System.out.println(p1.equals(p2));

        /*Utiliser la méthode toString pour afficher le point*/
        System.out.println(p1.toString());

        /*Utiliser la méthode retourneDistance pour afficher la distance entre 2 points*/
        System.out.println("la distance est de : " + p1.retourneDistance(p2));

        Rectangle r1 = new Rectangle(p1, 5, 5);
        System.out.println("Le rectangle contient t il le point ? " + r1.contient(p2));

        Rectangle r2 = new Rectangle(p2, 15, 15);
        boolean rEquals = r1.equals(r2);
        System.out.println(rEquals);

        System.out.println(r1.toString());
        System.out.println(r2.toString());

        Dessin d1 = new Dessin();
        d1.ajout(r1);
        d1.ajout(r2);

        System.out.println(d1.retourneSurface());

        System.out.println(d1.retournePlusGrandRectangle());

    }

}
