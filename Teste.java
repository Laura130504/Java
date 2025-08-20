package ClasseAbstrata;
import java.util.*;

public class Teste{
    public static void main(String[] args){
         ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>(); //sempre repet, dentro dos <> é o tipo do ArrayList,
                                             //o ultimo tem () pois está crinado objestos 
         
         formas.add(0, new Circulo(10.00));//indice, objeto -> o indice tem que começar do 0 e seguir a seguencia
         
         formas.get(0).calcularArea();
         
         Retangulo retang = new Retangulo();
         retang.valores(10.00, 2.00); //usar os metodos somente do filho, antes de add na lista
         
         formas.add(1, retang);//ao adicionar na list o objeto passa a ser do tipo da lista
         
         formas.get(1).calcularArea();
         
         
    }
}
