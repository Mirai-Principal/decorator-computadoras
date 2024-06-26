public class TargetaGraficaDecorator extends Decorador {
    private String tarjeta_grafica = "Tarjeta Nvidia GeForce GTX 1660ti";
   
    public TargetaGraficaDecorator(Computadora computadora) {
        super(computadora);
    }

    public String getDescripcion(){
        return getComputadora().getDescripcion() + " + " + tarjeta_grafica;
    }    

    public double cost(){
        return 425 + getComputadora().cost();
    }
}