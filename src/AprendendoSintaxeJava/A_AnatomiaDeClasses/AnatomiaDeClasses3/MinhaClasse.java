package AprendendoSintaxeJava.A_AnatomiaDeClasses.AnatomiaDeClasses3;

public class MinhaClasse {
    public static String Cachorros (String raca, String nome){
        return "Cachorro da raça "+raca+" chamado de "+nome;
    }
    public static void main(String[] args) {
        String nome = "Isazia";
        String cachorro = "Chuaua";
        int numeroInteiro = 1;
        Double numeroFracionado = 1.44484574984987;
        float numeroFracionado2 = 1.1f;
        boolean verdade = true;
        boolean falso = false;
        byte idade = 70;
        short quantidadeDeLivros = 800;
        long numeroGrande = 1646446787;
        System.out.println(Cachorros("Pitbull", "fernando"));
        System.out.println(String.format("%s do %s", cachorro, nome));


    }
}
