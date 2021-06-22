package AppClasses;

public class Matriz {
    public static void main(String[] args) {
        //array --> int notas[]= new  int [1];

        //matriz
        int  notas[] []= new  int [2][3];
        notas[0][0]=80;
        notas[0][1]=90;
        notas[0][2]=70;

        notas[1][0]=50;
        notas[1][1]=60;
        notas[1][2]=40;

     //   System.out.println("as notas sao: " + notas);

        //lendo a matriz:
    
        for (int i=0; i<notas.length; i++){//vai percorrer as linhas
           
          System.out.println("--------------------------------------**-------------------------------------");
            
            for (int j=0; j<notas[i].length; j++){//pra cada liha vai percorrer as colunas
               
                System.out.println("As notas sao: " + notas[i][j]);
            }
         
        }
    }
}
