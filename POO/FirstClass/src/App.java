import AppClasses.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        
        //new Aluno() --> é uma instancia, criação de objeto.
        //referencia --> Exemplo: aluno1 é a variável usada para o objeto Aluno.
        //atributos --> sao as características, representação do objeto no mundo real.
        //Objeto ainda nao existe na memoria.So passará a existir depois de ser instanciado.
        Aluno aluno1 = new Aluno(); 
        aluno1.setNome("Juan");
        aluno1.setIdade(13);
        aluno1.setDataNascimento("26/12/2007");
        aluno1.setNomeEscola("Lima de Freitas");
        aluno1.setNomeMae("Debora");
        aluno1.setNomePai("Tony");
        aluno1.setNumeroCpf("258.369.258.147");
        aluno1.setRegistroGeral("589632");
        aluno1.setDataMatricula("10/02/2019");
        aluno1.setSerieMatriculado("8º ano");
      


        //************************************************************************************************** */
        Aluno aluno2 = new Aluno();



    }
}
