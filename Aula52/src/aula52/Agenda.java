/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula52;

/**
 *
 * @author edube
 */
public class Agenda {
    
    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }
    
    public void adicionarContato(Contato c) throws AgendaCheiaEsception{
        
        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                contatos[i] = c;
                cheia = false;
                break;
            }
        }
        if (cheia) {
            throw new AgendaCheiaEsception();
        }
    }
    
    public int consultaContatoPorNome(String nome) throws ContatoNaoExisteException{
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return i;
                }
            }
        }
        throw new ContatoNaoExisteException(nome);
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato contato : contatos) {
            if (contato != null) {
             s += contato.toString()+"\n";   
            }
        }
        return s;
    }
}
