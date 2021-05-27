public class IfElse {

    public static void main(String[] args) {

        // int mediaAluno = 70;
        // String nome="Debora";

        // if(mediaAluno >=70 && nome.equals("Juan")){
        //  System.out.println("Parabéns, voce está aprovado!");
        // }
        // else  if(mediaAluno <70){
        //     System.out.println("Voce está reprovado!");
        //    }

        //    // caso nenhuma das condições acima sejam verdadeiras, então vai entrar nesse else
        //    else{
        //        System.out.println("Aluno não encontrado");
        //    }


        int nota1 = 10;
        int nota2 = 30;
        int nota3 = 70;
        int nota4 = 40;
        int media = 0;
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 70){
            System.out.println(media + " " + "Aprovado ");
        } 
        if (media >= 40 && media <= 69){
            System.out.println(media  + " " + "Recuperação");
        }
        
        else {
            System.out.println(media +  " " + "Reprovado ");
        }
    } 
    
}
