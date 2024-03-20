package br.com.unipar.desktop.view.tablemodels;

import br.com.unipar.desktop.model.Cliente;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ClienteTableModel extends DefaultTableModel {

    //titulos colunas
    public ClienteTableModel() {
        this.addColumn("Nome");
        this.addColumn("Telefone");
        this.addColumn("Endereço");
        this.addColumn("Ativo");
    }
    
    public ClienteTableModel(List<Cliente> listCliente) {
        this();
        
        for (Cliente cliente : listCliente) {
            this.addRow(new String[] {
                cliente.getNome(),
                cliente.getTelefone(),
                cliente.getEndereco(),
                cliente.getAtivo() ? "Ativo" : "Inativo"});
        }
    }
    
    public Cliente getSelectedCliente(JTable table, 
            List<Cliente> clientes) {
        //TODO
        return null;
    }
}
