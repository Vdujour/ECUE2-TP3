package net.lecnam.ecue2.tp3;

public class Rectangle {

    double longueur, largeur;
    Point pointOrigine;

    /*Constructeur 1*/
    public Rectangle(Point p, double longueur, double largeur){
        this.pointOrigine = p;
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /*Constructeur 2*/
    public Rectangle(double pointX, double pointY, double longueur, double largeur){
        this.pointOrigine = new Point(pointX,pointY);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /*Méthode qui retourne la surface du rectangle*/
    public double retourneSurface(double longueur, double largeur){
        double surface = this.longueur * this.largeur;

        return surface;
    }

    public void translate(double x, double y){
        this.pointOrigine.translate(x ,y);
    }

}
