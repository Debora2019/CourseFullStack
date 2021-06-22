package AppClasses;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {
        String texto = "Java, 90, 100, 98, 99";
        String[] valoresArray = texto.split(",");

        System.out.println("Nome do Curso: " + valoresArray[0]);
        System.out.println("Nota 1: " + valoresArray[1]);
        System.out.println("Nota 2: " + valoresArray[2]);
        System.out.println("NOta 3: " + valoresArray[3]);
        System.out.println("Nota 4: " + valoresArray[4]);

        //converter um array numa lista
        List<String> list = Arrays.asList(valoresArray);

        for(String valorString : list) {
            System.out.println(valorString);
        }

        //converter de uma lista para array
        String[] conversaoArray = list.toArray(new String[5]);

        for(int i = 0; i <conversaoArray.length; i++) {
             System.out.println(conversaoArray[i]);
        }
       
        
    }
}
