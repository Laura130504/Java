package HerancaPolimosfismo;

import java.util.*;

public class Teste{
     public static void main(String[] args){
      
         List<Veiculo> veiculos = new ArrayList<Veiculo>();
         
         veiculos.add(new Carro());
         veiculos.get(0).mover();
         
         veiculos.add(new Bicicleta());
         veiculos.get(1).mover();
     }
}
