
public abstract class Decorador extends Computadora {
    private Computadora computadora;

    public Decorador(Computadora computadora) {
        setComputadora(computadora);
    }

    public Computadora getComputadora() {
        return computadora;
    }
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public abstract String getDescripcion();

}