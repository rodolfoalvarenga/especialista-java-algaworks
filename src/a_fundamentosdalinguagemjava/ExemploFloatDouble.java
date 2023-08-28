package a_fundamentosdalinguagemjava;

public class ExemploFloatDouble {

    public static void main(String[] args) {
        double peso = 84.9d; // "d" é opcional
        System.out.println(peso);

        // float taxa = 1_294.93; // não compila, pois o compilador reconhece este valor como double devido ao .
        float taxa = 1_294.93f;
        System.out.println(taxa);
    }

}
