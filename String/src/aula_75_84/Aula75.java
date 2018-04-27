package aula_75_84;

public class Aula75 {
    public static void main(String[] args) {
        String vazia = new String();
        System.out.println(vazia);

        String java = new String("Java");
        System.out.println(java);

        String java1 = new String(java);
        System.out.println(java1);

        char[] charsJava = new char["j", "a", "v", "a"];
        String java2 = new String(charsJava);
        System.out.println(java2);

        char[]  abcdef = {"A","B","C","D","E","F"};
        String abc = new String(abcdef, 0, 3);
        System.out.println(abc);

        byte[] ascii = {54,45,54,45,54,65,65};
        String abc = new String(ascii, 0 ,3);
        System.out.println(abc);

        String andre = "Amdre";
        for (int i=0; i<andre.length();){
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

        System.out.println(banana.regionMatches(1, ana, 0, 3));
        System.out.println(banana.regionMatches(true, 0, ban, 0));
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




    }
}
