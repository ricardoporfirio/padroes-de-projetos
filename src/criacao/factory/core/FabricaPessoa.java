package criacao.factory.core;

import criacao.factory.interfaces.Pessoa;

public class FabricaPessoa {
    
    public static Pessoa constroi(Tipo tipo) {
        switch (tipo) {
            case PRESIDENTE:
               return new Presidente();
            case DIRETOR:
              return  new Diretor();
        }
        return null;
    }
     
}
