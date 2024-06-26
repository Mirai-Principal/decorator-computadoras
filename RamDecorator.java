

public class RamDecorator extends Decorador {
    private int ram = 8;

    public RamDecorator(Computadora computadora) {
        super(computadora);
    }

    public String getDescripcion(){
        return getComputadora().getDescripcion() + " + " + ram + "GB RAM ";
    }

    public double cost(){
        return 45 + getComputadora().cost();
    }

}
