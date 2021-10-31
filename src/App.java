import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
    double hipo;

    String cateto1 = JOptionPane.showInputDialog(null, "Digite o valor do primeiro cateto: ", "Catetos", JOptionPane.QUESTION_MESSAGE);
    String cateto2 = JOptionPane.showInputDialog(null, "Digite o valor do segundo cateto: ", "Catetos", JOptionPane.QUESTION_MESSAGE);
    double cateto1s = Double.parseDouble(cateto1);
    double cateto2s = Double.parseDouble(cateto2);
    
    hipo = Math.sqrt(Math.pow(cateto1s, 2)+ Math.pow(cateto2s, 2));
    String msg = String.format("%.2f", hipo);
    
    JOptionPane.showMessageDialog(null, "A hipotenusa é: " + msg, "Hipotenusa", JOptionPane.INFORMATION_MESSAGE);
    }
}
