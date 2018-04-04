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
public class PessoaFisica extends Contribuinte{
    
    private String cpf;

    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }
    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {
        double renda = this.getRendaBruta();
        if (renda <= 1400) {
            return 0;
        }
        if (renda > 1400 && renda <= 2100) {
            return (renda * 0.1) - 100;
        }
        if (renda > 2100 && renda <= 2800) {
            return (renda * 0.15) - 270;
        }
        if (renda > 2800 && renda <= 3600) {
            return (renda * 0.25) - 500;
        }
        return (renda * 0.3) - 700;//maior que 3600
    }

    @Override
    public String toString() {
        String s = "Pessoa Física \n";
        s += super.toString();
        s += "CPF: "+getCpf()+"\n";
        s += "Imposto a ser pago: "+calcularImposto()+"\n";
        return s;
    }
}
