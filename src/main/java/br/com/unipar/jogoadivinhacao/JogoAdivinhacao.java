package br.com.unipar.jogoadivinhacao;

import javax.swing.JOptionPane;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        
        Object[] options = {"Sim, vamos lá",
            "Não, obrigado",
            "Talvez seja uma boa ideia"};
        
        int n =
            JOptionPane.showOptionDialog(null, 
                    "Vamos sair para comer uma pizza hoje?", 
                    "Uma pergunta qualquer", JOptionPane.YES_NO_CANCEL_OPTION,  
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
    }
}
