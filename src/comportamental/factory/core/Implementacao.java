package comportamental.factory.core;

import comportamental.factory.interfaces.Pessoa;

public class Implementacao {
    public void run() {
        Pessoa diretor = FabricaPessoa.constroi(Tipo.DIRETOR);

        System.out.println("Salário do diretor: " + diretor.calculaBonusSalario(1000));

        Pessoa presidente = FabricaPessoa.constroi(Tipo.PRESIDENTE);

        System.out.println("Salário do presidente: " + presidente.calculaBonusSalario(1000));
    }
}
