package br.com.unipar.jogoadivinhacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Juliane
 */
public class Menu extends JFrame {
    
    private JPanel panel1;
    private JPanel panel2;
    
    public Menu() {
        setTitle("Menu");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Criando os painéis
        panel1 = new Panel1();
        panel2 = new Panel2();
        
        // Criando a barra de menu
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menuExemplo = new JMenu("Exemplo");
        
        JMenuItem itemExemplo = new JMenuItem("Item Exemplo");
        
        menuExemplo.add(itemExemplo);
        menuBar.add(menuExemplo);
        
        
        
        JMenu menu1 = new JMenu("Menu 1");
        JMenu menu2 = new JMenu("Menu 2");
        
        JMenuItem menuItem1 = new JMenuItem("Abrir Panel 1");
        JMenuItem menuItem2 = new JMenuItem("Abrir Panel 2");
        
        menuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirPanel(panel1);
            }
        });
        
        menuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirPanel(panel2);
            }
        });
        
        menu1.add(menuItem1);
        menu2.add(menuItem2);
        
        menuBar.add(menu1);
        menuBar.add(menu2);
        
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
