public class DivisaoNaoExataExeption extends Exception{
    private int numerador;
    private int denominador;
    
    public DivisaoNaoExataExeption(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    
    
}
