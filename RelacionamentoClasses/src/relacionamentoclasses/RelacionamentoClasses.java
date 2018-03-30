/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionamentoclasses;

/**
 *
 * @author edube
 */
public class RelacionamentoClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //criando objeto endereco
        Endereco end = new Endereco();
        end.setNomeRua("Joaquim de paula");
        end.setNumero("53");
        end.setComplemento("Casa");
        end.setCidade("São Paulo");
        end.setEstado("São Paulo");
        end.setCep("0833-332");
        
        //criando objeto telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("11");
        telefone.setNumero("5833-2243");
        
        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("11");
        telefone2.setNumero("9999-2243");
        
        //criando array de telefones
        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;
        
        //criando objeto contato
        Contato contato = new Contato();
        contato.setNome("André");
        contato.setEndereco(end);//relacionando obejto da classe endereco
        contato.setTelefones(telefones);//relacionando objeto da classe telefone
        
        //saidas no console
        System.out.println(contato.getNome());
            //previnindo erro do objeto endereco
            if (contato != null && contato.getEndereco() != null) {
                System.out.println(contato.getEndereco().getCidade());
            }
            //prevenindo erro do array telefones
            if (contato != null && contato.getTelefones() != null) {
                for (Telefone t: contato.getTelefones()) {
                    System.out.println(t.getTipo()+" "+t.getDdd()+" "+t.getNumero());                    
                }
            }
    }  
}
