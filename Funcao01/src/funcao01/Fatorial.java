/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01;

/**
 *
 * @author edube
 */
public class Fatorial {
    
    private int num = 0;    
    private int fat = 0;
    private String formula = "";
    
    public void setValor(int n){
        num = n;
        int f = 1;
        String s = "";
        for (int i = n; i > 1; i--) {
            f *= i;
            s += i +" x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    public int getFatorial(){
        return fat;
    }
    
    public String getFormula(){
        return formula;
    }
}
