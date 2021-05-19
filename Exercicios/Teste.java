import java.util.Scanner;

public class Teste {
    public static void main(String[] args){

      Scanner person = new Scanner(System.in);
       
        //Inserir o nome e ano que nascer. O resultado será mostrar a idade da pessoa
        // int anoAtual=2021;
        // System.out.println("Digite o seu nome completo: ");
        // String nome = person.nextLine();

        // System.out.println("Digite o ano que voce nasceu:");
        // int ano = person.nextInt();

        // System.out.println("Resultado: " + (nome + ", sua idade é de " + (anoAtual - ano) + "." ));


        //Inserir o peso e a altura. Resultado mostrará o imc correspondente.
        System.out.println("Digite o seu peso atual: (Ex.: 65,5)");
        Float peso = person.nextFloat();

        System.out.println("Digite a sua altura: (Ex.: 1,60 ) ");
        Float altura = person.nextFloat();

        Float imc = peso/altura;

        System.out.println("O seu imc é: " + imc);

       }
}

