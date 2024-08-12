package projeto.tv;
public class SmartTv {
    
    //a classe tem que se ligar com smartTv, por isso ela n pode estar no public void main

        boolean ligada = false;
        int canal=1;
        int volume= 25; 


    //canal

public void mudarCanal(int novoCanal){
 canal = novoCanal;

}

public void aumentarCanal(){

    canal++;

}

public void diminuirCanal(){

    canal--;

}
    //volume 
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
        

    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
        
    }


        //tv ligada
        public void ligar(){
        ligada = true;

    } public void desligar(){
            ligada = false;

        } 
    
  }

