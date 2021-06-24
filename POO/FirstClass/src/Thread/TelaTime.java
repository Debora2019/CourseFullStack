package Thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTime extends JDialog{

    private JPanel jPanel = new JPanel(new GridBagLayout());//Painel de componentes

    private JLabel descricaoHora = new JLabel("Time Thread 1");
    private JTextField mostraTempo = new JTextField();

    private JLabel descricaoHora2 = new JLabel("Time Thread 2");
    private JTextField mostraTempo2 = new JTextField();

    private JButton jButton = new JButton("Start");
    private JButton jButton2 = new JButton("Stop");

    private Runnable thread1 = new Runnable() {
    @Override
    public void run() {
        while (true) {//enquanto for verdadeiro ficará rodando
            mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
            format(Calendar.getInstance().getTime()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }        
    };


    private Runnable thread2 = new Runnable() {
        @Override
        public void run() {
            while (true) {//enquanto for verdadeiro ficará rodando
                mostraTempo2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").
                format(Calendar.getInstance().getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }        
        };


    //instanciar o objeto  para ser acessively
       private Thread thread1Time;
       private Thread thread2Time;


    //construtor
    public TelaTime() { //executa o que estiver dentro no momento da abertura
        setTitle("Execução das Threads");
        setSize(new Dimension(300,300));
        setLocationRelativeTo(null);
        setResizable(false);
   
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0; // vai mover em x
        gridBagConstraints.gridy= 0; // vai mover em y
        gridBagConstraints.gridwidth =2;
        gridBagConstraints.insets = new Insets(5, 10, 5, 5);
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        descricaoHora.setPreferredSize(new Dimension(200, 25));
        jPanel.add(descricaoHora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        mostraTempo.setEditable(false);
        jPanel.add(mostraTempo, gridBagConstraints);     

        descricaoHora2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(descricaoHora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        mostraTempo2.setEditable(false);
        jPanel.add(mostraTempo2, gridBagConstraints);

        gridBagConstraints.gridwidth = 1;
        jButton.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(jButton, gridBagConstraints);

        jButton2.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridx ++;
        jPanel.add(jButton2, gridBagConstraints);

        //ação do botão
        jButton.addActionListener((ActionListener) new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                thread1Time = new Thread(thread1);
                thread1Time.start();
                thread2Time = new Thread(thread2);
                thread2Time.start();
                //habilitar e desahibiltar botões
                jButton.setEnabled(false);
                jButton2.setEnabled(true);
            }
        });

        jButton2.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread1Time.stop();
                thread2Time.stop();
                //habilitar e desahibiltar botões
                jButton.setEnabled(true);
                jButton2.setEnabled(false);
            }
        });

      

        add(jPanel, BorderLayout.WEST);

    

        // sempre será o ultimo comando
        setVisible(true); 
    }
}
