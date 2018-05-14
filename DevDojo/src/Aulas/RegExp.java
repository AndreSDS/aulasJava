/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author edube
 */
public class RegExp {
    public static void main(String[] args) {
        
        //\d todos os digitos
        // \D tudo que não é digito
        // \s spaçoes em branco
        // \S caracteres que n estão em branco
        // \w carcteres de palavras a-z A-Z digitos e _underline
        // \W tudo que n for caracter de palavra
        // []
        // ? zero ou um
        // * zero ou mais
        // + uma ou mais
        // [n,m] de n até m
        // ()
        // |
        // $
        
        // ^ [^abc] caracter de negação - quero qualquer cois aque n seja abc
        
        //String regex = "([a-zA-Z0-9\\._-])+@(a-zA-Z)+(\\.([a-zA-Z])+)+";
        //String texto = "fulanodeta@gmail.com, 1034@hotmai.com, #0!abrao@mail.com, teste@gmail.com, teste@mail.com";
        String regex = "\\d[2]/\\d[2]/\\d[2,4]";
        String texto = "05/10/2010 05/5/2015 1/1/01 01/05/95"; //dd/mm/aaaa
        Pattern patern = Pattern.compile(regex);
        //System.out.println("Email válido? "+"#0!abrao@mail.com".matches(regex));
        Matcher matcher = patern.matcher(texto);
        System.out.println(texto);
        System.out.println(matcher.pattern());
        while(matcher.find()){
            System.out.println(matcher.start()+ " " + matcher.group());
        }
    }
}
