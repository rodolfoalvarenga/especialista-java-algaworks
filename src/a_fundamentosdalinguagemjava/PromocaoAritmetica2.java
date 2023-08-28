package a_fundamentosdalinguagemjava;

public class PromocaoAritmetica2 {

    public static void main(String[] args) {
        long x = 10;
        float y = 9.34f;
        // long z = x * y; // não compila, pois não ocorre a promoção aritmetica
        float z = x * y;

        System.out.println(z);
    }

}
