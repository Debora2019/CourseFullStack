import java.util.Scanner;
 
public class RepeticaoFor {
 
    public static void main(String[] args) {
        int i, idade = 1, maiorIdade = 18, menorIdade = 999, mediaIdade = 0, somaIdade = 0;
        Scanner input = new Scanner(System.in);
 
        System.out.println("Informe a idade de 5 pessoas: ");
 
        for (i = 1; i<= 5; i++) {
            System.out.println("Informe a " + i + "ª idade");
            idade = input.nextInt();
            mediaIdade = mediaIdade + idade;
 
            if (idade >= 18) {
              somaIdade++;
                if (18 < idade)
                    maiorIdade = idade;
            } else if ( (menorIdade > idade) && ( idade != 0 ) )
                menorIdade = idade;
        }
        mediaIdade = mediaIdade / i;
        System.out.println("A maior idade é: " + maiorIdade);
        System.out.println("A quantidade de pessoas com maior idade é: "+ somaIdade);
        System.out.println("A média das idades é: " + mediaIdade);
        System.out.println("A menor idade é: " + menorIdade);
 
    }

}