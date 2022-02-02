package comportamental.observer.interfaces;

public interface Observado {

    void registrarObservador(Observador observador);

    void removerObservador(Observador observador);

    void notificarObservadores(AcoesRobo acao);
        
}
