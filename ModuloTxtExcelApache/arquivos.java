

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class arquivos {
    public static void main(String[] args) throws IOException {
        
        File arquivo = new File("C:\\Users\\debora.michio\\Documents\\GitHub\\CourseFullStack\\ModuloTxtExcelApache\\arquivo.txt");
      
        //objeto para criar o arquivo
        if(!arquivo.exists()) {//se o arquivo não existe
            arquivo.createNewFile(); //entao vai criar um novo arquivo
        }
        //objeto para escrever no arquivo
        FileWriter escrever_no_arquivo = new FileWriter(arquivo);  

        for(int i=1; i<=10; i++){
            escrever_no_arquivo.write("Meu texto no arquivo na linha " +i +" \n");
        }
        escrever_no_arquivo.flush();
        escrever_no_arquivo.close();
    }

    
}
