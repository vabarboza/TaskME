package com.br.taskme.service;

import com.br.taskme.models.Usuario;
import com.br.taskme.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioServiceImp implements UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public Usuario addUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    
    @Override
    public List<Usuario> listUsuario() {
        return usuarioRepository.findAll();
    }
    
    @Override
    public Optional<Usuario> listUsuarioId(Integer integer) {
        return usuarioRepository.findById(integer);
    }
    
    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    
    @Override
    public void deleteUsuarioId(Integer idUsuario) {
        usuarioRepository.deleteById(idUsuario);
    }
    
}
