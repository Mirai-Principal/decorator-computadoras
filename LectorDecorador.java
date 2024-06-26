
public class LectorDecorador extends Decorador{
    private String tipoLector = " Blu-ray";
    public LectorDecorador(Computadora computadora) {
        super(computadora);
    }

    public String getDescripcion(){
        return getComputadora().getDescripcion() + " + " + tipoLector;
    }

    public double cost(){
        return 85 + getComputadora().cost();
    }

}
