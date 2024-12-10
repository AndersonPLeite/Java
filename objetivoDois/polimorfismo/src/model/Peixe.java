package model;

public class Peixe extends Animal{

    private double z = 0.0;

    public Peixe(){

    }

    public Peixe(double x, double y){
        super(x, y);
    }

    public Peixe(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um peixe");
    }

    public void mover3D(double x, double y, double z){
        super.mover(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }
}
