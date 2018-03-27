/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author edube
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v, s = 0;
        Scanner t = new Scanner(System.in);
        t.nextLine();

        JOptionPane.showMessageDialog(null, "Olá Mundo!","Boas Vindas!",JOptionPane.WARNING_MESSAGE);
        do {
            v = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um número : "));
            s += v;
            
        } while (v != 0);
        JOptionPane.showMessageDialog(null, "Resultado final : "+s);
    }
}
