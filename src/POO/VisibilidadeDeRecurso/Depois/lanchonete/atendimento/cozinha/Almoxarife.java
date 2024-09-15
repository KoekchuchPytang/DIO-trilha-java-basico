package POO.VisibilidadeDeRecurso.Depois.lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("CONTROLANDO A ENTRADA");
    }

    private void controlarSaida(){
        System.out.println("CONTROLANDO A SAIDA");
    }

    void entregarIngredientes(){
        System.out.println("ENTREGANDO OS INGREDIENTES");
        controlarSaida();
    }

    void trocarGas(){
        System.out.println("Almoxarife troca o gás");
    }
}
