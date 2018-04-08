/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentoexecoes;

/**
 *
 * @author edube
 */
public class DivisaoNaoExta extends Exception{
    
    private int num;
    private int denom;

    public DivisaoNaoExta(int num, int denom) {
        super();
        this.num = num;
        this.denom = denom;
    }

    @Override
    public String toString() {
        return "Resultado de "+num+" / "+denom+ " não é inteiro";
    }
}
