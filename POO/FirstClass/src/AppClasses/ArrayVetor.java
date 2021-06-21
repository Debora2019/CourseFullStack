package AppClasses;

//import javax.swing.JOptionPane;

public class ArrayVetor {
    public static void main(String[] args) {
        //criação do aluno
        Aluno aluno = new Aluno ();
        aluno.setNome("Juan");
        aluno.setNomeEscola("Lima Freitas");

        //criação das disciplinas:
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Angular");

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Java");

       //add a disciplina dentro da lista de disciplinas do aluno
        aluno.getDisciplinas().add(disciplina2);
        aluno.getDisciplinas().add(disciplina);
       
        //criação das notas dentro de cada disciplina
        double[] notas = {8.5, 9.6, 10, 9.5};
        disciplina.setNota(notas);

        double[] notas1 = {8.7, 9.2, 8.9, 9.9};
        disciplina2.setNota(notas1);
//********************************************************************************************************************* */
      //objeto aluno2:
      Aluno aluno2 = new Aluno ();
      aluno2.setNome("Debora");
      aluno2.setNomeEscola("ATEC");

      //criação das disciplinas:
      Disciplina disciplina3 = new Disciplina();
      disciplina3.setDisciplina("CSS");

      Disciplina disciplina4 = new Disciplina();
      disciplina4.setDisciplina("HTML");

     //add a disciplina dentro da lista de disciplinas do aluno
      aluno2.getDisciplinas().add(disciplina3);
     
      //criação das notas dentro de cada disciplina
      double[] notas2 = {10, 8.9, 9.7, 10};
      disciplina3.setNota(notas2);

      double[] notas3 = {9.8, 10, 8.8, 9.9};
      disciplina4.setNota(notas3);

      aluno2.getDisciplinas().add(disciplina4);
       
//----------------------------------------------------------------||---------------------------------------------------
        //criação de um array
        Aluno[] arrayAlunos = new Aluno[2];
        arrayAlunos[0] = aluno;
        arrayAlunos[1] = aluno2;
       
        for (int i = 0; i < arrayAlunos.length; i++) {//vai percorrer o nome do aluno
            System.out.println("Nome do aluno: " + arrayAlunos[i].getNome());

            for (Disciplina d: arrayAlunos[i].getDisciplinas()){ //vai mostrar as disciplinas do aluno acima
                System.out.println("Disciplina: " + d.getDisciplina());
                

                for(int j=0; j < d.getNota().length; j++){//vai mostrar as 4 notas das disciplinas acima
                    System.out.println("A nota numero " + j + " é " + d.getNota()[j]);
                   
                }
            }

            System.out.println("---------------------------------------------------------------------------------------");
        }

        





















        
//         System.out.println("Nome do aluno: " + aluno.getNome() + " inscrito no curso " + aluno.getNomeEscola());
//         System.out.println("*************Disciplinas do aluno ****************");
//         for (Disciplina d : aluno.getDisciplinas()) {

         
//             System.out.println("Disciplina: " + d.getDisciplina());
//             System.out.println("Notas da disciplina: ");

//             // para descobrir qual é a maior nota em cada disciplina 
//             double notaMax = 0.0; 
//             for(int i=0; i < d.getNota().length; i++){
//                 System.out.println("Nota " + i + " é: " + d.getNota()[i]);
//                 if(i == 0){
//                 notaMax = d.getNota()[i];
//             }else{
//                 if(d.getNota()[i] > notaMax){ //para descobrir qual a menor nota em cada disciplina: apenas precisa alterar o sinal de maior para menor no if - linha 46
//                     notaMax = d.getNota()[i];
//                 }
//             }

//         }
//         System.out.println("A maior nota é: " + notaMax);


// }

















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
