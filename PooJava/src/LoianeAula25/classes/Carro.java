package LoianeAula25.classes;

public class Carro {
    
    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consumoCombustivel;
    
    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é "+capCombustivel * consumoCombustivel+" km");
    }
    
    public double obterAutonomia(){
        System.out.println("Método autonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }
    
    public double calcCombustivel(double km){
        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }
}
