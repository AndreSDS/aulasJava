/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author edube
 */
public class FileWriterTete {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            FileWriter fw = new FileWriter(file);
            FileReader fr = new FileReader(file);
            
            fw.write("Escrevendo uma mensagem no arquivo");
            fw.flush();
              
            char[] in = new char[500];
            int size = fr.read(in);
            System.out.println("tamanho "+size);
            for (char c : in) {
                System.out.print(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
