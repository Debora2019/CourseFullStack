package Thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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


    //construtor
    public TelaTime() { //executa o que estiver dentro no momento da abertura
        setTitle("Execução das Threads");
        setSize(new Dimension(300,300));
        setLocationRelativeTo(null);
        setResizable(false);
   
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy= 0;

        descricaoHora.setPreferredSize(new Dimension(200, 25));
        jPanel.add(descricaoHora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(mostraTempo, gridBagConstraints);

        add(jPanel, BorderLayout.WEST);

        descricaoHora2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(descricaoHora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(mostraTempo2, gridBagConstraints);
        setVisible(true); // sempre será o ultimo comando
    }
   
//TERMINEI O MODULO 14.7

}
