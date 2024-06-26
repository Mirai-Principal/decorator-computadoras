public class Main {
 public static void main(String[] args) {
    //compu con RAM adicional
    Computadora computadoraApple = new Apple();
    computadoraApple = new RamDecorator(computadoraApple);
    System.out.println(computadoraApple.getDescripcion() + " Costo= " + computadoraApple.cost());

    //compu con RAM adicional y lector
    Computadora computadoraLenovo = new Lenovo();
    computadoraLenovo = new RamDecorator(computadoraLenovo);
    computadoraLenovo = new LectorDecorador(computadoraLenovo);
    System.out.println(computadoraLenovo.getDescripcion() + " Costo= " + computadoraLenovo.cost());

    //compu HP con RAM , lector y Tarjeta grafica
    Computadora computadoraHP = new HP();
    computadoraHP = new RamDecorator(computadoraHP);
    computadoraHP = new LectorDecorador(computadoraHP);
    computadoraHP = new TargetaGraficaDecorator(computadoraHP);
    System.out.println(computadoraHP.getDescripcion() + " Costo= " + computadoraHP.cost());

 }
}
