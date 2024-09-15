package AprendendoSintaxeJava.D_Metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void ligarDesligar(){
        this.ligada = !ligada;
        if (ligada == true){
            System.out.println("Ligando TV");
        }else {
            System.out.println("Desligando TV");
        }
    }
    public void mudarCanal(int canal){
        this.canal = canal;
        System.out.println("Mudando para canal "+canal);
    }
    public void proximoCanal(){
        this.canal++;
        System.out.println("Indo para canal " + canal);
    }
    public void anteriorCanal(){
        this.canal--;
        System.out.println("Voltando para canal " + canal);
    }

    public void aumentarVolume(){
        this.volume++;
        System.out.println("Aumentando volume para: "+ volume);

    }
    public void diminuirVolume(){
        this.volume--;
        System.out.println("Diminuindo volume para: "+ volume);
    }

}
