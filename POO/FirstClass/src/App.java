import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import AppClasses.Aluno;
import AppClasses.Disciplina;
import AppClasses.Secretario;
import AppClasses.classesAuxiliares.FuncaoAutenticacao;
import AppClasses.exception.ExceptionProcessarNota;
import AppClasses.interfaces.PermitirAcesso;
import constantes.StatusAluno;

public class App {
    public static void main(String[] args) throws Exception {

        // try{ 

        // try{
        //     File file = new File("c://lines.txt");
        //     Scanner scanner = new Scanner(file);
        // } catch (FileNotFoundException e){
        //    throw new ExceptionProcessarNota("Foi encontrado um erro no processamento do arquivo.");
        // }
        
        String login = JOptionPane.showInputDialog("Login:");
        String senha = JOptionPane.showInputDialog("Senha:");
    
        if(new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()){  //so quem tem a chave é que tem permissão para entrar.  

        List<Aluno> alunos = new ArrayList<Aluno>(); // criando uma lista de alunos ;

        //é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores.
        HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

      //  As listas abaixo serão substituídas pelo HashMap.
      //  List<Aluno> alunosAprovados = new ArrayList<Aluno>(); // criando uma lista de alunos aprovados
      //  List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();// craindo uma lista de alunos recuperacao
      //  List<Aluno> alunosReprovados = new ArrayList<Aluno>(); // criando uma lista de alunos reprovados

        for(int qtd=1; qtd<=2; qtd++) { // quantidade de vezes que fará a pergunta. Será perguntado o nome de 5 alunos

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
           // disciplina.setNota(Double.valueOf(notaDisciplina)); // tem q converter de String para Double.

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
        //inicializando valores 
        maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
        maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
        maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

    //lista de alunos aprovados, em recuperação e reprovados.
    for (Aluno aluno : alunos) {
        if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)){
            maps.get(StatusAluno.APROVADO).add(aluno);
        }else
        if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)){
            maps.get(StatusAluno.RECUPERACAO).add(aluno);
        }else
        maps.get(StatusAluno.REPROVADO).add(aluno);
        
    }
        
    System.out.println("---------------------Lista dos Alunos Aprovados: -------------------------------");
    for(Aluno aluno : maps.get(StatusAluno.APROVADO)){
          System.out.println(aluno.getNome() +" - " + aluno.getAlunoAprovado2()+ " - " + "Média: " + aluno.getMediaNota());
    }

    System.out.println("---------------------Lista dos Alunos Em Recuperação: -------------------------------");
    for(Aluno aluno : maps.get(StatusAluno.RECUPERACAO)){
          System.out.println(aluno.getNome() +" - " +  aluno.getAlunoAprovado2()+ " - " + "Média: " + aluno.getMediaNota());
    }

    System.out.println("---------------------Lista dos Alunos Reprovados: -------------------------------");
    for(Aluno aluno : maps.get(StatusAluno.REPROVADO)){
          System.out.println(aluno.getNome() +" - " + aluno.getAlunoAprovado2()+ " - " + "Média: " + aluno.getMediaNota());
    }

}else{
    JOptionPane.showMessageDialog(null, "Acesso negado!");
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
    // }catch(Exception e){//capturar todas as exceções que não foram previstas
    //     e.printStackTrace();
    //     JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getClass().getName());
    // }

}

}
