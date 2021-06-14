package AppClasses;

public class TesteClassesFilhas {
    public static void main(String[] args) throws Exception {

       Aluno aluno = new Aluno();
       aluno.setNome("Juan V. M. Mutiz");
       aluno.setNomeEscola("Lima Freitas");
       aluno.setIdade(23);

       Diretor diretor = new Diretor();
       diretor.setNome("Débora Michio");
       diretor.setTempoDirecao(Integer.valueOf(2));
       diretor.setIdade(42);

       Secretario secretario = new Secretario();
       secretario.setNome("Tony ");
       secretario.setExperiencia("Administração");
       secretario.setIdade(39);

        System.out.println("Dados importantes do aluno: " + aluno + "Dados importantes do secretario: " + secretario + " Dados importantes do diretor:" + diretor);
        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Salário do aluno: " + aluno.salario());
        System.out.println("Salário do secretário: " + secretario.salario());
        System.out.println("Salário do  diretor: " + diretor.salario());
    


    }
}
