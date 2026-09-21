package net.lecnam.ecue2.tp3;

public class Dessin {

    Rectangle[] tableau;
    int nbRectangles;

    public Dessin(){
        this.tableau = new Rectangle[10];
        this.nbRectangles = 0;
    }

    public boolean ajout(Rectangle r){
        if (this.nbRectangles < this.tableau.length) {
            this.tableau[this.nbRectangles] = r;
            this.nbRectangles++;
            return true;

        } else{
            System.out.println("Erreur : Le dessin contient déjà 10 rectangles.");
            return false;
        }
    }

    public double retourneSurface(){
        double surfaceTotal = 0;
        for (int i=0; i<nbRectangles; i++) {
            surfaceTotal += this.tableau[i].retourneSurface();
        }
        return surfaceTotal;
    }

    public void translate(double x, double y){
        for (int i = 0; i < nbRectangles; i++){
            this.tableau[i].translate(x, y);
        }
    }

}
