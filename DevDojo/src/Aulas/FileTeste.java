/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas;

import java.io.File;

/**
 *
 * @author edube
 */
public class FileTeste {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            System.out.println(file.createNewFile());
            boolean existe = file.exists();
            System.out.println("Permissão de leitura "+file.canRead());
            System.out.println("Path "+file.getPath()); 
            if (existe) {
                System.out.println("Deletado "+file.delete());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
