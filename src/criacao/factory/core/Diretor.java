package criacao.factory.core;

import criacao.factory.interfaces.Pessoa;

public class Diretor implements Pessoa{

    @Override
    public double calculaBonusSalario(double salario) {
        return salario * 0.8;
    }
    
}
