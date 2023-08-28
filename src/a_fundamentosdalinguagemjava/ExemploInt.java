package a_fundamentosdalinguagemjava;

public class ExemploInt {

    public static void main(String[] args) {
        int populacaoUberlandia = 699_097;

        // int populacaoUberlandia2 = 2_147_483_648; // não compila, pois está fora do range do tipo int
        int populacaoUberlandia2 = 2_147_483_647;

        System.out.println(populacaoUberlandia);
        System.out.println(populacaoUberlandia2);
    }

}
