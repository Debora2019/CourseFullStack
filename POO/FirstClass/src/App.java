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
        String n1 = JOptionPane.showInputDialog("Digite a 1ª nota do aluno");
        String n2 = JOptionPane.showInputDialog("Digite a 2ª nota do aluno");
        String n3 = JOptionPane.showInputDialog("Digite a 3ª nota do aluno");
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
        aluno1.setNota1(Double.parseDouble(n1));
        aluno1.setNota2(Double.parseDouble(n2));
        aluno1.setNota3(Double.parseDouble(n3));
        aluno1.setNota4(Double.parseDouble(n4));

        
        System.out.println("DADOS DO ALUNO: ");
        System.out.println("Nome do aluno: " + aluno1.getNome());
        System.out.println("Idade do aluno: " + aluno1.getIdade());
        System.out.println("Data de nascimento: " + aluno1.getDataNascimento());
        System.out.println("Nome da escola: " + aluno1.getNomeEscola());
        System.out.println("Nome da mãe: " + aluno1.getNomeMae());
        System.out.println("Nome do pai: " + aluno1.getNomePai());
        System.out.println("Numero do CPF: " + aluno1.getNumeroCpf());
        System.out.println("Numero do Registro Geral: " + aluno1.getRegistroGeral());
        System.out.println("Data da Matricula: " + aluno1.getDataMatricula());
        System.out.println("Série do Aluno: " + aluno1.getSerieMatriculado());
        System.out.println("A media do aluno é de " + aluno1.getMediaNota());
        System.out.println("O aluno está " + aluno1.getAlunoAprovado());
        System.out.println(aluno1.getAlunoAprovado2());
        //************************************************************************************************** */
       


    }
}
