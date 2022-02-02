package comportamental.observer.app;

import comportamental.observer.core.RoboPatrulha;
import comportamental.observer.core.RoboTerrorista;

public class Lanca {

    public void run() {

        RoboPatrulha observador = new RoboPatrulha();
        RoboTerrorista observado = new RoboTerrorista();

        observado.registrarObservador(observador);

        observado.andarFrente();
        observado.andarFrente();
        observado.andarTras();
        observado.correr();
        observado.correr();
        observado.correr();
        observado.virarDireita();
        observado.correr();
        observado.virarEsquerda();
        observado.correr();
        observado.correr();
        observado.correr();
        observado.correr();
        observado.parar();

    }
}
