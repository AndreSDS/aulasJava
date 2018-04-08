package tratamentoexecoes;

public class TratamentoExecoes {

    public static void main(String[] args) {
        
        try {
            int vetor[] = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;

            System.out.println("Este não será impresso");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Após a exeção");
        
        int[] numeros = {4,8,16,32,64,128};
        int[] denom = {2,0,4,8,0};
        
        for (int i = 0; i < numeros.length; i++) {
          try {
            System.out.println(numeros[i]+" / "+  denom[i]+" = "+(numeros[i]/denom[i]));                
            //System.exit(0); essa linha sai da execução
          }
          catch (Exception e) {
             System.out.println(e.getMessage());
             e.printStackTrace();
             //System.exit(0); essa linha sai da execução
          }
          finally{
              System.out.println("Esta linha será impressa após o try ou o catch");
          }
        }
    }
}
