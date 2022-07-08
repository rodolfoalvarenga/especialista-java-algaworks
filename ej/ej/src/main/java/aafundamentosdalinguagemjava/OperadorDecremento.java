package aafundamentosdalinguagemjava;

public class OperadorDecremento {

    public static void main(String[] args) {
        int limiteTentativasLogin = 10;

        // limiteTentativasLogin = limiteTentativasLogin - 1;
        // limiteTentativasLogin -= 1;

        // limiteTentativasLogin--;

        // int novoLimiteTentativasLogin = limiteTentativasLogin--;
        int novoLimiteTentativasLogin = --limiteTentativasLogin;

        System.out.println("Limite de tentativas de login: " + limiteTentativasLogin);
        System.out.println("Novo limite de tentativas de login: " + novoLimiteTentativasLogin);
    }

}
