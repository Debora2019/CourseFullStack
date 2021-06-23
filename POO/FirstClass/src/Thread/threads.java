package Thread;

import javax.swing.JOptionPane;

public class threads {
    public static void main(String[] args) throws InterruptedException {
        
    //thread processando em paralelo do envio de email
   Thread threadEmail = new Thread(thread1);
    threadEmail.start();
   
   //thread processando em paralelo do envio de fatura
   Thread threadFatura =  new Thread(thread2);
   threadFatura.start();
 
        
    //Código do sistema do usuário continua o fluxo de trabalho
    System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
    JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");

    }

    private static Runnable thread2 = new Runnable() {

        @Override
        public void run() {
        
        //código da rotina a ser executada em paralelo
        for (int i = 0; i < 5; i++) {
            //executar esse envio com um determinado tempo.
            System.out.println("Executando alguma rotina: envio de fatura");
                      
            try {
                Thread.sleep(4000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }//dá um tempo pre definido para executar a rotina
                              
                  }//fim do código em paralelo
                  }      
    };

    private static Runnable thread1 = new Runnable() {

        @Override
        public void run() {
        //código da rotina a ser executada em paralelo
        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }

            //executar esse envio com um determinado tempo.
            System.out.println("Executando alguma rotina: envio de email");
        }
        }

    };
}
