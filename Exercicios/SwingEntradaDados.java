import javax.swing.JOptionPane;

public class SwingEntradaDados {
    public static void main(String[] args) {

String carros = JOptionPane.showInputDialog("Digite a quantidade de carros:");
String pessoas = JOptionPane.showInputDialog("Digite a quantidade de pessoas:");

Double carroNumero = Double.parseDouble(carros);
Double pessoaNumero = Double.parseDouble(pessoas);

int divisao = (int) (carroNumero / pessoaNumero);

double resto = carroNumero % pessoaNumero;


JOptionPane.showMessageDialog(null, "A divisão para pessoas deu " + divisao + " carros e sobrou " + resto + " carros");

    }
}
