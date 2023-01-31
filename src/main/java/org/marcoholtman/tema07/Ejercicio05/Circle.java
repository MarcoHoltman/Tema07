package org.marcoholtman.tema07.Ejercicio05;

public class Circle {

    private Point point;
    private double radioCircle;

    public Circle(Point point, double radioCircle) {
        this.(new Point(x,y), radiusCircle)
    }

    public Circle(){
        this(new)
    }
    public Point getPoint() {
        return point;
    }

    public double getRadioCircle() {
        return radioCircle;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setRadioCircle(double radioCircle) {
        this.radioCircle = radioCircle;
    }

    public double distance(Point point){
        return this.point.distanceCalculation(point);
    }

    public double calculateArea() {
        return PI * Math.pow(radiusCircle,2)
    }
}
