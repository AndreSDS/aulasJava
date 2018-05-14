/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author edube
 */
public class BufferTeste {
    public static void main(String[] args) {
        
        File file = new File("Arquivo.txt");
        
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                 BufferedReader br = new BufferedReader(new FileReader(file))) {
                
                bw.write("Escrevendo uma mensagem no arquivo");
                bw.newLine();
                bw.write("Pulando linha");
                bw.flush();
                
                String s = null;
                while ((s = br.readLine()) != null) {                
                  System.out.println(s);
                }
            } catch (Exception e) {
        }
        
    }
    
}
