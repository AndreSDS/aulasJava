/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoianeAula25;

import LoianeAula25.classes.Carro;

/**
 *
 * @author edube
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Duacato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        van.exibirAutonomia();
         double autonomia = van.obterAutonomia();
         System.out.println(autonomia);
         
         double qtdCombustivel = van.calcCombustivel(10);
         
         System.out.println("qtdCombustivel para percorrer 10km é de "+ qtdCombustivel+" litros");
    }
    
}
