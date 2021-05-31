import javax.swing.JOptionPane;

import AppClasses.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        
        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Digite a idade do aluno");
        String dataNasc = JOptionPane.showInputDialog("Digite a data de nascimento do aluno:");
        String nomescola = JOptionPane.showInputDialog("Digite o nome da Escola:");
        String nMae = JOptionPane.showInputDialog("Digite o nome da mãe do aluno:");
        String nPai = JOptionPane.showInputDialog("Digite o nome do pai do aluno:");
        String Cpf = JOptionPane.showInputDialog("Digite o Cpf do aluno");
        String rGeral = JOptionPane.showInputDialog("Digite o registro geral:");
        String dtMat = JOptionPane.showInputDialog(" Digite a data da matrícula:");
        String Serie = JOptionPane.showInputDialog("Digite a série do aluno");
        String D1 = JOptionPane.showInputDialog("Digite o nome da disciplina 1: ");
        String n1 = JOptionPane.showInputDialog("Digite a 1ª nota do aluno");
        String D2 = JOptionPane.showInputDialog("Digite o nome da disciplina 2: ");
        String n2 = JOptionPane.showInputDialog("Digite a 2ª nota do aluno");
        String D3 = JOptionPane.showInputDialog("Digite o nome da disciplina 3: ");
        String n3 = JOptionPane.showInputDialog("Digite a 3ª nota do aluno");
        String D4 = JOptionPane.showInputDialog("Digite o nome da disciplina 4: ");
        String n4 = JOptionPane.showInputDialog("Digite a 4ª nota do aluno");

        //new Aluno() --> é uma instancia, criação de objeto.
        //referencia --> Exemplo: aluno1 é a variável usada para o objeto Aluno.
        //atributos --> sao as características, representação do objeto no mundo real.
        //Objeto ainda nao existe na memoria.So passará a existir depois de ser instanciado.
        Aluno aluno1 = new Aluno(); 
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade)); //tem q converter de String para Int
        aluno1.setDataNascimento(dataNasc);
        aluno1.setNomeEscola(nomescola);
        aluno1.setNomeMae(nMae);
        aluno1.setNomePai(nPai);
        aluno1.setNumeroCpf(Cpf);
        aluno1.setRegistroGeral(rGeral);
        aluno1.setDataMatricula(dtMat);
        aluno1.setSerieMatriculado(Serie);

       
         System.out.println(aluno1.toString()); // descrição do objeto na memória com toString().

         System.out.println("Média do aluno: " + aluno1.getMediaNota());
         System.out.println("Resultado: " + aluno1.getAlunoAprovado2());

        //  aluno = new Aluno();
        // System.out.println(aluno);//sem toString()

//Equals e Hashcode --> Diferenciar e comparar objetos

// Aluno alunoA = new Aluno();
// alunoA.setNome("Debora");

// Aluno alunoB = new Aluno();
// alunoB.setNome("Debora");

// if(alunoA.equals(alunoB)){
// System.out.println("Alunos com os mesmos dados. São iguais");
// }else{
//  System.out.println("Alunos com dados diferentes. Sao diferentes");
// }





    }
}
