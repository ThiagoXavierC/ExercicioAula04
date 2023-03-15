import javax.swing.JOptionPane;

public class GeraMedia {
    public static void main(String[] args) {
        float nota1, nota2, media;

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));

        media = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(null,"A media eh: " + media);
    }

}
