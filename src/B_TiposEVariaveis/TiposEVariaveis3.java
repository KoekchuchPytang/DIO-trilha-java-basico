package B_TiposEVariaveis;

public class TiposEVariaveis3 {
    // https://glysns.gitbook.io/java-basico/sintaxe/variaveis#tipos-de-dados
    public static void main(String[] args) {
        double salarioMinimo = 2.500;
        // long precisa ter um L dps do número
        long quantidadeDeEstrelas = 654564654654646874L;
        byte idade = 90;
        short ano = 1998;
        // float precisa ter um F dps do numero
        float troco = 5.65f;
        char letra = 'A';
        // É possivel passar de short pra int, mass não o contrário
        // a não ser que transforme antes através do casting (short).
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

    }
}
