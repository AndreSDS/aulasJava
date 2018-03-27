/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emojicombat;

/**
 *
 * @author edube
 */
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
 
    //metodos getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float al) {
        this.altura = al;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
        if ((this.getPeso()<52.2)||(this.getPeso()>120.2)) {
            this.categoria = "Inválida!";
        }else if(this.getPeso()<=70.3){
            this.categoria = "Peso Leve!";
        }else if(this.getPeso()<=83.9){
            this.categoria = "Peso Médio!";
        }else if(this.getPeso()<=120.2){
            this.categoria = "Peso Pesado!";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vi) {
        this.vitorias = vi;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int de) {
        this.derrotas = de;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int em) {
        this.empates = em;
    }
    //construtor
    public Lutador(String no,String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    //metodos especiais
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    public void apresentar(){
        System.out.println("-------Apresentando-------");
        System.out.println("Lutador - "+this.getNome());
        System.out.println("Origem - "+this.getNacionalidade());
        System.out.println(this.getIdade()+" anos");
        System.out.println(this.getAltura()+" m de altura");
        System.out.println("Pesando - "+this.getPeso()+"kg");
        System.out.println("Vitórias - "+this.getVitorias());
        System.out.println("Derrotas - "+this.getDerrotas());
        System.out.println("Empates - "+this.getEmpates());
    }
    public void status(){
        System.out.println("-------Descrição-------");
        System.out.println(this.getNome()+" é um "+this.getCategoria()+
                " com "+this.getVitorias()+" vitórias "+this.getDerrotas()+
                " derrotas e "+this.getEmpates()+" empates!");
    }
    
}
