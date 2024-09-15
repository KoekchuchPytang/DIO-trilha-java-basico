package AprendendoSintaxeJava.E_Escopo;

public class Conta {
    double saldo = 10.0;

    public void sacar(Double valor){
        // variavel local do metodo
        double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo(){
        // disponivel em toda classe
        System.out.println(saldo);
        // somente o metodo sacar conhece
        //System.out.println(novoSaldo);
    }
    public double calcularDividaExponencial(){
        //variavel local de metodo
        double valorParcela = 50;
        double valorMotante = 0;
        for (int x = 1; x <= 5; x++) {

            double valorCalculado = valorParcela * x;
            valorMotante = valorMotante + valorCalculado;
        }
        // escopo de fluxo
        //x e valor calculado nunca estarão disponiveis fora do for
        return valorMotante;
    }


}
