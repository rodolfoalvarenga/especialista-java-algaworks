package d_mergulhandoemorientacaoaobjetos;

public class Principal {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2023;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";

        System.out.println("Meu carro");
        System.out.println("---------");
        System.out.printf("Ano de fabricação: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Cor: %S%n", meuCarro.cor);
        System.out.printf("Fabricante: %S%n", meuCarro.fabricante);
        System.out.printf("Modelo: %s%n", meuCarro.modelo);

        System.out.println();

        System.out.println("Seu carro");
        System.out.println("---------");
        System.out.printf("Ano de fabricação: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Cor: %s%n", seuCarro.cor);
        System.out.printf("Fabricante: %s%n", seuCarro.fabricante);
        System.out.printf("Modelo: %s%n", seuCarro.modelo);

        System.out.println();

        System.out.println("Teste: Objeto seuCarro se torne meuCarro, ou seja, aponta para o mesmo espaço na memória");

        seuCarro = meuCarro; // aponta para o mesmo endereço de memória do objeto meuCarro, assim seuCarro se torna meuCarro
        System.out.println(seuCarro.modelo);
    }

}
