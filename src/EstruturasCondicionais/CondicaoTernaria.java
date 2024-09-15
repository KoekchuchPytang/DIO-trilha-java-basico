package EstruturasCondicionais;

public class CondicaoTernaria {
    public static void main(String[] args) {
        int nota = 7;

        String resultado = nota >= 5 ? "Aprovado" : nota >=5 && nota <7  ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }

}
