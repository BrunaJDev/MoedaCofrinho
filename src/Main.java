import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cofrinho c = new Cofrinho();
        Scanner Leitor = new Scanner(System.in);

        int option;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Adicionar moedas");
            System.out.println("2. Remover moedas");
            System.out.println("3. Listar todas as moedas");
            System.out.println("4. Calcular o total em Reais");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = Leitor.nextInt();
            Leitor.nextLine(); // Limpar o buffer

            switch (option) {
                case 1:
                    System.out.println("Escolha a moeda a ser adicionada:");
                    System.out.println("1. Dólar");
                    System.out.println("2. Euro");
                    System.out.println("3. Real");
                    int moedaMoeda = Leitor.nextInt();
                    Leitor.nextLine(); // Limpar o buffer

                    System.out.print("Digite o valor da moeda: ");
                    double valor = Leitor.nextDouble();
                    Leitor.nextLine(); // Limpar o
                    Moeda moeda;
                    switch (moedaMoeda) {
                        case 1:
                            moeda = new Dolar(valor);
                            break;
                        case 2:
                            moeda = new Euros(valor);
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            continue; // Reiniciar o loop do menu
                    }
                    c.add(moeda);
                    System.out.println("Moeda adicionada ao cofrinho!");
                    break;

                case 2:
                    System.out.println("Moedas no cofrinho:");
                    ArrayList<Moeda> allCoins = c.getAllCoins();
                    for (int i = 0; i < allCoins.size(); i++) {
                        System.out.println((i + 1) + ". " + allCoins.get(i));
                    }
                    System.out.print("Digite o número da moeda que deseja remover: ");
                    int coinNumber = Leitor.nextInt();
                    Leitor.nextLine(); // Limpar o buffer
                    if (coinNumber > 0 && coinNumber <= allCoins.size()) {
                        Moeda selectedCoin = allCoins.get(coinNumber - 1);
                        c.remove(selectedCoin);
                        System.out.println("Moeda removida do cofrinho!");
                    } else {
                        System.out.println("Número de moeda inválido!");
                    }
                    break;

                case 3:
                    System.out.println("Moedas no cofrinho:");
                    for (Moeda m : c.getAllCoins()) {
                        System.out.println(m);
                    }

                    break;

                case 4:
                    double totalValueInReais = c.calcValorReais();
                    System.out.println("Total em Reais: R$" + totalValueInReais);
                    break;


                case 0:
                    System.out.println("Saindo...");
                    break;
            }
        }while (option != 0);

        Leitor.close();
    }
}
