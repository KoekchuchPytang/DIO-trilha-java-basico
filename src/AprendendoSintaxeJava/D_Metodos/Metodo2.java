package AprendendoSintaxeJava.D_Metodos;

public class Metodo2 {
    public static void main(String[] args) {
        // SmartTv
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv);
        System.out.println("TV está ligada?: " + smartTv.ligada);
        System.out.println("Volume: "+smartTv.volume);
        System.out.println("Canal atual: "+smartTv.canal);
        smartTv.ligarDesligar();
        System.out.println("TV está ligada?: " + smartTv.ligada);
        smartTv.mudarCanal(20);
        System.out.println("Canal atual: "+smartTv.canal);
        smartTv.proximoCanal();
        System.out.println("Canal atual: "+smartTv.canal);
        smartTv.anteriorCanal();
        System.out.println("Canal atual: "+smartTv.canal);
        smartTv.aumentarVolume();
        System.out.println("Volume: "+smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume: "+smartTv.volume);








    }
}
