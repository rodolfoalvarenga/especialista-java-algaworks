package a_fundamentosdalinguagemjava;

public class PromocaoAritmetica1 {

    public static void main(String[] args) {
        int x = 10;
        long y = 5;
        // int z = x * y; // não compila, pois não é feita a promoção aritmética
        long z = x * y;

        System.out.println(z);
    }

}
