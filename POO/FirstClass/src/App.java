import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import AppClasses.Aluno;
import AppClasses.Disciplina;
import constantes.StatusAluno;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Aluno> alunos = new ArrayList<Aluno>(); // criando uma lista de alunos
        List<Aluno> alunosAprovados = new ArrayList<Aluno>(); // criando uma lista de alunos aprovados, recuperacao e reprovados.
        List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
        List<Aluno> alunosReprovados = new ArrayList<Aluno>();

        for(int qtd=1; qtd<=5; qtd++) {

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+"?");
        // String idade = JOptionPane.showInputDialog("Digite a idade do aluno");
        // String dataNasc = JOptionPane.showInputDialog("Digite a data de nascimento do aluno:");
        // String nomescola = JOptionPane.showInputDialog("Digite o nome da Escola:");
        // String nMae = JOptionPane.showInputDialog("Digite o nome da mãe do aluno:");
        // String nPai = JOptionPane.showInputDialog("Digite o nome do pai do aluno:");
        // String Cpf = JOptionPane.showInputDialog("Digite o Cpf do aluno");
        // String rGeral = JOptionPane.showInputDialog("Digite o registro geral:");
        // String dtMat = JOptionPane.showInputDialog(" Digite a data da matrícula:");
        // String Serie = JOptionPane.showInputDialog("Digite a série do aluno");
       
        //new Aluno() --> é uma instancia, criação de objeto.
        //referencia --> Exemplo: aluno1 é a variável usada para o objeto Aluno.
        //atributos --> sao as características, representação do objeto no mundo real.
        //Objeto ainda nao existe na memoria.So passará a existir depois de ser instanciado.
        Aluno aluno1 = new Aluno(); 
        aluno1.setNome(nome);
        // aluno1.setIdade(Integer.valueOf(idade)); //tem q converter de String para Int
        // aluno1.setDataNascimento(dataNasc);
        // aluno1.setNomeEscola(nomescola);
        // aluno1.setNomeMae(nMae);
        // aluno1.setNomePai(nPai);
        // aluno1.setNumeroCpf(Cpf);
        // aluno1.setRegistroGeral(rGeral);
        // aluno1.setDataMatricula(dtMat);
        // aluno1.setSerieMatriculado(Serie);

        //criar lista dinamica de disciplinas 
        for (int i = 1; i <=1; i++) {
            String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina "+ i+":");
            String notaDisciplina = JOptionPane.showInputDialog("Digite a nota "+i+":" );
            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.valueOf(notaDisciplina)); // tem q converter de String para Double.

            aluno1.getDisciplinas().add(disciplina); // add uma disciplina no objeto aluno
        }

        // remover uma disciplina da lista e continuar a perguntar...
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
        if(escolha == 0){
            int posicao = 1;
            int continuarRemover = 0; 
            while(continuarRemover==0){
            String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina: 1, 2, 3 ou 4?");
            aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()- posicao);
            posicao ++;
            continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar a remover?");
            }
            
            JOptionPane.showMessageDialog(null, "Disciplina(s) removida(s) com sucesso!");
        }

        alunos.add(aluno1);// add aluno
    }
    //lista 
    for (Aluno aluno : alunos) {
        if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)){
            alunosAprovados.add(aluno);
        }else
        if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)){
            alunosRecuperacao.add(aluno);
        }else
        alunosReprovados.add(aluno);
        
    }
        



        // for(int pos = 0; pos < alunos.size(); pos++){ // percorrendo uma lista pela posição
        //     Aluno aluno = alunos.get(pos);

        //     if(aluno.getNome().equalsIgnoreCase("juan")){ // subtituir um aluno por outro
        //         Aluno trocar = new Aluno();
        //         trocar.setNome("O aluno foi trocado");
        //         Disciplina disciplina = new Disciplina(); // nova disciplina
        //         disciplina.setDisciplina("Matematica");
        //         disciplina.setNota(98);

        //         trocar.getDisciplinas().add(disciplina); //add a nova disciplina na lista

        //         alunos.set(pos, trocar); //ao substituir um aluno por outro tem q saber a posição dentro da lista de alunos.
        //         aluno = alunos.get(pos);
        //     }

        //   //  System.out.println("Aluno trocado:" + alunos.get(pos));
        //  //   System.out.println("Aluno = " + aluno.getNome());
        //     System.out.println("Média do aluno: " + aluno.getMediaNota());
        //     System.out.println("Resultado: " + aluno.getAlunoAprovado2());
        //     System.out.println("----------------------------------------------------**----------------------------------------------------");

        //     for (int i = 0; i < aluno.getDisciplinas().size(); i++){
        //         Disciplina disc = aluno.getDisciplinas().get(i);
        //         System.out.println("Disciplina: " + disc.getDisciplina() + "   Nota: " + disc.getNota());
        //     }
        // }


        // for (Aluno aluno : alunos) {
        //     if(aluno.getNome().equalsIgnoreCase("juan")){ //aqui so vai executar os cálculos se o sistema encontrar o nome do aluno na condição: Juan
        //         alunos.remove(aluno); // para remover um aluno conforme a condicao acima
        //     break;
        //     }else{ 
        //         System.out.println(aluno.toString()); // descrição do objeto na memória com toString().
        //         //pode ser de qualquer das duas formas abaixo para mostrar o objeto
        //         System.out.println("Média do aluno: " + aluno.getMediaNota());
        //         System.out.println("Resultado: " + aluno.getAlunoAprovado2());
        //         System.out.println("----------------------------------------------------**----------------------------------------------------");
        //     }          
        // }

        // for (Aluno aluno : alunos) {
        //     System.out.println("Alunos que sobraram na lista:");
        //     System.out.println(aluno.getNome());
        //     System.out.println("Suas disciplinas são:");
        //    for (Disciplina disciplina : aluno.getDisciplinas()) {
        //        System.out.println(disciplina.getDisciplina() + "--> " + disciplina.getNota());
        //    }
        // }
    }
}
