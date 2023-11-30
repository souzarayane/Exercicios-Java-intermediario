package interfaceJava;

public class TestarArea {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);
        System.out.printf("A área do quadrado = %.2f%n", quadrado.calcularArea());

        Triangulo triangulo = new Triangulo(25.00, 50.00);
        System.out.printf("A área do triângulo = %.2f%n", triangulo.calcularArea());

        Circulo circulo = new Circulo(15.00);
        System.out.printf("A área do círculo = %.2f%n", circulo.calcularArea());
    }
}

