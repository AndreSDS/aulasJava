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
public class MinhaException {
    public static void main(String[] args) {
        
        int[] numeros = {4,8,5,16,32,21,64,128};
        int[] denom = {2,0,4,8,0,2,4};
        
        for (int i = 0; i < numeros.length; i++) {
          try {
              if (numeros[i] % 2 != 0) {
                  throw new DivisaoNaoExta(numeros[i], denom[i]);
              }
            System.out.println(numeros[i]+" / "+  denom[i]+" = "+(numeros[i]/denom[i]));                
            //System.exit(0); essa linha sai da execução
          }
          catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExta e) {
             System.out.println("Ocorreu um erro "+e);
             e.printStackTrace();
          }
        }
        
    }
    
}
