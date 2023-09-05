package b_estruturasdecontroleeoperadores;

import java.util.Scanner;

public class IndiceMassaCorporal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o seu sexo - F (feminino) ou M (masculino): ");
        char sexo = entrada.next().trim().toUpperCase().charAt(0);

        System.out.print("Entre o seu peso: ");
        int peso = entrada.nextInt();

        System.out.print("Entre com a sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)) {
            System.out.printf("Abaixo do peso. Valor do IMC: %.2f%n", imc);
        } else if ((sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc <= 26.4)) {
            System.out.printf("No peso ideal. Valor do IMC: %.2f%n", imc);
        } else if ((sexo == 'F' && imc <= 27.3) || (sexo == 'M' && imc <= 27.8)) {
            System.out.printf("Um pouco acima do peso. Valor do IMC: %.2f%n", imc);
        } else if ((sexo == 'F' && imc <= 32.3) || (sexo == 'M' && imc <= 31.1)) {
            System.out.printf("Acima do peso ideal. Valor do IMC: %.2f%n", imc);
        } else {
            System.out.printf("Obeso(a). Valor do IMC: %.2f%n", imc);
        }

    }

}
