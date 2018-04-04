/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostorenda;

/**
 *
 * @author edube
 */
public class Teste {
    public static void main(String[] args) {
     
        PessoaFisica pe1 = new PessoaFisica("André",1350);
        pe1.setCpf("333.444.555.43");
        PessoaFisica pe2 = new PessoaFisica("Barbara",2110);
        pe1.setCpf("333.444.555.43");
        PessoaFisica pe3 = new PessoaFisica("Eduardo",2650);
        pe1.setCpf("333.444.555.43");
        
        PessoaJuridica pe4 = new PessoaJuridica("Bernardo", 3100);
        pe4.setCnpj("10.684.822/0001-92");
        PessoaJuridica pe5 = new PessoaJuridica("Amauri", 3100);
        pe5.setCnpj("10.684.822/0001-92");
        PessoaJuridica pe6 = new PessoaJuridica("Aurea", 3650);
        pe6.setCnpj("10.684.822/0001-92");
        
        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = pe1;
        contribuintes[1] = pe2;
        contribuintes[2] = pe3;
        contribuintes[3] = pe4;
        contribuintes[4] = pe5;
        contribuintes[5] = pe6;
        
        for (Contribuinte c : contribuintes) {
            System.out.println((c.toString()));
        }
    }
}
