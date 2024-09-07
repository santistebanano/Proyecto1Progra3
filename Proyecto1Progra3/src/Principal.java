import Presentacion.View;

import javax.swing.*;
import java.awt.*;

public class Principal {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {}

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tabbedPane = new JTabbedPane();

        View facturarView= new View();

        Icon facturarIcon = new ImageIcon(Principal.class.getResource("carrito-de-compras.png"));
        tabbedPane.addTab("Facturar ", facturarIcon, facturarView.getPanel());

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(tabbedPane, BorderLayout.CENTER);

        window.getContentPane().add(mainPanel);
        window.setSize(800, 500);
        window.setResizable(true);
        window.setIconImage(new ImageIcon(Principal.class.getResource("calculadora.png")).getImage());
        window.setTitle("POS: Point Of Sale");
        window.setVisible(true);
    }
}
