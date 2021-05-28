import javax.swing.JOptionPane;

public class CalculoMediaSwing {
    public static void main(String[] args) {

        String nota1 = JOptionPane.showInputDialog(null, "Digite a 1ª nota:");
        String nota2 = JOptionPane.showInputDialog(null, "Digite a 2ª nota:");
        String nota3 = JOptionPane.showInputDialog(null, "Digite a 3ª nota:");
        String nota4 = JOptionPane.showInputDialog(null, "Digite a 4ª nota:");

        double dnota1 = Double.parseDouble(nota1);
        double dnota2 = Double.parseDouble(nota2);
        double dnota3 = Double.parseDouble(nota3);
        double dnota4 = Double.parseDouble(nota4);

        double media = (dnota1 + dnota2 + dnota3 + dnota4) / 4 ;

        if(media >= 50) {
          if(media >= 70) {
              JOptionPane.showMessageDialog(null, "Aluno aprovado com media de " + media );
          }else{
              JOptionPane.showMessageDialog(null, "Aluno em recuperação com media de  " + media );
          }
            }else{
              JOptionPane.showMessageDialog(null, "Aluno reprovado com media de " + media);
          }
        
        
        


    }
}
