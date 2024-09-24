package crm.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView {
    private JFrame frame;
    private JPanel panel;
    private JButton clienteButton;
    private JButton servicoButton;
    private JButton agendamentoButton;

    public MainView() {
        // Inicializa o JFrame
        frame = new JFrame("CRM do Salão da Rayara");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Cria o JPanel
        panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Layout horizontal

        // Cria botões para as views
        clienteButton = new JButton("Gerenciar Clientes");
        servicoButton = new JButton("Gerenciar Serviços");
        agendamentoButton = new JButton("Gerenciar Agendamentos");

        // Adiciona botões ao painel
        panel.add(clienteButton);
        panel.add(servicoButton);
        panel.add(agendamentoButton);

        // Adiciona painel ao frame
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        // Ações dos botões
        clienteButton.addActionListener(e -> openClienteView());
        servicoButton.addActionListener(e -> openServicoView());
        agendamentoButton.addActionListener(e -> openAgendamentoView());

        // Exibe o frame
        frame.setVisible(true);
    }

    private void openClienteView() {
        // Abre a view de clientes
        new ClienteView();
    }

    private void openServicoView() {
        // Abre a view de serviços
        new ServicoView();
    }

    private void openAgendamentoView() {
        // Abre a view de agendamentos
        new AgendamentoView();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainView());
    }
}
