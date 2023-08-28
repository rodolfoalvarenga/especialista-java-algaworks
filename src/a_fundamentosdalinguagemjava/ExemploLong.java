package a_fundamentosdalinguagemjava;

public class ExemploLong {

    public static void main(String[] args) {
        long populacaoUberlandia = 699_097;

        long populacaoUberlandia2 = 2_147_483_648L;

        // System.out.println(2_147_483_648); // não compila, pois quando não passa o caracter L o compilador vê o número como int
        System.out.println(2_147_483_648L);
    }

}
