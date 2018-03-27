/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author edube
 */
public class Vetor01 {
    public static void main(String[] args){
        
        int vet[] = new int[8];
        Arrays.fill(vet, 0);
            for(int v:vet){
            System.out.print(vet+" ");
        }
        
    /*
       int n[] = {3,2,8,7,5,4};
        
       String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
       
       int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
       
        for (int i = 0; i < mes.length; i++) {
          System.out.println("O mês de "+mes[i]+" tem "+dias[i]+" dias ao todo.");
        }
        
        double v[] = {3.5,2.75,9,-4.5};
        Arrays.sort(v);
        for (double valor:v) {
            System.out.print(valor + " ");
        }
        int pos = Arrays.binarySearch(v, 9);
        System.out.println(pos);
    */
        
    }
}
