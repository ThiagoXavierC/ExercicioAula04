import javax.swing.JOptionPane;

public class ValoresInteiros {
    public static void main(String[] args) throws NumberFormatException {
        int valorA = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int valorB = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));

        int resultado = valorA * valorB;

        JOptionPane.showMessageDialog(null, "Resultado Final: " + resultado);
    }
}
