/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import classes.Carro;

/**
 *
 * @author edube
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Palio";
        carro.placa = "123545";
        carro.velocidadeMaxima = 69f;
    }
}
