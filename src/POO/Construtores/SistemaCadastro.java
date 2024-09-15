package POO.Construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa();

        marcos.setEndereco("Ademar de Bares");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
