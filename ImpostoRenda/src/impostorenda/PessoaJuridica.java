/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostorenda;

/**
 *
 * @author edube
 */
public class PessoaJuridica extends Contribuinte{
    
    private String cnpj;

    public PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        String s = "Pessoa Jurídica \n";
        s += super.toString();
        s += "CNPJ: "+getCnpj()+"\n";
        s += "Imposto a ser pago: "+calcularImposto()+"\n";
        return s;
    }    
}
