package Thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;



public class ImplementarFilaThread extends Thread{
    //tem q ser estático.
    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
                            new ConcurrentLinkedQueue<ObjetoFilaThread>();

    public static void add(ObjetoFilaThread objetoFilaThread) {
        pilha_fila.add(objetoFilaThread);
    }
    
    @Override
    public void run() {

        System.out.println("Fila rodando...");

        parei na aula 14.3

        while(true) {

            Iterator iteracao = pilha_fila.iterator();

        synchronized (pilha_fila) {//bloquear o acesso a esta lista por outros processos. Apenas essa Thread será executada

            while(iteracao.hasNext()) {//enquanto tiver dados na lista, vai executar

                ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();//pega o objeto atual
                //execução:
                //processar várias faturas
                //gerar uma lista grande de PDF
                // gerar envio em massa de email

                System.out.println("-------------------------------------------------------------------------");

                System.out.println(processar.getEmail());
                System.out.println(processar.getNome());
                iteracao.remove();//remove
    
                try {
                    Thread.sleep(100);//dar um tempo para descarga da memória
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    }
        }
    


        try {
                Thread.sleep(1000);//tem que dar esse outro tempo
            } catch (InterruptedException e) {
                e.printStackTrace();
              }
    }
   
}
}