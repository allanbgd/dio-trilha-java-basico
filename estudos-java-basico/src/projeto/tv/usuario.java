package projeto.tv;

public class usuario {
    public static void main(String[] args)throws Exception{
        //chama as variaveis da classe SmartTv
        //para fazer essa interação é necessário colocar a classe.variavel

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("canal atual: " + smartTv.canal);
        System.out.println("volume atual: " + smartTv.volume);

        //chamada do método, o boleano ligada = true então a televisão ligará
        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? "+ smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume: "+smartTv.volume);

        //mudança do canal

        //foi requisitado o parametro novoCanal, o valor foi atribuido para 13
        smartTv.mudarCanal(13);
        System.out.println("canal atual: " + smartTv.canal);
        
        
    }
}
