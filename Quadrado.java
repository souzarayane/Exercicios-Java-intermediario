package interfaceJava;

public class Quadrado {
    double lado;
    public Quadrado (double lado){
        this.lado = lado;
    }
    public double calcularArea(){
        return lado * lado;
    }
}
