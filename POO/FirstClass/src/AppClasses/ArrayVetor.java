package AppClasses;

import javax.swing.JOptionPane;

public class ArrayVetor {
    public static void main(String[] args) {
        //criação do aluno
        Aluno aluno = new Aluno ();
        aluno.setNome("Juan");
        aluno.setNomeEscola("Lima Freitas");

        //criação das disciplinas
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Angular");

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Java");

        //criação das notas dentro de cada disciplina
        double[] notas = {8.5, 9.6, 10, 9.5};
        disciplina.setNota(notas);

        double[] notas1 = {8.7, 9.2, 8.9, 9.9};
        disciplina2.setNota(notas1);

        aluno.getDisciplinas().add(disciplina);
        






















    //     //instanciar um array
    //     double [] valores = new double[4];

    //     //pode ser assim tambem, ja definindo valores
    //     double[] Valores = {65.8, 78.1, 94.4};

      
    //    String posicao =  JOptionPane.showInputDialog("Quantas posições o Array deve ter?");

    //     //array pode ser de todos os tipos de dados e objetos tambem.
    //     double[] notas = new double[Integer.parseInt(posicao)];
       
    //     for (int i = 0; i <notas.length; i++) {
    //     String  valor = JOptionPane.showInputDialog("Digite a nota:  " + i );
    //     notas[i] = Double.parseDouble(valor);

    //     }

    //     for (int i = 0; i <notas.length; i++) {
    //         System.out.println("A nota " + (i + 1) + " é: " + notas[i]);
    //     }
       
    




      




    }
    
}
