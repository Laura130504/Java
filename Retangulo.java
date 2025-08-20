package ClasseAbstrata;

public class Retangulo extends FormaGeometrica{
    private double altura;
    private double largura;
    
    public void valores(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }
    
    public void calcularArea(){
        System.out.println("A area deste retangulo é "+(this.altura*this.largura));
    }
}
