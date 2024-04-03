package br.com.unipar.desktop.dao;

import br.com.unipar.desktop.model.Cliente;
import java.util.List;


public interface ClienteDAO {
    
    Cliente save(Cliente cliente);
    Cliente update(Cliente cliente);
    Boolean delete(Cliente cliente);
    
    Cliente findById(Integer id); 
    List<Cliente> findAll();
    
}
