public class Losango extends FigGeometrica{

    private double dmaior;
    private double dmenor;


    public Losango(double dmaior, double dmenor) {
        this.dmaior = dmaior;
        this.dmenor = dmenor;
    }

    @Override
    public void calcularArea() {
        System.out.println("A area do Losango é: " + (dmaior * dmenor) / 2);
    }

    public double getDmaior() {
        return dmaior;
    }

    public void setDmaior(double dmaior) {
        this.dmaior = dmaior;
    }

    public double getDmenor() {
        return dmenor;
    }

    public void setDmenor(double dmenor) {
        this.dmenor = dmenor;
    }
}