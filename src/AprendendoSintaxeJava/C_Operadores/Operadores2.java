package AprendendoSintaxeJava.C_Operadores;

public class Operadores2 {
    public static void main(String[] args) {
        /* ATRIBUIÇÃO
        * = recebe
        * LÓGICOS
        * == igual
        * != diferente
        * < menor que
        * > maior que
        * <= menor igual a
        * >= maior igual a
        * Objeto.equals(Objeto2)
        * ARITMÉTICOS
        * + mais ou concatenação
        * - menos
        * * multiplicação
        * / divisão
        * % resto
        * INCREMENTAÇÃO
        * ++ Aumenta 1
        * -- Diminui 1
        * += variavel mais tal valor
        * -= variavel menos tal valor
        * *= variavel vezes tal valor
        * /= variavel vezes o resultado da divisão dela por tal valor
        * %= variavel vezes o resultado do resto dela por tal valor
        * Operador ternário
        * Expressão Condicional>? <Caso condição seja true> : <Caso condição seja false>
        * */
        int numero = 10;
        System.out.println( (numero+= 5));
        System.out.println(numero);
    }
}
