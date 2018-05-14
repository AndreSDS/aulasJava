/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author edube
 */
public class FileDirectoryTeste {
    public static void main(String[] args) {
        File pasta = new File("Folder");
        boolean criou = pasta.mkdir();
        System.out.println("Pasta criada: "+criou); 
        
        File arquivo = new File(pasta,"arquivo.txt");
        File arquivoRenomeado = new File(pasta,"ArquivoRenomeado.txt");
       boolean renomeado1 = arquivo.renameTo(arquivoRenomeado);
        System.out.println("Renomeou "+renomeado1);
        
        File pastaRenomeada = new File("pasta2");
        boolean renomeado2 = pasta.renameTo(pastaRenomeada);
        System.out.println("Pasta renomeado : "+renomeado2);
        
        try {
            arquivo.createNewFile();
        } catch (IOException ex) {
        }
    buscarAquivos();
    }
    public static void buscarAquivos(){
            File file = new File("Folder");
            String[] list = file.list();
            for (String s : list) {
                System.out.println(s);
            }
        }
    
}
