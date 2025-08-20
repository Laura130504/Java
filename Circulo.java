package ClasseAbstrata;

public class Circulo extends FormaGeometrica{
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    public void calcularArea(){
        System.out.println("A area deste circulo é "+(raio*raio*3.14));
    }
}
