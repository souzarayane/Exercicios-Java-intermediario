package interfaceJava;

public class Circulo {
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    public double calcularArea(){
        return Math.PI * raio * raio;
    }
}
