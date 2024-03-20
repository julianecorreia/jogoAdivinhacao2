package br.com.unipar.jogoadivinhacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Juliane
 */
public class Menu extends JFrame {

    private JPanel panelDinamicaIntrodutoria;
    private JPanel panelCalcularMedia;
    private JPanel panelTextDemo;
    private JPanel panelEventoMouseTeclado;
    
    private JPanel panelCadastrarCliente;

    public Menu() {
        setTitle("Menu");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        // Instanciando os painéis
        panelDinamicaIntrodutoria = new DinamicaIntrodutoria();
        panelCalcularMedia = new CalcularMedia();
        panelTextDemo = new TextDemo();
        panelEventoMouseTeclado = new EventosMouseTeclado();
        panelCadastrarCliente = new CadastrarClientePanel();

        // Criando a barra de menu
        JMenuBar menuBar = new JMenuBar();

        //Menu de Exercícios
        JMenu menuExercicios = new JMenu("Exercícios");
        
        //Itens do Menu de Exercícios
        JMenuItem dinamica = new JMenuItem("Dinâmica Introdutória");
        JMenuItem calcularMedia = new JMenuItem("Calcular Média");
        JMenuItem textDemo = new JMenuItem("Text Demo");
        JMenuItem eventoMouseTeclado = new JMenuItem("Evento Mouse/Teclado");

        //Adiciona os menus itens no menu pai
        menuExercicios.add(dinamica);
        menuExercicios.add(calcularMedia);
        menuExercicios.add(textDemo);
        menuExercicios.add(eventoMouseTeclado);
        
        //Adiciona o menu pai no menubar
        menuBar.add(menuExercicios);

        //Menu Mensagens JOptionPane
        JMenu menuMensagens = new JMenu("Mensagens");
        
        //Itens Mensagens JOptionPane
        JMenuItem mensagemWarning = new JMenuItem("Warning");
        JMenuItem mensagemError = new JMenuItem("Error");
        JMenuItem mensagemQuestion = new JMenuItem("Question");
        JMenuItem mensagemInformation = new JMenuItem("Information");
        
        //Adiciona os itens menu no menu pai
        menuMensagens.add(mensagemWarning);
        menuMensagens.add(mensagemError);
        menuMensagens.add(mensagemQuestion);
        menuMensagens.add(mensagemInformation);
        
        //Adiciona o menu pai no menu bar
        menuBar.add(menuMensagens);
        
        
        //Criar Menu Cadastro
        JMenu menuCadastro = new JMenu("Cadastros");
        
        //Criar Menu Cliente dentro do Menu Cadastro
        JMenu menuCliente = new JMenu("Cliente");
        
        //Criar menus de cadastro e lista de clientes
        JMenuItem cadastrarCliente = new JMenuItem("Cadastrar");
        JMenuItem listarCliente = new JMenuItem("Listar");
        
        //Adicionar menus de cadastro no menu Cliente
        menuCliente.add(cadastrarCliente);
        menuCliente.add(listarCliente);
        
        //Adicionar o menu Cliente no menu Cadastro
        menuCadastro.add(menuCliente);
        
        menuBar.add(menuCadastro);
        

        //Abrir exercícios
        dinamica.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirPanel(panelDinamicaIntrodutoria);
            }
        });
        calcularMedia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirPanel(panelCalcularMedia);
            }
        });
        textDemo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirPanel(panelTextDemo);
            }
        });
        eventoMouseTeclado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirPanel(panelEventoMouseTeclado);
            }
        });
        
        //Adiciona JOptionPane Mensagens
        mensagemWarning.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, 
                        "Warning", "Atenção",
                        JOptionPane.WARNING_MESSAGE, null);
         
            }
        });
        //TODO resto das mensagens!
        
         //Adiciona ações menus clientes
        cadastrarCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirPanel(panelCadastrarCliente);
            }
        });


        setJMenuBar(menuBar);
    }

    private void abrirPanel(JPanel panel) {
        getContentPane().removeAll();
        getContentPane().add(panel);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Menu menu = new Menu();
                menu.setVisible(true);
            }
        });
    }
}
