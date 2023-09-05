package b_estruturasdecontroleeoperadores;

import java.util.Scanner;

public class AvaliacaoAtendimento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Avalie o nosso atendimento (1 a 5): ");
        int nota = entrada.nextInt();

        String descricaoNota;

        // Enhanced switch started in Java 13
        switch (nota) {
            case 1 -> {
                descricaoNota = "Muito ruim";
                System.out.println(1);
            }
            case 2 -> {
                descricaoNota = "Ruim";
                System.out.println(2);
            }
            case 3 -> {
                descricaoNota = "Razoável";
                System.out.println(3);
            }
            case 4 -> {
                descricaoNota = "Muito bom";
                System.out.println(4);
            }
            case 5 -> {
                descricaoNota = "Excelente";
                System.out.println(5);
            }
            default -> {
                descricaoNota = "Opção inválida";
                System.out.println("default");
            }
        }

        // Classic switch
//        switch (nota) {
//            case 1:
//                descricaoNota = "Muito ruim";
//                System.out.println(1);
//                break;
//            case 2:
//                descricaoNota = "Ruim";
//                System.out.println(2);
//                break;
//            case 3:
//                descricaoNota = "Razoável";
//                System.out.println(3);
//                break;
//            case 4:
//                descricaoNota = "Muito bom";
//                System.out.println(4);
//                break;
//            case 5:
//                descricaoNota = "Excelente";
//                System.out.println(5);
//                break;
//            default:
//                descricaoNota = "Opção inválida";
//                System.out.println("default");
//                break;
//        }

        System.out.printf("Sua nota foi: %d - %s%n", nota, descricaoNota);
    }

}
