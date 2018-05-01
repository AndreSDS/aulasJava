package aula_75_84;

import java.util.StringTokenizer;

public class Aula75 {
    public static void main(String[] args) {
        String vazia = new String();
        System.out.println(vazia);

        String java = new String("Java");
        System.out.println(java);

        String java1 = new String(java);
        System.out.println(java1);

        byte[] ascii = {54,45,54,45,54,65,65};
        String abc = new String(ascii, 0 ,3);
        System.out.println(abc);

        String andre = "Amdre";
        for (int i=0; i<andre.length();i++){
            System.out.println(andre.charAt(i));
        }

        char[] and = new char[3];
        andre.getChars(0,3,and,0);
        System.out.println(and);

        String ola = "Olá";
        String ola2 = "OLÁ";
        String ola3 = "Olá";

        System.out.println(ola.equals(ola2));
        System.out.println(ola.equals(ola3));
        System.out.println(ola.equalsIgnoreCase(ola2));

        String banana = "banana";
        String ana = "ana";
        String ban = "ban";

        //System.out.println(banana.regionMatches(1, ana, 0, 3));
        //System.out.println(banana.regionMatches(true, 0, ban, 0));
        System.out.println(banana.endsWith(ana));
        System.out.println(banana.startsWith(ban));

        //-1 se a>b
        //0 se a==b
        //1 ou >1 se a<b
        String a = "a";
        String b = "b";
        String aMaiusculo = "A";
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo("a"));
        System.out.println(a.compareTo(aMaiusculo));

        System.out.println(banana.indexOf('x'));
        System.out.println("a");
        System.out.println(banana.lastIndexOf('a'));
        System.out.println(banana.contains("ana"));

        String teste = "Isso é um teste";
        System.out.println(teste.substring(10));
        System.out.println(teste.substring(5,15));

        String teste2 = "Olá";
        System.out.println(teste2.concat(teste));

        String espacos = " i s p a ç o ";
        String semEspacos = espacos.replace('i', 'e');
        System.out.println(semEspacos);

        semEspacos = semEspacos.replaceAll(" ", "");
        System.out.println(semEspacos);
        System.out.println(espacos.trim());

        String alfabeto = String.join(", ","A","B","C","D");
        System.out.println(alfabeto);

        String[] letras = alfabeto.split(", ");
        for (String letra: letras) {
            System.out.println(letra);
        }

        String doArquivo = "1;Antônio;30";
        String[] infos = doArquivo.split(";");
        for (String info : infos) {
            System.out.println(info);
        }

        String[] letras1 = {"A","B","C","D","E"};

        String alfabeto2 = " ";
        String alfabeto3 = "";

        StringBuffer sb = new StringBuffer();//thread safe não atrapalha multi threads
        for (String letra: letras1) {
            sb.append(letra);
        }
        alfabeto2 = sb.toString();

        StringBuilder sb_ = new StringBuilder();
        for (String letra: letras1) {
            sb_.append(letra);
        }
        alfabeto3 = sb_.toString();

        StringTokenizer st = new StringTokenizer(doArquivo, ";");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }



    }
}
