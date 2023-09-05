package b_estruturasdecontroleeoperadores;

import java.util.Scanner;

public class HorarioFuncionamento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc): ");
        String diaSemana = entrada.nextLine();

        // Enhanced switch started in Java 2013
        String horarioFuncionamento = switch (diaSemana) {
            case "seg" -> "Fechado";
            case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
            case "sab", "dom" -> "08:00 às 12:00";
            default -> "Dia inválido";
        };

        // Classic switch
//        switch (diaSemana) {
//            case "seg":
//                horarioFuncionamento = "Fechado";
//                break;
//            case "ter":
//            case "qua":
//            case "qui":
//            case "sex":
//                horarioFuncionamento = "08:00 às 18:00";
//                break;
//            case "sab":
//            case "dom":
//                horarioFuncionamento = "08:00 às 12:00";
//                break;
//            default:
//                horarioFuncionamento = "Dia inválido";
//        }

        System.out.printf("Horário funcionamento: %s%n", horarioFuncionamento);
    }

}
