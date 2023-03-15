import javax.swing.*;

public class TesteJFrame {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Interface Grafica");
        JButton botao = new JButton("Botao do Swing");
        JLabel texto = new JLabel("Numero de clicks: 0");

        JPanel painel = new JPanel();
        painel.add(botao);
        painel.add(texto);
        janela.getContentPane().add(painel);
        janela.setSize(500,400);
        janela.show();
    }
}
