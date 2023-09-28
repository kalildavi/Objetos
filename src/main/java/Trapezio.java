public class Trapezio extends FigGeometrica {

    private double basema;
    private double baseme;
    private double altura;

    public Trapezio(double basema, double baseme, double altura) {
        this.basema = basema;
        this.baseme = baseme;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
       System.out.println("A area do Trapezio é: " + ((basema + baseme) * altura) / 2);
    }

    public double getBasema() {
        return basema;
    }

    public void setBasema(double basema) {
        this.basema = basema;
    }

    public double getBaseme() {
        return baseme;
    }

    public void setBaseme(double baseme) {
        this.basema = baseme;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
