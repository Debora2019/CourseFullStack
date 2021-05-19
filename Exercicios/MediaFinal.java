import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        System.out.println("Digite a 1ª nota: ");
        Float n1 = input.nextFloat();

        System.out.println("Digite a 2ª nota: ");
        Float n2 = input.nextFloat();

        System.out.println("Digite a 3ª nota: ");
        Float n3 = input.nextFloat();

        Float media = (n1 + n2 +n3)/3;

        System.out.println("A média final é  " + media);

        if(media >= 16){

            if (media >= 18){
                System.out.println("Aprovado!");
                
            }else {
                       System.out.println("Recuperação!");                  
                 } //fim do 2º if
                 
            //     }else {
            //  System.out.println("Reprovado");
            //  }    
         }   //fim do 1º if  
        
}
}
 