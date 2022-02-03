package comportamental.factory.core;

import comportamental.factory.interfaces.Pessoa;

public class Presidente implements Pessoa {
    
    public double calculaBonusSalario(double salario) {
        return salario * 1.1;
    }
}
