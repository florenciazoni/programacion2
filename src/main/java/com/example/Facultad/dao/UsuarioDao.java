
package com.example.Facultad.dao;

import com.example.Facultad.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@PersistenceContext
public class UsuarioDao implements IUsuarioDao{

    private EntityManager entityManager; 
    
    @Override
    public List<Usuario> obtenerUsuarios() {
     String query = "from Usuario"; 
     List<Usuario> resultado= entityManager.createQuery(query).getResultList();
     return resultado; 
    }
    
}
