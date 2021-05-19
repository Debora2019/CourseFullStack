
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        System.out.println("Entre com a 1ª nota:");
        nota1 =new Scanner(System.in).nextDouble();
        System.out.println("Entre com a 2ª nota: ");
        nota2 = new Scanner(System.in).nextDouble();
        System.out.println("Entre com a 3ª nota");
        nota3 = new Scanner(System.in).nextDouble();
        media= (nota1+nota2+nota3)/3;
        if(media >= 7) {
            System.out.println("Aprovado com média "+media);
        }
        else if(media >=5) {
            System.out.println("Recuperação com média "+media);
        }
        else {
            System.out.println("Reprovado com média "+media);
       }
    }
}