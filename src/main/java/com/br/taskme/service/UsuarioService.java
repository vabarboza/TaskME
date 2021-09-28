package com.br.taskme.service;

import com.br.taskme.models.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    public Usuario addUsuario(Usuario usuario);

    public List<Usuario> listUsuario();

    public Optional<Usuario> listUsuarioId(Integer integer);

    public Usuario updateUsuario(Usuario usuario);

    public void deleteUsuarioId(Integer idUsuario);
}
