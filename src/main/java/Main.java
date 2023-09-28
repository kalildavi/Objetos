public class Main {
    public static void main(String[] args){

        Triangulo t1 = new Triangulo(5.2, 2.3);
        t1.calcularArea();

        Quadrado q1 = new Quadrado (5);
        q1.calcularArea();

        Losango l1 = new Losango(5,5);
        l1.calcularArea();

        Retangulo r1 = new Retangulo(10,2);
        r1.calcularArea();

        Trapezio tr1 = new Trapezio(10,2,4);
        tr1.calcularArea();

        Circulo c1 = new Circulo (3.14,10);
        c1.calcularArea();

    }
}
