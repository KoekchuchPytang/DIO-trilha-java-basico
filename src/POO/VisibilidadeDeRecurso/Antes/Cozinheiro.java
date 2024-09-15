package POO.VisibilidadeDeRecurso.Antes;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NO BALCAO");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche(){
        System.out.println("PREPARANDO LANCHE");
    }

    public void prepararVitamina(){
        System.out.println("PREPARANDO SUCO");
    }

    public void selecionarIngredientesLanche(){
        System.out.println("SELECIONANDO O PÃO, SALADA E ETC");
    }

    public void selecionarIngredientesVitamina(){
        System.out.println("SELECIONANDO FRUTA, LEITE E ETC");
    }

    public void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }

    public void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }

    public void fritarIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E OS OVOS");
    }

    public void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
