package POO.VisibilidadeDeRecurso.Depois.lanchonete;

import POO.VisibilidadeDeRecurso.Depois.lanchonete.area.cliente.Cliente;
import POO.VisibilidadeDeRecurso.Depois.lanchonete.atendimento.Atendente;
import POO.VisibilidadeDeRecurso.Depois.lanchonete.atendimento.cozinha.Almoxarife;
import POO.VisibilidadeDeRecurso.Depois.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        // ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();
        // ação que somente o seu pacote cozinha precisa conhecer (default)


        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}
