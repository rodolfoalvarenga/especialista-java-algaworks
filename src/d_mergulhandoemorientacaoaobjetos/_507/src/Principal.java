package d_mergulhandoemorientacaoaobjetos._507.src;

public class Principal {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Pingo";
        cachorro1.raca = "Pug";
        cachorro1.sexo = "Macho";
        cachorro1.idade = 4;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Lara";
        cachorro2.raca = "Golden";
        cachorro2.sexo = "Fêmea";
        cachorro2.idade = 2;

        System.out.println("Primeiro cachorro");
        System.out.println("------------------------------");
        System.out.printf("Nome: %s%n", cachorro1.nome);
        System.out.printf("Raça: %s%n", cachorro1.raca);
        System.out.printf("Sexo: %s%n", cachorro1.sexo);
        System.out.printf("Idade: %d%n", cachorro1.idade);

        System.out.println();

        System.out.println("Segundo cachorro");
        System.out.println("------------------------------");
        System.out.printf("Nome: %s%n", cachorro2.nome);
        System.out.printf("Raça: %s%n", cachorro2.raca);
        System.out.printf("Sexo: %s%n", cachorro2.sexo);
        System.out.printf("Idade: %d%n", cachorro2.idade);
    }

}
