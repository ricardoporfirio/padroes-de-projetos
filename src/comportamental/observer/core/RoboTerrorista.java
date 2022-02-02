package comportamental.observer.core;

import java.util.ArrayList;
import java.util.List;

import comportamental.observer.interfaces.AcoesRobo;
import comportamental.observer.interfaces.Observado;
import comportamental.observer.interfaces.Observador;
import comportamental.observer.interfaces.Robo;

public class RoboTerrorista implements Robo, Observado {

    List<Observador> observadores = new ArrayList<>();


    public void virarEsquerda() {
        System.out.println("Robo Terrorista virou para a esquerda");
        this.notificarObservadores(AcoesRobo.ESQUERDA);
    }

    public void virarDireita() {
        System.out.println("Robo Terrorista virou para a direita");
        this.notificarObservadores(AcoesRobo.DIREITA);
    }

    public void andarFrente() {
        System.out.println("Robo Terrorista andou para frente");
        this.notificarObservadores(AcoesRobo.FRENTE);
    }

    public void andarTras() {
        System.out.println("Robo Terrorista andou para trás");
        this.notificarObservadores(AcoesRobo.TRAS);
    }

    public void parar() {
        System.out.println("Robo Terrorista parou");
        this.notificarObservadores(AcoesRobo.PARAR);
    }

    public void correr() {
        System.out.println("Robo Terrorista correu");
        this.notificarObservadores(AcoesRobo.CORRER);
    }

    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(AcoesRobo acao) {
        for (Observador observador : observadores) {
            observador.atualizar(acao);
        }
    }

}