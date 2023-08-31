package a_fundamentosdalinguagemjava;

import java.util.Scanner;

public class FolhaPagamento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Valor por hora: ");
        double valorPorHora = entrada.nextDouble();

        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();

        System.out.print("Valor dos descontos: ");
        double valorDosDescontos = entrada.nextDouble();

        double totalSemDescontos = valorPorHora * horasTrabalhadas;
        double totalDevido = totalSemDescontos - valorDosDescontos;

        System.out.printf("Folha de pagamento: %s%n", nome);
        System.out.printf("%d horas x R$%.2f = R$%.2f%n", horasTrabalhadas, valorPorHora, totalSemDescontos);
        System.out.printf("Descontos: R$%.2f%n", valorDosDescontos);
        System.out.printf("Total devido: R$%.2f%n", totalDevido);
    }

}
