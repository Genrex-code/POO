package edu.jairo.ramirez.actividades.avance.data;
import java.util.ArrayList;
import java.util.List;
//datos de los usarios guardados
/*
 * clase que gestiona el amacenamiento y la consulta de los usuarios registrados 
 * y los guardara en un formato de lista
 * agregarusuarios:agrega usuarios a la lista en un formato que incluye id y nombre de usuario ademas de eso
 * si ya esta el usuario registrado no se agregara para evitar copias 
 */
public class UsuariosGuardados {
    private List<Usuario> usuarios = new ArrayList<>();
    
    public void agregarUsuario(Usuario usuario) { usuarios.add(usuario); }
    public Usuario buscarUsuario(String id) {
        return usuarios.stream().filter(usuario -> usuario.getId().equals(id)).findFirst().orElse(null);
    }
}

