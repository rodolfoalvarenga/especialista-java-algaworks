package a_fundamentosdalinguagemjava;

public class ExemploString {

    public static void main(String[] args) {
        System.out.println("Fala, mergulhador!");

        int x = 10;
        int y = 5;

        // concatena tudo
        // System.out.println("Resultado: " + x + y);

        // realiza o cálculo antes da concatenação
        // System.out.println(x + y + " foi o resultado");

        // realiza cálculo depois da concatenação
        System.out.println("Resultado: " + (x + y));

        String nome = "Maria";
        int idade = 30;

        System.out.println(nome + " tem " + idade + " anos");
    }

}

