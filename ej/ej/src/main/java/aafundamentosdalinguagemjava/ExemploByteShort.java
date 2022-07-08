package aafundamentosdalinguagemjava;

public class ExemploByteShort {

    public static void main(String[] args) {
        byte idade = 127; // Valor máximo
        // byte idade2 = 128; // Não compila
        byte temperaturaNegativa = -128; // Valor mínimo
        // byte temperaturaNegativa2 = -129; // Não compila

        System.out.println(idade);
        System.out.println(temperaturaNegativa);

        short quantidadeEstoque = 32767; // Valor máximo
        // short quantidadeEstoque2 = 32768; // Não compila
        short limiteNegativo = -32768; // Valor mínimo
        // short limiteNegativo2 = -32769; // Não compila

        System.out.println(quantidadeEstoque);
        System.out.println(limiteNegativo);
    }

}
