
package ejerciciosgui.ejerciciojuegobasico;

public class Vector {
    private double x;
    private double y;
    
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void add(Vector position) {
        this.x += position.getX();
        this.y += position.getY();
    }
    
    public void substract(Vector position) {
        this.x -= position.getX();
        this.y -= position.getY();
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
