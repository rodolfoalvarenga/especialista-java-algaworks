package a_fundamentosdalinguagemjava;

public class AulaVariaveis {

    public static void main(String[] args) {
        // não recomendado pela Code Conventions da Oracle
        // int minhaIdade = 40, suaIdade = 25;

        // lowerCamelCase
        int minhaIdade = 40;
        int suaIdade = 25;

        // nome de variável não pode ser iniciado com número
        // int 1minhaIdade;

        int totalIdades = minhaIdade + suaIdade;

        System.out.println("Total das idades: " + totalIdades);
    }

}
