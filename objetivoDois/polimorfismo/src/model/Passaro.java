package model;

public class Passaro extends Animal {
    private double z = 0.0;

    public Passaro(){

    }
    public Passaro(double x, double y){
        super(x, y);
    }

    public Passaro(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um pássaro");
    }

    public void mover3D(double x, double y, double z){
        super.mover(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }
}
