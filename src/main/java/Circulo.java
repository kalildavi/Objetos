public class Circulo extends FigGeometrica{

    private double cons;
    private double raio;

    
    public Circulo(double cons, double raio) {
        this.cons = cons;
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
       System.out.println("A area do quadrado é: " + cons * raio);
    }

    public double getCons() {
        return cons;
    }

    public void setCons(double cons) {
        this.cons = cons;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
