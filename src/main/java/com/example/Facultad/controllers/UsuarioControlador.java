
package com.example.Facultad.controllers;



import com.example.Facultad.dao.UsuarioDao;
import com.example.Facultad.models.Usuario;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UsuarioControlador {
    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value="listar/usuarios")
    public List<Usuario> listarUsuarios(){
        List<Usuario> usuarios= new ArrayList<>();
        
        
       Usuario usuario1= new Usuario(); 
       usuario1.setApellido("Zoni");
       usuario1.setNombre("Florencia");
       usuario1.setEmail("florzoni@gmail.com");
       usuario1.setTelefono("4551422");
       usuario1.setPassword("12345");
       
       Usuario usuario2= new Usuario(); 
       usuario2.setApellido("Zoni");
       usuario2.setNombre("Gianluca");
       usuario2.setEmail("gianzoni@gmail.com");
       usuario2.setTelefono("4551422");
       usuario2.setPassword("12345");  
       
         Usuario usuario3= new Usuario(); 
       usuario3.setApellido("Zoni");
       usuario3.setNombre("Candy");
       usuario3.setEmail("florzoni@gmail.com");
       usuario3.setTelefono("4551422");
       usuario3.setPassword("n123456");
       
       usuarios.add(usuario1);
       usuarios.add(usuario2);
       usuarios.add(usuario3);
       return usuarios; 
        
    }
    
    @RequestMapping(value="persona")
    public List<String> listarPersonas(){
        
        return List.of("florencia","candy","gianluca");
        
    }
    
    
    @RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuario(){
		List<Usuario> user = usuarioDao.obtenerUsuarios();
		return user;
	}
}
