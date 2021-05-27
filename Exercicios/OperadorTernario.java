public class OperadorTernario {

    public static void main(String[] args) {

        //condição logica com IF e ELSE
        int nota1 = 60;
        int nota2 = 50;
        int nota3 = 60;
        int nota4 = 70;
        int media = 0;
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        // if(media >= 70){
        //     System.out.println(media + " " + "Aprovado ");
        // } 
        // if (media >= 40 && media <= 69){
        //     System.out.println(media  + " " + "Recuperação");
        // }
        
        // else {
        //     System.out.println(media +  " " + "Reprovado ");
        // }


        // Operadores ternarios sao usados para micro validações. 

        String  saidaResultado;

        saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "ALuno em recuperação":"Aluno reprovado";

        System.out.println(saidaResultado);


    }

    
}
