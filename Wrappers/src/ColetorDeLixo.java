public class ColetorDeLixo{

    public static void obterMemoriaUsada(){

    final int MB = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime();//singleton

        System.out.println((runtime.totalMemory() - runtime.freeMemory()/MB));
    }

    public static void main(String[] args) {

        Contato[] contatos;
        contatos = new Contato[1000];
        Contato contato;

        for (int i = 1; i < contatos.length; i++){
           contato = new Contato("Contato "+i,"123.321.123-60 "+i,"5833-3137 "+i,"@e-mail "+i);
           contatos[i] = contato;
        }
        System.out.println("Contatos criados");

        obterMemoriaUsada();

        contatos = null;

        Runtime.getRuntime().runFinalization();
        Runtime.getRuntime().gc();

        System.out.println("Contatos removidos da memória");
        obterMemoriaUsada();
    }
}
