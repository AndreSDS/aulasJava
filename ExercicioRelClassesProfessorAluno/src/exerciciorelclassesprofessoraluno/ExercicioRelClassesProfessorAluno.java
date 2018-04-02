/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorelclassesprofessoraluno;

import java.util.Scanner;

/**
 *
 * @author edube
 */
public class ExercicioRelClassesProfessorAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o nome do curso");
        String nome = scan.nextLine();
        
        System.out.println("Entre com o horario do curso");
        String horario = scan.nextLine();
        
        System.out.println("Entre com o nome do professor");
        String nomeProf = scan.nextLine();
        
        System.out.println("Entre com o departamento do professor");
        String depProf = scan.nextLine();
        
        System.out.println("Entre com o email do professor");
        String emailProf = scan.nextLine();
        
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);
        
        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(depProf);
        professor.setEmail(emailProf);
        
        curso.setProfessor(professor);
        
        System.out.println("------Alunos------");
        
        Aluno[] alunos = new Aluno[5];
        
          for (int i = 0; i < alunos.length; i++) {
             scan.nextLine();
            System.out.println("Entre com o nome do aluno "+(i+1));
              String nomeAluno = scan.nextLine();
              
            System.out.println("Entre com a matr[icula do aluno:" );
              String matAluno = scan.nextLine();
            
              double[] notas = new double[4];
                for (int j = 0; j < 4; j++) {
                  System.out.println("Entre com a nota "+(j+1));
                  notas[j] = scan.nextDouble();
                }
                
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);
            
            alunos[i] = aluno;
          }
        curso.setAlunos(alunos);
        
        System.out.println(curso.obterInfo());
    }
    
}
