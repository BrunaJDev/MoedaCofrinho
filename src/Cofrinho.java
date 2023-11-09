import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho () {
        moedas = new ArrayList<>();
    }

    public  void add(Moeda m){
        moedas.add(m);
    }
    public  void remove(Moeda m){
        moedas.remove(m);
    }
    public double calcularTotal() {
        double total = 0;
        for (Moeda m : moedas){ //Para cada Moeda m do nosso Array moedas
            total += m.getValor();
        }
        return  total;
    }

    public ArrayList<Moeda> getAllCoins() {
        return moedas;
    }

    public double calcValorReais() {
        double totalValue = 0;
        for (Moeda moeda : moedas) {
            totalValue += moeda.getValor();
        }
        return totalValue;
    }


}
