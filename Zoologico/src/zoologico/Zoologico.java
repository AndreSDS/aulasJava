/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author edube
 */
public class Zoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setAnbiente("Terra");
        camelo.setVelocidade(2);
        
        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);
        
        Mamifero urso = new Mamifero();
        urso.setNome("Urso do canadá");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);
        
        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;
        
        for (Animal animal : animais) {
            System.out.println(animal.toString());
        }
    }
    
}
