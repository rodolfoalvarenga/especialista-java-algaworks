package a_fundamentosdalinguagemjava;

public class ConversaoDoubleParaInt {

    public static void main(String[] args) {
        double largura = 100.37;
        // int tamanho = largura; // não compila, pois não tem casting de conversão de um tipo maior para menor

        int tamanho = (int) largura;

        System.out.println(tamanho);
    }

}
