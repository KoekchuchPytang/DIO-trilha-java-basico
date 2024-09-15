package AprendendoSintaxeJava.C_Operadores;

public class Operadores3 {
    public static void main(String[] args) {
        String nome = "Abby";
        String nome4 = "Abby";
        String nome2 = new String("Abby");
        String nome3 = new String("Abby");

        System.out.println(nome == nome4);
        System.out.println( nome.equals(nome4));

        System.out.println(nome == nome2);
        System.out.println(nome.equals(nome2));

        System.out.println(nome2 == nome3);
        System.out.println(nome2.equals(nome3));



    }
}
