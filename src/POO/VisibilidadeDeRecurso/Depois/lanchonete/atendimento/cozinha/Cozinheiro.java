package POO.VisibilidadeDeRecurso.Depois.lanchonete.atendimento.cozinha;

import POO.VisibilidadeDeRecurso.Depois.lanchonete.atendimento.Atendente;

public class Cozinheiro {
    Almoxarife almoxarife = new Almoxarife();
    public void adicionarLancheNoBalcao(){
        prepararLanche();
        System.out.println("ADICIONANDO LANCHE NO BALCAO");
    }

    public void adicionarSucoNoBalcao(){
        prepararVitamina();
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    public void adicionarComboNoBalcao(){
        //adicionarLancheNoBalcao();
        //adicionarSucoNoBalcao();
        prepararCombo();
        System.out.println("ADICIONANDO COMBO NO BALCÃO");
    }

    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE");
        pedirIngredientes(almoxarife);
        lavarIngredientes();
        selecionarIngredientesLanche();
        fritarIngredientesLanche();

    }

    private void prepararVitamina(){
        System.out.println("PREPARANDO SUCO");
        pedirIngredientes(almoxarife);
        lavarIngredientes();
        selecionarIngredientesVitamina();
        baterVitaminaLiquidificador();

    }
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche(){
        System.out.println("SELECIONANDO O PÃO, SALADA E ETC");
    }

    private void selecionarIngredientesVitamina(){
        System.out.println("SELECIONANDO FRUTA, LEITE E ETC");
    }

    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }

    private void fritarIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E OS OVOS");
    }



    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();

    }
}
