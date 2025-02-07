package edu.jairo.ramirez.actividades.avance.data;
import java.util.ArrayList;
import java.util.List;
//datos de los usarios guardados
public class UsuariosGuardados {
    private List<Usuario> usuarios = new ArrayList<>();
    
    public void agregarUsuario(Usuario usuario) { usuarios.add(usuario); }
    public Usuario buscarUsuario(String id) {
        return usuarios.stream().filter(usuario -> usuario.getId().equals(id)).findFirst().orElse(null);
    }
}

