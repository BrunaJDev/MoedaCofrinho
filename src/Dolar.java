public class Dolar extends Moeda { //Vai herdar os atributos;
    public Dolar(double valor) {
        super(valor);
    }
    public double convertToReal() {
        // A taxa de conversão para Reais de Dólar será 5.0
        return getValor() * 5.0;
    }






}
