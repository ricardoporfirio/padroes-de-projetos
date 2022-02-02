package comportamental.observer.core;

import comportamental.observer.interfaces.AcoesRobo;
import comportamental.observer.interfaces.Observador;
import comportamental.observer.interfaces.Robo;

public class RoboPatrulha implements Robo,Observador {

    @Override
    public void atualizar(AcoesRobo acao) {
        switch (acao) {
            case ESQUERDA:
                System.out.println("Robo Patrulha virou para a esquerda");
                break;
            case DIREITA:
                System.out.println("Robo Patrulha virou para a direita");
                break;
            case FRENTE:
                System.out.println("Robo Patrulha andou para frente");
                break;
            case TRAS:
                System.out.println("Robo Patrulha andou para trás");
                break;
            case PARAR:
                System.out.println("Robo Patrulha parou");
                break;
            case CORRER:
                System.out.println("Robo Patrulha correu");
                break;
        }
    }

    @Override
    public void virarEsquerda() {
        System.out.println("Robo Patrulha virou para a esquerda");
    }

    @Override
    public void virarDireita() {
        System.out.println("Robo Patrulha virou para a direita");
    }

    @Override
    public void andarFrente() {
        System.out.println("Robo Patrulha andou para frente");            
    }

    @Override
    public void andarTras() {
         System.out.println("Robo Patrulha andou para trás");       
    }

    @Override
    public void parar() {
        System.out.println("Robo Patrulha parou");
    }

    @Override
    public void correr() {
        System.out.println("Robo Patrulha correu");
    }
    
}
