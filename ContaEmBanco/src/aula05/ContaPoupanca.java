/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import java.util.Calendar;

/**
 *
 * @author edube
 */
public class ContaPoupanca extends ContaBanco{
    
    private double diaRendimento;

    public ContaPoupanca() {
    }
    
    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    public double calcularNovoSaldo(){
        return 0;
    }
    
    @Override
    public String toString() {
        String s = "";
        s += "Dia do rendimento: "+getDiaRendimento()+"\n";
        s += super.toString()+"\n";
        return s;
    }
    
    public boolean calcularNovoSaldo(double taxaRendimento){
        Calendar hoje = Calendar.getInstance();
        if (getDiaRendimento() == hoje.get(Calendar.DAY_OF_MONTH)) {
            this.setSaldo(this.getSaldo() + (this.getSaldo()*taxaRendimento));
        return true;
        }
        return false;
    }
}
