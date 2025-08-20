package InterfacesPolimorfismo;
import java.util.*;

public class Teste{
    public static void main(String[] args){
         int x=0;
        ArrayList<Imprimivel> impr = new ArrayList<Imprimivel>();
        
        impr.add(0, new Relatorio());
        impr.add(1, new Contrato());
        
        for( x=0; x < 10; x=x+1){
            if (impr.get(x) == null){ 
            }
            
            else{
                impr.get(x).imprimir();
            }
        }   
    }
}
