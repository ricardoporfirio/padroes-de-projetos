package criacao.factory.core;

import criacao.factory.interfaces.Pessoa;

public class Presidente implements Pessoa {
    
    public double calculaBonusSalario(double salario) {
        return salario * 1.1;
    }
}
