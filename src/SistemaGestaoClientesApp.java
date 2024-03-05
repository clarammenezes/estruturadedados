import javax.swing.*;

public class SistemaGestaoClientesApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SistemaGestaoClientesPanel panel = new SistemaGestaoClientesPanel();
            JFrame frame = new JFrame("Sistema de Gestão de Clientes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            panel.setListaContatosCallback(contatos -> {
                ListaContatosFrame listaContatosFrame = new ListaContatosFrame(contatos);
                listaContatosFrame.setVisible(true);
            });
        });
    }
}
