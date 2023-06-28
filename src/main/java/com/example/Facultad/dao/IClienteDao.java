
package com.example.Facultad.dao;

import com.example.Facultad.models.Cliente;
import jakarta.transaction.Transactional;
import java.util.List;



@Transactional
public interface IClienteDao {
    List<Cliente> obtenerCliente();
    
}
