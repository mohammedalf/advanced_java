package be.kdg.week8_Datastructuren_en_algoritmes_deel1.recursie;

import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;


import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
public class Sierpinski extends BorderPane {

    private Canvas canvas;

    public Sierpinski() {
        canvas = new Canvas(500,500);
        this.setCenter(canvas);
        drawSierpinski(10, new Point2D(250, 0), new Point2D(0,500), new Point2D(500, 500));
    }

    private void drawSierpinski(int i, Point2D a, Point2D b, Point2D c) {
        if (i==0) { //Stopconditie...
            drawTriangle(a, b, c);
        } else {
            //middelpunten berekenen
            Point2D ab = a.midpoint(b);
            Point2D ac = a.midpoint(c);
            Point2D bc = b.midpoint(c);

            //3 kleinere driehoeken
            drawSierpinski(i - 1, a, ab, ac);   //boven
            drawSierpinski(i - 1, ab, b, bc);   //linksonder
            drawSierpinski(i - 1, ac, bc, c);   //rechtsonder
        }
    }


    private void drawTriangle(Point2D a, Point2D b, Point2D c){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.fillPolygon(new double[]{
                a.getX(),b.getX(),
                c.getX()},new double[]{
                a.getY(),b.getY(),
                c.getY()},3);
    }
}
