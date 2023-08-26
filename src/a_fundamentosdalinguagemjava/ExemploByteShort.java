package a_fundamentosdalinguagemjava;

public class ExemploByteShort {

    public static void main(String[] args) {
        byte idade = 127; // valor máximo
        // byte idade2 = 128; // não compila, pois está fora do range do tipo byte

        System.out.println(idade);

        short quantidadeEstoque = 32767; // valor máximo
        // short quantidadeEstoque2 = 32768; // não compila, pois está fora do range do tipo short

        System.out.println(quantidadeEstoque);
    }

}
