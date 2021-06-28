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

    private JLabel descricaoHora = new JLabel("Name");
    private JTextField mostraTempo = new JTextField();

    private JLabel descricaoHora2 = new JLabel("Email");
    private JTextField mostraTempo2 = new JTextField();

    private JButton jButton = new JButton("Add List");
    private JButton jButton2 = new JButton("Stop");

    private ImplementarFilaThread fila = new ImplementarFilaThread();

  


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
        jPanel.add(mostraTempo, gridBagConstraints);     

        descricaoHora2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(descricaoHora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(mostraTempo2, gridBagConstraints);

        gridBagConstraints.gridwidth = 1;
        jButton.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(jButton, gridBagConstraints);

        jButton2.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridx ++;
        jPanel.add(jButton2, gridBagConstraints);

        //ação do botão
        jButton.addActionListener((ActionListener) new ActionListener() { //simulando 100 envios de email em massa.
            @Override
            public void actionPerformed(ActionEvent e) {

                if(fila == null){
                    fila = new ImplementarFilaThread();//vai continuar a rodar.....ao clicar no stop, pára e ao clicar no start, volta a correr da onde parou.
                    fila.start();
                }

                for(int quant=0; quant<100; quant++) {

             ObjetoFilaThread filaThread = new ObjetoFilaThread();
             filaThread.setNome("Nome: " + mostraTempo.getText());
             filaThread.setEmail("Email: " + quant + " - " + mostraTempo2.getText());

            fila.add(filaThread);
               
        }
            }
        });

        jButton2.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fila.stop();
                fila = null;
            }
        });

        fila.start();
        add(jPanel, BorderLayout.WEST);
        // sempre será o ultimo comando
        setVisible(true); 
    }
}
